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
$profile_img = $_FILES["profile_img"]["name"];

$user = intval($_POST['id']);


    $file_type = pathinfo($_FILES["profile_img"]["name"], PATHINFO_EXTENSION);

    if ($file_type == "jpg" || $file_type == "png" || $file_type == "jpeg" || $file_type == "svg") {
        if (file_exists("profile_pics/" . $profile_img)) {
            $profile_img = "profile_pic.jpeg";
        } else {
            move_uploaded_file($_FILES["profile_img"]["tmp_name"], "profile_pics/" . $profile_img);
        }
    } 







$query = "UPDATE users SET name='$name', lastname='$lastname', city='$city', age=$age, office_id=$office_id, profile_img='$profile_img' WHERE id=$user";

$result = $conn->query($query);

if ($result === TRUE) { 
    $outcome = 1; 
    header("Location: base.php?outcome=$outcome"); 
    exit(); 
} else { 
    echo "Error: " . $query . "<br>" . $conn->error;
}

?>