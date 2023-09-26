<?php 

// To start a session
session_start();

// Save some variables in the session
$_SESSION["name"] = "John";
$_SESSION["lastname"] = "Doe";

echo $_SESSION["name"] . " " . $_SESSION["lastname"];


?>