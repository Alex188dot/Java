<?php 

if (isset($_COOKIE["bg_body"])) {
    echo $_COOKIE["bg_body"];
}

if (isset($_COOKIE["username"])) {
    echo "Hi, " . $_COOKIE["username"];
    } else {
    echo "Welcome guest!";
    }

?>