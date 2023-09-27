<?php
$conn = new mysqli("localhost", "root", "root", "javaDB");

if ($conn->connect_error) {
    error_log("Connection failed: " . $conn->connect_error);
} else {
    error_log("Connection successful!");
}

$adminResult = $conn->query("SELECT * FROM admins;");

if ($adminResult->num_rows > 0) {
    echo "<table class='table'>";
    echo "<thead>";
    echo "<tr>";
    echo "<th scope='col'>First name</th>";
    echo "<th scope='col'>Last name</th>";
    echo "<th scope='col'>Email</th>";
    echo "</tr>";
    echo "</thead>";
    echo "<tbody>";

    while ($admin = $adminResult->fetch_assoc()) {
        echo "<tr>";
        echo "<td>" . ucwords($admin["name"]) . "</td>";
        echo "<td>" . ucwords($admin["lastname"]) . "</td>";
        echo "<td>" . $admin["email"] . "</td>";
        echo "</tr>";
    }

    echo "</tbody>";
    echo "</table>";
} else {
    echo "No records found.";
}

$conn->close();
?>