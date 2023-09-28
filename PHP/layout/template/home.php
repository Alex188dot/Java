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
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Mooli&display=swap');
        h1 {
            text-align: center;
            margin-top: 3rem;
            margin-bottom: 3rem;
            font-family: 'Mooli', sans-serif;
        }
        .border {
            width: 80%;
        }
        img {
            margin-bottom: 3rem;
        }
    </style>
</head>
<body>
<?php include("navbar.php"); ?>
<!-- body -->
<div class="container">
    <h1>Welcome to HR Management Solutions, <?php 

session_start();
$user = ucwords($_SESSION["name"]);
$lastname = ucwords($_SESSION["lastname"]);

echo $user . " " . $lastname;

?></h1>
<div class="d-flex justify-content-center">
    <img class="img-fluid" src="img/office.jpg" alt="office" width="30%">
</div>
</div>
<div class="container">
  <div class="row">
    <div class="col-md-12 d-flex justify-content-center">
      <div class="d-flex flex-column align-items-start text-center">
        <div class="border border-3 rounded p-3 mb-3 mt-3">
          <a class="nav-link" href="viewAllEmployees.php">View all employees</a>
        </div>
        <div class="border border-3 rounded p-3 mb-3">
          <a class="nav-link" href="insertNewUser.php">Insert a new employee</a>
        </div>
        <div class="border border-3 rounded p-3 mb-3">
          <a class="nav-link" href="viewAllAdmins.php">View all admins</a>
        </div>
        <div class="border border-3 rounded p-3 mb-3">
          <a class="nav-link" href="insertNewAdmin.php">Insert a new admin</a>
        </div>
      </div>
    </div>
  </div>
</div>

<?php include("footer.php"); ?>

<!-- end body  -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<script>

    const loggedin = document.getElementById("success");
    function hideNotice() {
        loggedin.style.display = "none";
    }

setTimeout(hideNotice, 3000);

</script>
</body>
</html>