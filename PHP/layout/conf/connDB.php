<?php

$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    error_log("Connection failed: " . $conn->connect_error);
} else {
    error_log("Connection successful!");
}


?>
    
