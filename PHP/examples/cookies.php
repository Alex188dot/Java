<?php 

    // To create a cookie, use setcookie(). Also, you need to indicate the lifetime as follows: seconds * minutes * hours * days.

    // To have a cookie that will remember the user background color, use the following code:

    setcookie("bg_body", "red", time() + 60 * 60 * 24 * 365); // this sets the cookie to expire in one year

    setcookie("username", "admin", time() + 60 * 60 * 24 * 365);

?>

<h1>Cookies Test</h1>