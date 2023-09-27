<?php 

    session_start();
    if((!$_SESSION["loggedIn"] == "ok")) {
        header("Location: login.php");
    }

    $user = $_GET["id"];

    $conn = new mysqli("localhost", "root", "root", "javaDB");


    $query = "SELECT * FROM users WHERE id = $user";
    $result = $conn->query($query);
    if ($result->num_rows > 0) {
        $row = $result->fetch_assoc();
        $profileImg = $row["profile_img"];

        if ($profileImg !== "profile_pic.jpeg") {
            $imagePath = "profile_pics/$profileImg";
            if (file_exists($imagePath)) {
                unlink($imagePath);
            }
        }
    }

    $query = "DELETE FROM users WHERE id = $user";
    $result = $conn->query($query);
    if ($result === TRUE) {
        header("Location: base.php?outcome=2");
    } else {
        echo "No records found.";    
    }
?>