<?php

$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    echo "Connection failed: " . $conn->connect_error;
} else {
    echo "Connection successful!";
}

$name = "John";
$lastname = "Doe";
$city = "New York";
$age = 30;
$office_id = 1;

$query = "INSERT INTO users VALUES(NULL, '$name', '$lastname', '$city', $age, $office_id);";


$result = $conn->query($query);

if ($result === true) { 
    echo "New record created successfully";
    echo "The id is: " . $conn->insert_id;
} else { 
    echo "Error: " . $query . "<br>" . $conn->error;
}
?>
