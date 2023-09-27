<?php 

    session_start();
    if((!$_SESSION["loggedIn"] == "ok")) {
        header("Location: login.php");
    }
    ?>
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
        td {
            vertical-align: middle;
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
            echo "<div class='container'>";
            echo "<h2 class='text-center mt-4 mb-4'>" . ucwords($row["name"]) . " " . ucwords($row["lastname"]) ."</h2>";
            echo "<div class='row'>";
            echo "<div class='col-md-6'>";
            echo "<p><strong>First name:</strong> " . ucwords($row["name"]) . "</p>";
            echo "<p><strong>Last name:</strong> " . ucwords($row["lastname"]) . "</p>";
            echo "<p><strong>Age:</strong> " . $row["age"] . "</p>";
            echo "<p><strong>City:</strong> " . ucwords($row["city"]) . "</p>";
            echo "<p><strong>Office:</strong> " . ucwords($row["office_name"]) . "</p>";
            echo "</div>";
            echo "<div class='col-md-6'>";
            echo "<p><strong>Profile picture:</strong></p>";
            echo "<img src='profile_pics/" . $row["profile_img"] . "' width='100' height='100'>";
            echo "</div>";
            echo "</div>";
            echo "</div>";
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