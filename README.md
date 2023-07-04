# CLI_BASED_SOFTWARE
🚀 Student Marks Manager - CLI Java App 📚for student marks management. Add, update, and delete student details using arrays. Easily track and manage students' scores.
# Student Marks Management CLI Application

This is a Java-based CLI application designed to manage students' marks efficiently.
With this application, you can easily add new student details, update existing student information, add and update their marks,
and even delete students from the system. The application uses arrays to store and manipulate the data.

## Features

1. **Home Page:**
   When you run the application, a homepage will be displayed, presenting the following options:
   - Add New Student
   - Add New Student with Marks
   - Add Marks
   - Update Student Details
   - Update Marks
   - Delete Student

2. **Add New Student:**
   Choose this option to add new students to the system. The application will prompt you to enter the student's details,
   such as name, student ID, and other relevant information.

4. **Add New Student with Marks:**
   This feature allows you to add a new student along with their marks in different subjects.
    You'll be asked to input the student's details and then add their marks for each subject. The application ensures the validity of the provided data.

6. **Add Marks:**
   If you have already entered the student details without assigning marks, this functionality allows you to add marks for those students.
   You'll need to find the student using their unique Student ID. In case of an invalid Student ID, the application will notify you and prompt
   whether to continue the search. Once a valid Student ID is entered, the application will display the Student Name and request you to input the new marks
   for that student. As with the previous options, the marks' validity will be checked before adding them.
   After entering the marks, you'll be prompted whether to add marks for another student or go back to the main menu.
   It will also notify you if marks have already been assigned to a particular student.

8. **Update Student Details:**
   With this option, you can update the details of an existing student. Enter the valid Student ID to modify their information, and if the ID is incorrect,
   it will be handled accordingly. After successful updating, you'll be prompted whether to continue updating another student or go back to the main menu.

10. **Update Marks:**
Use this option to update the marks of a student. Similar to the "Add Marks" functionality,
you'll need to find the student using their Student ID. Then, you can modify their marks for different subjects,
and the application will validate the new marks. You'll be asked whether to update marks for another student or go back to the main menu.

12. **Delete Student:**
This option allows you to remove a student from the system. Enter the valid Student ID to delete the corresponding student.
If the provided ID is incorrect, the application will handle the situation appropriately.
After successful deletion, you'll be prompted whether to delete another student or return to the main menu.

Feel free to explore and utilize this simple yet effective Student Marks Management CLI application for your needs. 
If you encounter any issues or have suggestions for improvement, please create an issue or pull request on the repository. Happy managing!
