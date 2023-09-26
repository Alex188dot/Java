<?php 

session_start();
session_destroy();

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <style>

    </style>

</head>
<body>
<?php include("navbar.php"); ?>
<!-- body -->

<div class="container">
    <h1>Login</h1>
    <form action="login_control.php" method="POST">
    <label for="email"></label>
    <input type="text" name="email" id="email" placeholder="Email">
    <label for="password"></label>
    <input type="password" name="password" id="password" placeholder="Password">
    <button type="submit" class="btn btn-primary">Submit</button>
    </form>

    
 

</div>
<!-- end body  -->
<?php include("footer.php"); ?>

</script>
</body>
</html>