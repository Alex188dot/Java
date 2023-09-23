<?php

$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    echo "Connection failed: " . $conn->connect_error;
} else {
    echo "Connection successful!";
}

$name = "John";
$lastname = "Doe";
$age = 30;
$city = "New York";
$office_id = 1;

$query = "INSERT INTO users VALUES(NULL, '$name', '$lastname', '$city', $age, $office_id);";


$result = $conn->query($query); // Call the query method once and store the result

if ($result === true) { // Check the result and handle success
    echo "New record created successfully";
    echo "The id is: " . $conn->insert_id;
} else { // Handle error
    echo "Error: " . $query . "<br>" . $conn->error;
}
?>
