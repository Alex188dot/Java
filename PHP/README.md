## HR Management Solutions

HR Management Solutions is an HR management web application built with PHP. An admin can login with their credentials via the login screen, see example below:

<img width="1675" alt="login" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/34f40c35-8e1e-4063-899b-5c4403184722">

After they have been authenticated, thanks to the use of sessions, they will be able to see the homepage with a welcome message, the rest of the navbar and the other pages

<img width="1667" alt="loggedin" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/1e98a673-5589-4577-9ffd-9dc33ab27b11">

If they click on view employees, they will see all employees sorted by office. This data is obtained through a query to the database. Furthermore, next to each employee they will have 4 buttons: view details, contacts, modify details, delete employee.   
The user details tab will show for each employee: first name, last name, age, city, office and a profile picture. If the profile picture is not set, by default they will get the one in the screenshot below:

<img width="1683" alt="userDetails" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/47392ab5-33b2-4b3d-9cf6-04baccd9c7f5">

By clicking on the second icon in view all employees, the admin will be able to: a) see all contacts for an employee, b) add new contacts for an employee.

<img width="1656" alt="UserContacts" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/0030a2d7-c187-41c0-a2e4-9971d8881ced">

The third icon on view all employees will allow the admin to update an employee's details. They can decide to modify one or all fields. There is also the possibility to upload a profile image, which will be saved on the profile_pics folder on the server

<img width="1662" alt="UpdateUser" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/fbeff296-5b15-41bd-a4f3-282b346bb79f">

The last icon will delete an employee from the database. By clicking on it, a modal will appear and will give the option to confirm or deny the admin's choice. Please note by deleting a user also their profile picture on the server will be deleted (if different from the default one).

<img width="1658" alt="DeleteUser" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/8056e167-ef23-4a91-b062-6f747db2d688">

The Insert new employee tab will allow an admin to insert a new employee by adding them to the database. A success or failure message will be displayed once the operation is completed.

<img width="1659" alt="insertNewEmployee" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/44e15712-82ca-405f-bd3b-cd480b947c76">

The admins tab has two options: view all admins and insert new admin. The view all admin will show the admins by pulling data from the database. In this case there are only 3 options, view details, update admin user, delete admin

<img width="1672" alt="AllAdmins" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/e6682ed4-a4b8-453b-b45b-1283c4d1bebf">

Finally the insert admin will allow to create a new app user, by setting name, lastname, email and password. 

<img width="1667" alt="InsertNewAdmin" src="https://github.com/Alex188dot/Java-and-PHP/assets/117444853/457798e1-6273-422d-8077-7762ea9e851c">
