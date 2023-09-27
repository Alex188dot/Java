<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Admin</title>
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
$query = "SELECT * FROM admins WHERE id = $user";
$result = $conn->query($query);
if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        echo "<h2 class='text-center mt-2 mb-2'>Update User: " . ucwords($row["name"]) . " " . ucwords($row["lastname"]) . "</h2>";
        echo "<form method='POST' action='updateAdminAction2.php'>";
        echo "<div class='mb-3'>";
        echo "<label for='name' class='form-label'>First name</label>";
        echo "<input type='text' name='name' class='form-control' value='" . $row["name"] . "'>";
        echo "</div>";
        echo "<div class='mb-3'>";
        echo "<label for='lastname' class='form-label'>Last name</label>";
        echo "<input type='text' name='lastname' class='form-control' value='" . $row["lastname"] . "'>";
        echo "</div>";
        echo "<div class='mb-3'>";
        echo "<label for='email' class='form-label'>Email</label>";
        echo "<input type='text' name='email' class='form-control' value='" . $row["email"] . "'>";
        echo "</div>";
        echo "<div class='mb-3'>";
        echo "<label for='password' class='form-label'>Password</label>";
        echo "<input type='password' name='pwd' class='form-control' value='" . $row["pwd"] . "'>";
        echo "</div>";
        echo "<div class='mb-3'>";
        echo "<label for='new_password' class='form-label'>New Password</label>";
        echo "<input type='password' name='pwd1' class='form-control'>";
        echo "</div>";
        echo "<div class='mb-3'>";
        echo "<label for='confirm_password' class='form-label'>Confirm New Password</label>";
        echo "<input type='password' name='pwd2' class='form-control'>";
        echo "</div>";
        echo "<input type='hidden' name='id' value='" . $row["id"] . "'>";
        echo "<button type='submit' class='btn btn-primary'>Update</button>";
        echo "</form>";
    }
} else {
    echo "No records found.";    
}
?>

</div>
<!-- end body  -->
<?php include("footer.php"); ?>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>