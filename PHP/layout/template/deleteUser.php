<?php 

    session_start();
    if((!$_SESSION["loggedIn"] == "ok")) {
        header("Location: login.php");
    }

    $user = $_GET["id"];

    $conn = new mysqli("localhost", "root", "root", "javaDB");
    $query = "DELETE FROM users WHERE id = $user";
    $result = $conn->query($query);
    if ($result === TRUE) {
        header("Location: base.php?outcome=2");
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

    ?>


