<?php
$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$name = $_POST["name"];
$lastname = $_POST["lastname"];
$city = $_POST["city"];
$age = intval($_POST['age']);
$office_id = intval($_POST['office_id']);

$user = intval($_POST['id']);


$query = "UPDATE users SET name='$name', lastname='$lastname', city='$city', age=$age, office_id=$office_id WHERE id=$user";

if ($conn->query($query) === FALSE) {
    echo "Error updating user: " . $conn->error;
} else {
    header("Location: base.php");
}

echo $query;

$conn->close();
?>