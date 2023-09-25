<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Employees</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <style>
        table {
            margin-top: 1rem;
        }
    </style>
</head>
<body>
<?php include("navbar.php"); ?>
<!-- body -->
<div class="container">
    <?php 
    $user = $_GET["id"];
    $conn = new mysqli("localhost", "root", "root", "javaDB");
    $query = "SELECT users.*, offices.name AS office_name FROM users 
              INNER JOIN offices ON users.office_id = offices.id
              WHERE users.id = $user";
    $result = $conn->query($query);
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "<h2 class='text-center mt-2 mb-2'>" . ucwords($row["name"]) . ucwords($row["lastname"]) ."</h2>";
            echo "<table class='table'>";
            echo "<thead>";
            echo "<tr>";
            echo "<th scope='col'>First name</th>";
            echo "<th scope='col'>Last name</th>";
            echo "<th scope='col'>Age</th>";
            echo "<th scope='col'>City</th>";
            echo "<th scope='col'>Office</th>";
            echo "</tr>";
            echo "</thead>";
            echo "<tbody>";
            echo "<tr>";
            echo "<td>" . ucwords($row["name"]) . "</td>";
            echo "<td>" . ucwords($row["lastname"]) . "</td>";
            echo "<td>" . $row["age"] . "</td>";
            echo "<td>" . ucwords($row["city"]) . "</td>";
            echo "<td>" . ucwords($row["office_name"]) . "</td>";
            echo "</tr>";
            echo "</tbody>";
            echo "</table>";
        }
    } else {
        echo "No records found.";    
    }
    $conn->close();
    ?>

</div>
<!-- end body  -->
<?php include("footer.php"); ?>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>