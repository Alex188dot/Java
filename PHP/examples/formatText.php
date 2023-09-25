
<?php

function formatText($str) {
    $str = trim($str);
    $str = ucwords($str);
}

function isPalindrome($str) {
    if (strrev($str) == $str) {
        return true; // true will return 1
    } else {
        return false; // false will return 0 (but will print nothing)
    }
}

?>