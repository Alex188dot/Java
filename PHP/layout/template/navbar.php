<!-- navbar -->
<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" href="viewAllEmployees.php">View all employees</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="insertNewUser.php">Insert a new employee</a>
        </li>

        <?php 

        session_start();
        $login = $_SESSION["loggedIn"];
        $user = ucwords($_SESSION["name"]);
    
        if ($login == "ok") {
            echo "<li class='nav-item'>
                    <a class='nav-link'>Logged in as $user</a>
                  </li>";
            echo "<li class='nav-item'>
                    <a class='nav-link' href='login.php'>Logout</a>
                  </li>";
        } else {
            echo "<li class='nav-item'>
                  </li>";
        }
    
        ?>

        if 
      </ul>
    </div>
  </div>
</nav>
<!-- end navbar -->