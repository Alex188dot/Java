<?php

    $conn = new mysqli("localhost", "root", "root", "javaDB");

    if ($conn->connect_error) {
        error_log("Connection failed: " . $conn->connect_error);
    } else {
        error_log("Connection successful!");
    }

    $usersResult = $conn->query("SELECT users.id, users.name, users.lastname, offices.name as offices FROM users INNER JOIN offices ON users.office_id = offices.id;");

    if ($usersResult->num_rows > 0) {
        echo "<h1 class='text-center mt-2 mb-2'>All Employees</h1>";
        echo "<table class='table'>";
        echo "<thead>";
        echo "<tr>";
        echo "<th class='text-center' scope='col'>First name</th>";
        echo "<th class='text-center' scope='col'>Last name</th>";
        echo "<th class='text-center' scope='col'>Office</th>";
        echo "<th class='text-center' scope='col'>Actions</th>";
        echo "</tr>";
        echo "</thead>";
        echo "<tbody>";

        while ($row = $usersResult->fetch_assoc()) {
            echo "<tr>";
            echo "<td class='text-center'>" . ucwords($row["name"]) . "</td>";
            echo "<td class='text-center'>" . ucwords($row["lastname"]) . "</td>";
            echo "<td class='text-center'>" . ucwords($row["offices"]) . "</td>";
            echo "<td class='text-center'><a href='userDetails.php?id=" . $row["id"] . "'><i class='bi bi-person'></i></a> | <a class='orangeIcon' href='updateUser.php?id=" . $row["id"] . "'><i class='bi bi-pencil-square'></i></a> | <a class='redIcon' href='deleteUser.php?id=" . $row["id"] . "'><i class='bi bi-trash-fill'></i></a></td>";
            echo "</tr>";
        }
    } else {
        echo "<tr><td colspan='4'>No results found.</td></tr>";
    }
    

    $conn->close();
?>