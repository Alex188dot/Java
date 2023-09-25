<?php


$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    echo "Connection failed: " . $conn->connect_error;
} 

$name = $_POST["name"];
$lastname = $_POST["lastname"];
$city = $_POST["city"];
$age = intval($_POST['age']);
$office_id = intval($_POST['office']);

$query = "INSERT INTO users VALUES(NULL, '$name', '$lastname', '$city', $age, $office_id);";


$result = $conn->query($query);

if ($result === TRUE) {
    header("Location: base.php");
} else {
    echo "Error: " . $conn->error;
}

?>
