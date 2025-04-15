<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EngTalk Login</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: url('![EngTalk-background](https://github.com/user-attachments/assets/d40afc4d-adac-4b2a-a814-aaeb2ee9ebe2)
') no-repeat center center/cover;
            font-family: 'Arial', sans-serif;
        }

        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.85);
            padding: 20px 40px;
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);
        }

        .logo {
            font-size: 3.5rem;
            font-weight: bold;
            color: #4CAF50;
            text-shadow: 0px 2px 4px rgba(0, 0, 0, 0.5);
            font-family: 'Comic Sans MS', cursive, sans-serif;
            margin-bottom: 30px;
        }

        .login-box {
            display: flex;
            flex-direction: column;
            margin-top: 20px;
        }

        .login-box input {
            margin-bottom: 15px;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 1rem;
        }

        .login-box button {
            padding: 12px;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
            font-size: 1.2rem;
            cursor: pointer;
            transition: 0.3s;
            margin-bottom: 10px;
        }

        .login-box button:hover {
            background-color: #45a049;
        }

        .create-account {
            color: #4CAF50;
            text-decoration: none;
            font-size: 1rem;
            font-weight: bold;
        }

        .create-account:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="logo">EngTalk</div>
        <form class="login-box">
            <input type="text" placeholder="Username" required>
            <input type="password" placeholder="Password" required>
            <button type="submit">Login</button>
        </form>
        <a href="create-account.html" class="create-account">Create an Account</a>
    </div>
</body>
</html>
