<a href="https://www.google.com">Google</a>
<?php
// This code here is PHP, not HTML

$name = "John"; // this is a string variable
$lastname = "Doe";
$eta = 30; // Integer variable

$ar = ["John", "Michael", "Jane", "Mary"];
$ar_mixed = ["John", 44, true, "Mary", [1, "PHP", 3]];

//echo $ar_mixed[4][1];
echo $ar_mixed[0]."<br>";

// to concatenate use the . 

echo $name."<br>";
echo $name."<br>";

echo $name."<br>";


// To get the lenght of an array
echo count($ar);

// Push method



// How to visualize the whole array
print_r($ar);

?>