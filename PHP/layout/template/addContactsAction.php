<?php 

$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    error_log("Connection failed: " . $conn->connect_error);
} else {
    error_log("Connection successful!");
}


$contact_type = $_POST["contact_type"];
$contact = $_POST["contact_value"];
$user_id = $_POST["id"];

$query = "INSERT INTO contacts VALUES(NULL, '$contact_type', '$contact', $user_id);";

$result = $conn->query($query);

if ($result === TRUE) { 
    header("Location: addContacts.php?id=$user_id"); 
} else { 
    header("Location: addContacts.php?id=$user_id"); 
}


?>