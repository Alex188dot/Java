<?php

$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    echo "Connection failed: " . $conn->connect_error;
} 

$name = $_POST["name"];
$lastname = $_POST["lastname"];
$email = $_POST["email"];
$pwd = md5($_POST['pwd']);

$query = "INSERT INTO admins VALUES(NULL, '$name', '$lastname', '$email', '$pwd');";


$result = $conn->query($query);

if ($result === TRUE) { 
    $outcome = 1; 
    header("Location: base2.php?outcome=$outcome"); 
} else { 
    $outcome = 0; 
    header("Location: base2.php?outcome=$outcome"); 
}

?>
