<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>First page of the server</title>
</head>
<body>
    <h1>First page of the server</h1>
<p>
    
        <?php
            echo "Give a vote to my page!";

            echo "<select>";
            for ($i = 1; $i <= 10; $i++) {
                echo "<option>$i</option>";
            }
            
            echo "</select>";
       ?>
</p>

</body>
</html>