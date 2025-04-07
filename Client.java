import java.io.*;
import java.net.*;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

    public void start() {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String userName = in.readLine();
            out.println(userName);

            new Thread(new ReadMessage()).start();

            String message;
            while ((message = in.readLine()) != null) {
                out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeConnections();
        }
    }

    private void closeConnections() {
        try {
            if (in != null) in.close();
            if (out != null) out.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ReadMessage implements Runnable {
        private BufferedReader serverIn;

        @Override
        public void run() {
            try {
                serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message;
                while ((message = serverIn.readLine()) != null) {
                    System.out.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (serverIn != null) serverIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
