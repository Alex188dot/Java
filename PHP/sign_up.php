<?php

echo "Nome: " . $_POST["nome"] . "<br>";
echo "Cognome: " . $_POST["cognome"] . "<br>";
echo "Data di nascita: " . $_POST["data_n"] . "<br>";
echo "Sesso: " . $_POST["sesso"] . "<br>";
echo "Telefono: " . $_POST["telefono"] . "<br>";
echo "Provincia: " . $_POST["prov"] . "<br>";
echo "Posta: " . print_r($_POST["posta"]) . "<br>";
echo "Note: " . $_POST["note"] . "<br>";


?>