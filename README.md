
# Spring Hibernate Student Management

A simple Java application that demonstrates CRUD operations using Spring ORM and Hibernate for managing student records. This application allows users to add, view, update, and delete student information from a MySQL database.

## Features

- **Add a new student**: Insert a new student record into the database.
- **Display all students**: List all student records from the database.
- **Get details of a single student**: Retrieve details of a specific student by ID.
- **Delete a student**: Remove a student record from the database by ID.
- **Update a student**: Modify the details of an existing student record.

## Technologies Used

- **Java**: Programming language used for the application.
- **Spring Framework**: Dependency injection and transaction management.
- **Hibernate ORM**: Object-Relational Mapping for database operations.
- **MySQL**: Database for storing student records.
- **Maven**: Build tool and dependency management.

## Getting Started

### Prerequisites

- JDK 11 or higher
- Apache Maven
- MySQL Server
- Eclipse IDE (optional but recommended for Java development)

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/aqibhussain2202/spring-hibernate-student-management.git
Configure MySQL Database

Create a MySQL database named springjdbc and ensure that your config.xml file is updated with the correct database URL, username, and password.

Build the Project

Navigate to the project directory and run:

bash
Copy code
mvn clean install
Run the Application

Execute the application using:

bash
Copy code
mvn exec:java -Dexec.mainClass="com.spring.orm.App"
Usage
Once the application is running, use the following options to interact with the system:

Press 1 to add a new student.
Press 2 to display all students.
Press 3 to get details of a single student.
Press 4 to delete a student.
Press 5 to update a student.
Press 6 to exit the application.
Configuration
The configuration for Spring and Hibernate is located in config.xml. Ensure that it matches your environment and database settings.



Contributing
Feel free to fork the repository, make changes, and submit pull requests. Any contributions to improve this project are welcome!

Contact
For any questions or issues, please contact aqibhussain2202@gmail.com.

