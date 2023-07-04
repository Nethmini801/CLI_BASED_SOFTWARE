import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

class Pro1{
 public static String SID[]=new String[100];
 public static String SNAME[]=new String[100];
 public static int PRO_M[] = new int[100];
 public static int DMS_M[] = new int[100];
 public static int count=0;
 public static String studentId;
 public static String studentName;
 public static int marks_PRO ;
 public static int marks_DMS ;
 public static char continueInput = 'y';
 public static int OptionNo;
 public static void main(String args[]){
 //checking the option number that is selected by the user, according to the user input system and will go into the methods. 
 while(true){
 //getting the user input from the option method
 OptionNo = options();
 
 switch (OptionNo){
 
 //If the user selects 1 st option
 case 1:
 clearConsole();
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" ADD NEW STUDENT");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 AddNewStudnet();
 break;
 //If the user selects 2nd option 
 case 2:
 clearConsole();
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" ADD NEW STUDENT WITH MARKS");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 AddStudnetWithMarks();
 break;
 //If the user selects 3rd option 
 case 3:
 clearConsole();
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" ADD MARKS");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 AddMarks();
 break;
 //If the user selects 4th option 
 case 4:
 clearConsole();
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" UPDATE STUDENT DETAILS");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 UpdateSDetails();
 break;
 //If the user selects 5th option 
 case 5:
 clearConsole();
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" UPDATE MARKS");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 UpdateMarks();
 break;
 //If the user selects 6th option 
 case 6:
 clearConsole();
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" DELETE STUDENT");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 DeleteStudent();
 break;
 //If the user gives an invalid input
 default :
 System.out.println("Invalid option .Try again");
 options();
 
 }
 
 }
 
 
 
 }
 public static int options(){
 //Priting the topic of this method
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 System.out.println(" WELCOME TO GDSE MARKS MANAGEMENT SYSTEM");
 System.out.print("-----------------------------------------------------------------------------------------");
 System.out.println();
 Scanner input = new Scanner(System.in);
 //displaying the options that the user can select
 System.out.println("[1]Add New Student\t\t\t\t[2]Add New Student with Marks");
 System.out.println("[3]Add Marks\t\t\t\t\t[4]Update Student Details");
 System.out.println("[5]Updata Marks\t\t\t\t\t[6]Delete Studnet");
 System.out.println("[7]Print Student Details\t\t\t[8]Print Studnet Ranks");
 System.out.println("[9]Best in Programming Fundementals\t\t[10]Best in Database Management System");
 System.out.println();
 //getting the user input for the option
 System.out.print("Enter an option to continue: ");
 int option = input.nextInt();
 return option;
 
 }
 public static void AddNewStudnet()
 {
 Scanner input = new Scanner(System.in);
 
 System.out.print("Enter Student ID: ");
 String newId = input.next();
 for (int i = 0; i < count; i++) {
 //If the userid is available in the SID array.
 if (SID[i].equals(newId)) {
 System.out.println("Student ID already exists. Please enter a new Student ID.");
 AddNewStudnet(); // Call the method recursively to prompt the user again
 return;
 }
 }
 //if user inputs a unique Studnet ID,it will added into the array
 SID[count] = newId;
 //System will ask the user to input the name of this Student
 System.out.print("Enter Student Name: ");
 //Adding that name into the SNAME array
 SNAME[count] = input.next();
 //Showing a success message
 System.out.println("Student added successfully.");
 //System will ask if the user wants to add a new student to the system.
 System.out.print("Do you want to add a new student? (y/n): ");
 char addMore = input.next().charAt(0);
 //if user says yes
 if (addMore == 'y' || addMore == 'Y') {
 //Count will increment by 1
 count++;
 //Again this method will call
 AddNewStudnet();
 //from below statement we can idnetify what are id s that are avaible in the SID array
 System.out.println(Arrays.toString(SID));
 } else {
 return;
 
 }
 
}
public static void AddStudnetWithMarks(){
 Scanner input2 = new Scanner(System.in);
 char continueInput = 'y';
 //if the user selects the 2nd optionfor the 1st time(then the 1st index of these arrays are still null and 0)
 if(SID[0] == null || SID[0].isEmpty()){
 //Getting the user input for the 1st index of the SID
 System.out.print("Enter the student ID: ");
 studentId =input2.nextLine();
 //Adding that value into the 1st index of the SID array.
 SID[0]=studentId;
 
 //Getting the user input for 1st index of the SNAME array
 System.out.print("Enter student name: ");
 studentName =input2.nextLine();
 //Adding that value into the 1st index of the SNAME array.
 SNAME[0]=studentName;
 //getting the user input for the PRO_M array(1st index) --> PRO_M array is to store Programming fundamnetal marks
 System.out.print("Programming Fundamental Marks: ");
 marks_PRO = input2.nextInt();
 //check whether the mark is in the range of 0-100
 if (marks_PRO < 0 | marks_PRO > 100) {
 //while the mark is not this range
 while(marks_PRO < 0 | marks_PRO > 100){
 //the system will shows an error
 System.out.println("Invalid marks. Please try again.");
 //Again and again the system will asks the user to enter a valid mark
 System.out.print("Programming Fundamental Marks: ");
 marks_PRO = input2.nextInt();
 }
 PRO_M[0] =marks_PRO; 
 }else{
 //if the marks is valid then it will added into the 1st index of the PRO_M array
 PRO_M[0] =marks_PRO; 
 }
 //getting the user input for the DMS_M array(1st index) --> DMS_M array is to store Database Management Marks
 System.out.print("Database Management Marks: ");
 marks_DMS = input2.nextInt();
 //check whether the mark is in the range of 0-100
 if (marks_DMS < 0 | marks_DMS > 100) {
 //while the mark is not this range
 while(marks_DMS < 0 | marks_DMS > 100){
 //the system will shows an error
 System.out.println("Invalid marks. Please try again.");
 //Again and again the system will asks the user to enter a valid mark
 System.out.print("Database Management Marks: ");
 marks_DMS = input2.nextInt();
 }
 DMS_M[0] =marks_DMS;
 }else{
 //if the marks is valid then it will added into the 1st index of the DMS_M array
 DMS_M[0] =marks_DMS;
 }
 //if the 1st indexs of these arrays are already filled them the data will added into the arrays
 SID[count] = studentId;
 SNAME[count] = studentName;
 PRO_M[count] = marks_PRO;
 DMS_M[count] = marks_DMS;
 
 //System will ask if the user wants to add a new student to the system.
 System.out.print("Do you want to add a new student (Y/n) : ");
 continueInput = input2.next().charAt(0);
 
 
 }
 //if the user inputs y as he/she wants to add another student
 while (continueInput == 'y' || continueInput == 'Y') {
 //System will asks to enter a new student id
 System.out.print("Enter the student ID: ");
 String studentId = input2.next();
 //boolean value to check if the Studnet id is availble or not
 boolean studentExists = false;
 //from the 1st elemt to the last element of the SID array
 for (int i = 0; i < SID.length-1; i++) {
 //if the user input(studentId) is found in the SID array
 if (SID[i] != null && SID[i].equals(studentId)) {
 //the boolean value becomes true
 studentExists = true;
 //Showing and error message that this is not a unique Stduent ID
 System.out.println("Error: Student with the same ID already exists.");
 break;
 }
 }
 //if that kind of a studnet ID is not availble in the SID array
 if (!studentExists) {
 System.out.print("Enter student name: ");
 String studentName = input2.next();
 int marks_PRO ;
 int marks_DMS ;
 System.out.print("Programming Fundamental Marks: ");
 marks_PRO = input2.nextInt();
 if (marks_PRO < 0 | marks_PRO > 100) {
 while(marks_PRO < 0 | marks_PRO > 100){
 System.out.println("Invalid marks. Please try again.");
 System.out.print("Programming Fundamental Marks: ");
 marks_PRO = input2.nextInt();
 } 
 PRO_M[count+1] =marks_PRO; 
 
 }else{
 PRO_M[count+1] =marks_PRO; 
 }
 System.out.print("Database Management Marks: ");
 marks_DMS = input2.nextInt();
 if (marks_DMS < 0 | marks_DMS > 100) {
 while(marks_DMS < 0 | marks_DMS > 100){
 System.out.println("Invalid marks. Please try again.");
 System.out.print("Database Management Marks: ");
 marks_DMS = input2.nextInt();
 }
 DMS_M[count+1] =marks_DMS;
 }else{
 DMS_M[count+1] =marks_DMS;
 
 }
 
 
 // Add student details to arrays
 SID[count+1] = studentId;
 SNAME[count+1] = studentName;
 count++;
 System.out.println("Student added successfully.");
 }
 System.out.print("Do you want to add another student? (Y/N): ");
 continueInput = input2.next().charAt(0);
 //below statements are showing the values of these arrays
 System.out.println(Arrays.toString(SID));
 System.out.println(Arrays.toString(SNAME));
 System.out.println(Arrays.toString(PRO_M));
 System.out.println(Arrays.toString(DMS_M));
 if(continueInput=='n' || continueInput =='N'){
 return;
 }
 
 }
 
}
public static void AddMarks(){
 String STID;
 Scanner input3= new Scanner(System.in);
 
 while(continueInput=='y' || continueInput=='Y'){
 boolean notFound = true;
 System.out.print("Enter the student ID: ");
 STID = input3.next();
 for(int i=0; i<SID.length-1;i++){
 if(SID[i] != null && SID[i].equals(STID)){
 //if the 1st index of the PRO_M is filled then the the 1st index of the DMS_M is also filled
 if(PRO_M[i]!=0){
 System.out.println("This student's marks have been already added");
 System.out.println("If you want to update the marks,please use[4] Update Marks option");
 }else{
 // if those 1st indexes are not filled
 System.out.print("Programming Fundamental Marks: ");
 marks_PRO = input3.nextInt();
 if (marks_PRO < 0 | marks_PRO > 100) {
 while(marks_PRO < 0 | marks_PRO > 100){
 System.out.println("Invalid marks. Please try again.");
 System.out.print("Programming Fundamental Marks: ");
 marks_PRO = input3.nextInt();
 } 
 PRO_M[i] =marks_PRO; 
 }else{
 PRO_M[i] =marks_PRO; 
 }
 System.out.print("Database Management Marks: ");
 marks_DMS = input3.nextInt();
 if (marks_DMS < 0 | marks_DMS > 100) {
 while(marks_DMS < 0 | marks_DMS > 100){
 System.out.println("Invalid marks. Please try again.");
 System.out.print("Database Management Marks: ");
 marks_DMS = input3.nextInt();
 }
 DMS_M[i] =marks_DMS;
 }else{
 DMS_M[i] =marks_DMS;
 
 }
 //these below statement are displaying the current values of PRO_M and DMS_M arrays
 System.out.println(Arrays.toString(PRO_M));
 System.out.println(Arrays.toString(DMS_M));
 
 }
 //if the Stduent ID is found then the boolean value becomes true
 notFound =false;
 break;
 }
 
 }
 //if there is no that kind of a Student ID in the SID array
 while(notFound){
 //then the system will showing an error
 System.out.print("Invalid Student ID.");
 break;
 
 }
 System.out.println("Do you want to search again (Y/n)?");
 continueInput = input3.next().charAt(0); 
 if(continueInput=='n' || continueInput =='N'){
 return;
 }
 
 
 }
 
}
public static void UpdateSDetails(){
 
 Scanner input4 = new Scanner(System.in);
 String STID;
 //boolean value to find the Stduent ID
 boolean Found = false;
 continueInput='y';
 while(continueInput=='y' || continueInput=='Y'){
 System.out.print("Enter the student ID: ");
 STID = input4.next();
 for(int i=0; i<SID.length-1;i++){
 if(SID[i].equals(STID)){
 //If that kind of a studnet ID is there in the SID array,then the system will print the current name of that Student 
 System.out.println("Student name :"+SNAME[i]);
 //system will ask the user to enter a new studnet name for that Student
 System.out.println("Enter new name :");
 //The new name is replaced with the previous name
 SNAME[i]= input4.next();
 //Showing an sucess message
 System.out.println("Student details has been updated successfully."); 
 System.out.println(Arrays.toString(SNAME));
 Found =true; //Since the Student id is avaible in the SID array the boolena value will become true
 break; 
 }
 
 
 }
 //if that kind of a student ID is not there in the SID array
 if(!Found){
 System.out.println("Invalid Student ID.Do you want to search again (Y/n)?");
 continueInput = input4.next().charAt(0); 
 
 }
 System.out.println("Do you want another student details?(Y/n)");
 continueInput = input4.next().charAt(0); 
 if(continueInput=='n' || continueInput =='N'){
 return;
 }
 }
}
public static void UpdateMarks(){
 Scanner input5 = new Scanner(System.in);
 String STID;
 continueInput='y';
 while(continueInput=='y' || continueInput=='Y')
 {
 boolean notFound =true;
 System.out.print("Enter the student ID: ");
 STID = input5.next();
 for(int i=0; i<SID.length-1;i++)
 {
 if(SID[i] != null && SID[i].equals(STID)) {
 System.out.println("Student name :"+SNAME[i]);
 if(PRO_M[i] !=0 && DMS_M[i]!=0)
 {
 System.out.println("Programming Fundamental Marks :"+PRO_M[i]);
 System.out.println("Database Management marks :"+DMS_M[i]);
 
 System.out.println("Enter new Programming Fundamental Marks :");
 if (marks_PRO < 0 | marks_PRO > 100) {
 while(marks_PRO < 0 | marks_PRO > 100){
 System.out.println("Invalid marks. Please try again.");
 System.out.print("Enter new Programming Fundamental Marks: ");
 marks_PRO = input5.nextInt();
 } 
 PRO_M[i]=input5.nextInt(); 
 }else{
 PRO_M[i]=input5.nextInt(); 
 }
 
 System.out.println("Enter new Database Management marks :");
 
 if (marks_DMS < 0 | marks_DMS > 100) {
 while(marks_DMS < 0 | marks_DMS > 100){
 System.out.println("Invalid marks. Please try again.");
 System.out.print("Enter new Database Management Marks: ");
 marks_DMS = input5.nextInt();
 }
 DMS_M[i]=input5.nextInt();
 }else{
 DMS_M[i]=input5.nextInt();
 //Sowing a success message
 System.out.println("Marks has been updated successfully."); 
 
 }
 }else{
 //If this Stduent's marks yet to be added
 System.out.println("This student's marks yet to be added.");
 }
 notFound =false; 
 break;
 
 }
 
 }
 while(notFound){
 System.out.println("Invalid Student ID.");
 break;
 
 }
 
 System.out.println("Do you want to search again (Y/n)?");
 continueInput = input5.next().charAt(0);
 if(continueInput =='n' || continueInput =='N'){
 return;
 }
 
 }
 
 
}
public static void DeleteStudent(){
 Scanner input6 = new Scanner(System.in);
 String STID;
 continueInput='y';
 
 while(continueInput=='y' || continueInput=='Y')
 {
 boolean notFound =true;
 System.out.print("Enter the student ID: ");
 STID = input6.next();
 for(int i=0; i<SID.length-1;i++)
 {
 if(SID[i] != null && SID[i].equals(STID)) {
 //setting this index to null
 SID[i] =null;
 SNAME[i]= null;
 //if this index of PROM_M and DMS_M is not 0
 if(PRO_M[i] !=0 && DMS_M[i]!=0)
 { //setting this index to 0
 PRO_M[i]=0;
 DMS_M[i]=0;
 }
 //below statements will display the current situation of these arrays
 System.out.println(Arrays.toString(SID));
 System.out.println(Arrays.toString(SNAME));
 System.out.println(Arrays.toString(PRO_M));
 System.out.println(Arrays.toString(DMS_M));
 //showing the success message
 System.out.println("Student has been sucessfully deleted");
 //boolean value becomes false
 notFound =false; 
 break;
 } 
 
 }
 while(notFound){
 System.out.println("Invalid Student ID.");
 break;
 
 }
 
 System.out.println("Do you want to search again (Y/n)?");
 continueInput = input6.next().charAt(0);
 
 if(continueInput =='n' || continueInput =='N'){
 return;
 }
 
 }
}
public final static void clearConsole() 
{
 try {
 final String os = System.getProperty("os.name");
 if (os.contains("Windows")) {
 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
 } else {
 System.out.print("\033[H\033[2J");
 System.out.flush();
 }
 } catch (final Exception e) {
 e.printStackTrace();
 // Handle any exceptions.
 }
}
}
