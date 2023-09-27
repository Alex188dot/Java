<?php 

$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    echo "Connection failed: " . $conn->connect_error;
} 

$email = $_POST["email"];
$password = md5($_POST["password"]);

$sql = "SELECT * FROM admins WHERE email='$email' AND pwd='$password'";

$result = $conn->query($sql);

if ($result->num_rows > 0) {
    $row = $result->fetch_assoc();
    session_start();
    $_SESSION["loggedIn"] = "ok";
    $_SESSION["id"] = $row["id"];
    $_SESSION["email"] = $row["email"];
    $_SESSION["name"] = $row["name"];
    header("Location: viewAllEmployees.php");
} else {
echo "Wrong email or password";
}


?>