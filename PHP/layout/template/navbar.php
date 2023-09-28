<!-- navbar -->
<nav class="navbar navbar-expand-lg navbar-light sticky-top" style="background: linear-gradient(90deg, rgba(255,252,247,1) 0%, rgba(255,119,5,1) 50%); border-bottom: 1px solid #e3e3e3">
  <div class="container-fluid">
    <a class="navbar-brand" href="home.php">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="display: flex; justify-content: space-around; width: 100%;">
        <?php 

        session_start();
        $login = $_SESSION["loggedIn"];
        $user = ucwords($_SESSION["name"]);
    
        if ($login == "ok") {
          echo '<li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Employees
            </a>
            <ul class="dropdown-menu">
              <li class="nav-item">
                <a class="nav-link" href="viewAllEmployees.php">View all employees</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="insertNewUser.php">Insert a new employee</a>
              </li>  
            </ul>
          </li>';
          echo '<li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Admins
          </a>
            <ul class="dropdown-menu">
              <li class="nav-item">
                <a class="nav-link" href="viewAllAdmins.php">View all admins</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="insertNewAdmin.php">Insert a new admin</a>
              </li>
            </ul>
          </li>';
            echo "<li class='nav-item'>
                    <a class='nav-link fw-bold'>Logged in as $user</a>
                  </li>";
            echo "<li class='nav-item'>
                    <a class='nav-link' href='login.php'>Logout</a>
                  </li>";
        } else {
            echo "<li class='nav-item'>
                  </li>";
        }
    
        ?>

      </ul>
    </div>
  </div>
</nav>
<!-- end navbar -->