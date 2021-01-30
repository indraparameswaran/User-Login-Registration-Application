# User-Login-Registration-Application

User Requirement:
1.Able to login showing success or failure, if failure being able to return to login page.
2.Able to register for the first time user,showing success or failure, if failure bwing able to return to register page.
Application Design and Development:
On MySQL Database
1.Created users schema.
2.Created a table user_login.
3.Insert 1 row of data.
On Eclipse IDE
1.Created a maven web app project.
2.Added dependencies to pom.xml(sql, hibernate,jsp).
3.Created index.jsp for login action and link for registration.
4. Created login controller. 
5.Performed servlet mapping in web.xml.
6.Created a package com.users to hold hibernate set up codes.
7. Created hibernate.cfg.xml file for MySQL properties.
8.Created a HIbernateUtil class to initialize the session factory.
9.Created a UserLogin model (JPA entity—POJO).
10.Created UserLogin.hbm.xml for doing the ORM(Object Relational Mapping).
11.Created UserLogin DAO(Data Access Object).
12.Created login-success jsp, to display after successful login.
13. Created login-failure jsp, to display after failure of login with a message to try again.
14. Added code in the login controller, using request dispatcher to call success or failure jsp.
15.Created register.jsp for registration action.
16. Created registration controller.
17. Created register-success jsp, to display after successful registration.
18. Created login-failure jsp, to display after failure of login with a message to try again.
19. Added code in the register controller, using request dispatcher to call success or failure jsp.
20.Tested the code with varied successful and failure login values and registration values.
21.Screenshots were taken to show success and failure on loin and registration.
22.Added welcome code to the index.jsp and register.jsp to greet the user to fine tune the project.
Git repository was created in Git hub and the code was pushed to the Git repository. The link for Git repo is : https://github.com/indraparameswaran/User-Login-Registration-Application.git
