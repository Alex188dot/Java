<?php
$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$name = $_POST["name"];
$lastname = $_POST["lastname"];
$email = $_POST["email"];
$pwd = md5($_POST['pwd']);

$user = intval($_POST['id']);


$query = "UPDATE admins SET name='$name', lastname='$lastname', email='$email', pwd='$pwd' WHERE id=$user";

$result = $conn->query($query);

if ($result === TRUE) { 
    $outcome = 1; 
    header("Location: base2.php?outcome=$outcome"); 
} else { 
    $outcome = 0; 
    header("Location: base2.php?outcome=$outcome"); 
}


?>