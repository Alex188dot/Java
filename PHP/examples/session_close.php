<?php 

session_start();

session_destroy();

// This code will not be executed, because the session has been closed
echo $_SESSION["name"] . " " . $_SESSION["lastname"];


echo "Session closed!";
?>