<?php
$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$firstname = $_POST["name"];
$lastname = $_POST["lastname"];
$city = $_POST["city"];
$age = intval($_POST["age"]);
$office = intval($_POST["office_id"]);

$user = $_GET["id"];
$query = "UPDATE users SET name='$firstname', lastname='$lastname', city='$city', age='$age', office_id='$office' WHERE id='$user'";

if ($conn->query($query) === false) {
    echo "Error updating user: " . $conn->error;
} else {
    header("Location: base.php");
}

$conn->close();
?>