<?php 

$name = "John";

echo $name . "<br>";

// Length of string
echo strlen($name) . "<br>";

// Words in string
echo str_word_count($name) . "<br>";

// Uppercase
echo strtoupper($name) . "<br>";

// Lowercase
echo strtolower($name) . "<br>";

// Capitalize (all words in a sentence) 
echo ucwords($name) . "<br>";

// Capitalize first letter of first word
echo ucfirst($name) . "<br>";

// Replace
echo str_replace("John", "Jane", $name) . "<br>";

// Reverse
echo strrev($name) . "<br>";

// Print first letter of a string
echo substr($name, 0, 1) . "<br>";

// Print last letter of a string
echo substr($name, -1) . "<br>";


$students = "John, Jane, Bob, Bill, Mary, Tom";

// Search for index of a string
echo strpos($students, "Bob") . "<br>";

// Search for actual word in string. It will return the index if found, false if not found
echo stripos($students, "Bob") . "<br>";

// Trim
echo trim("  Hello  ") . "<br>";

// Explode
for ($i = 0; $i < count(explode(" ", $students)); $i++) {
    echo $i . ": " . explode(" ", $students)[$i] . "<br>";
}

// Password management

// PASSWORD_DEFAULT
echo password_hash("123456", PASSWORD_DEFAULT) . "<br>";

// MD5 Algorithm
echo md5("123456") . "<br>";

// SHA1 Algorithm
echo sha1("123456") . "<br>";

?>