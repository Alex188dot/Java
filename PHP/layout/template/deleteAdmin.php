<?php 

    session_start();
    if((!$_SESSION["loggedIn"] == "ok")) {
        header("Location: login.php");
    }

    $user = $_GET["id"];

    $conn = new mysqli("localhost", "root", "root", "javaDB");

    $query = "DELETE FROM admins WHERE id = $user";
    $result = $conn->query($query);
    if ($result === TRUE) {
        header("Location: base2.php?outcome=2");
    } else {
        echo "No records found.";    
    }
?>