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
        h3, form, input, button {
            margin-top: 1rem;
            text-align: center;
        }
        label {
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
    $query = "SELECT * FROM users
              WHERE users.id = $user";
    $result = $conn->query($query);
    if ($result->num_rows > 0) {
        while ($row = $result->fetch_assoc()) {
            echo "<div class='container'>";
            echo "<h2 class='text-center mt-4 mb-4'>" . ucwords($row["name"]) . " " . ucwords($row["lastname"]) . "</h2>";
            echo "</div>";
        }
    } else {
        echo "No records found.";
    }

    $query = "SELECT * FROM contacts WHERE user_id = $user";
    $result = $conn->query($query);
    if ($result->num_rows > 0) {
        echo "<h3>Contacts</h3>";
        echo "<table class='table'>";
        echo "<thead>";
        echo "<tr>";
        echo "<th scope='col'>Type</th>";
        echo "<th scope='col'>Value</th>";
        echo "</tr>";
        echo "</thead>";
        echo "<tbody>";
        while ($row = $result->fetch_assoc()) {
            echo "<tr>";
            echo "<td>" . ucwords(str_replace("_", " ", $row["contact_type"])) . "</td>";
            echo "<td>" . $row["contact"] . "</td>";
            echo "</tr>";
        }
        echo "</tbody>";
        echo "</table>";
    }

    
    

?>

<div class="container" style="width: 30%;">
    <h3>Add Contact</h3>
    <form action="addContactsAction.php?id=<?php echo $user; ?>" method="post">
        <select name='contact_type' class='form-select'>
            <option value='' selected disabled>Choose type of contact</option>
            <option value='email'>Email</option>
            <option value='work_email'>Work Email</option>
            <option value='cell_phone'>Cell Phone</option>
            <option value='work_cell_phone'>Work Cell Phone</option>
        </select>
        <label for="contact_value">Insert contact: </label>
        <input type='text' name='contact_value' class='form-control'>
        <?php 
            $user = $_GET["id"];
            echo "<input type='hidden' name='id' value='" . $user . "'>";
        ?>
        <div class="d-flex justify-content-center">
        <button class="btn btn-success" type="submit">Add Contact</button>
        </div>
    </form>
</div>
</div>
<!-- end body  -->
<?php include("footer.php"); ?>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script>
    const success = document.getElementById("success");
    const failure = document.getElementById("failure");
    function hideNotice() {
        success.style.display = "none";
        failure.style.display = "none";
        clearInterval(hideNotice);
    }
    setInterval(hideNotice, 3000);
</script>
</body>
</html>