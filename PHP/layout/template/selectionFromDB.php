<?php
    // Connection to the database

    // You will need 4 things:
    // 1. Your username
    // 2. Your password
    // 3. Your database name
    // 4. Your database server

    $conn = new mysqli("localhost", "root", "root", "javaDB");

    if ($conn->connect_error) {
        error_log("Connection failed: " . $conn->connect_error);
    } else {
        error_log("Connection successful!");
    }

    $usersResult = $conn->query("SELECT * FROM users");

    if ($usersResult->num_rows > 0) {
        $usersByOffice = array();

        while ($row = $usersResult->fetch_assoc()) {
            $officeId = $row["office_id"];

            if (!isset($usersByOffice[$officeId])) {
                $usersByOffice[$officeId] = array();
            }
            
            $usersByOffice[$officeId][] = $row;
        }

        foreach ($usersByOffice as $officeId => $usersInOffice) {
            $officeResult = $conn->query("SELECT name FROM offices WHERE id = $officeId");

            if ($officeResult->num_rows > 0) {
                $officeRow = $officeResult->fetch_assoc();
                $officeName = ucwords($officeRow["name"]);

                echo "<h2>" . $officeName . "</h2>";
                echo "<table class='table'>";
                echo "<thead>";
                echo "<tr>";
                echo "<th scope='col'>First name</th>";
                echo "<th scope='col'>Last name</th>";
                echo "<th scope='col'>Age</th>";
                echo "<th scope='col'>City</th>";
                echo "</tr>";
                echo "</thead>";
                echo "<tbody>";

                foreach ($usersInOffice as $user) {
                    echo "<tr>";
                    echo "<td>" . ucwords($user["name"]) . "</td>";
                    echo "<td>" . ucwords($user["lastname"]) . "</td>";
                    echo "<td>" . $user["age"] . "</td>";
                    echo "<td>" . ucwords($user["city"]) . "</td>";
                    echo "</tr>";
                }

                echo "</tbody>";
                echo "</table>";
            }
        }
    } else {
        echo "No records found.";
    }

    $conn->close();
?>