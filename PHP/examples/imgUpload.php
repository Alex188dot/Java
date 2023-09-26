<?php 

    $file_name = $_FILES["file"]["name"];
    echo $file_name;
    echo "<br>";
    
    $file_size = $_FILES["file"]["size"];
    echo $file_size;
    echo "<br>";

    // To know the file type
    $file_type = pathinfo($_FILES["file"]["name"], PATHINFO_EXTENSION);
    echo $file_type;

    echo "<br>";
    if ($file_type == "jpg" || $file_type == "png" || $file_type == "jpeg" || $file_type == "svg") {
        move_uploaded_file($_FILES["file"]["tmp_name"], "uploads/" . $file_name);
    } else {
        echo "Invalid file type.";
    }

?>