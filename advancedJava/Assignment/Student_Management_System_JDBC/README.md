# Assignment Question

**Title: Student Management System using JDBC with Runtime Polymorphism and Custom Exception. Design and implement a console-based Student Management System using Java and JDBC.**

Your application must demonstrate:

- Runtime Polymorphism
- Code Reusability and Readability
- Input Validation
- Custom Exception Handling

## Functional Requirements
-----------------------------

The system should provide the following operations:

1) Add a new student

2) View all students

3) Update student email by using mobile number

4) Delete a student by using id 

All database operations must be performed using JDBC

## Technical Requirements
-----------------------------
- Create a Student class with appropriate fields (id, name, email, age, mobile).
- Create a StudentDAO interface declaring all CRUD methods.
- Create at least two implementation classes of StudentDAO (example: MySQLStudentDAO)
- Demonstrate runtime polymorphism by using an interface reference to access implementation class objects.
- Use PreparedStatement for all database operations.
- Validation Requirement (Mandatory)

-----------------------------
### While inserting a student:
-----------------------------
- Name must not be empty or numeric.
- Email must contain@.
- Age must be a positive number.
- Mobile number must contain exactly 10 digits.
- If validation fails, you must throw a custom checked exception named:
InvalidStudentDataException
Handle this exception properly in the main class and display a meaningful message.
- Project Structure Requirement
Organize your project into proper packages (model, dao, exception, main) to improve readability and reusability.

## Expected Outcome
-----------------------

- The program should display a menu-driven console interface and perform operations based on user choice.
- The implementation must clearly show runtime polymorphism and custom exception usage.