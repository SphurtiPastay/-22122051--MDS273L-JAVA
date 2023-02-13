package LaB3;







import java.util.Scanner;

public class newlab3{




   
    
//Array to store the details of the student
static String[][] studentDetails = new String[1024][5];
        
//Array to store the names of the students
static String[] studentNames = new String[1024];
        
    public static void main(String[] args) {
            
      //Menu-driven main method
      int choice;
      do 
      {
         System.out.println("Please Select an Operation:");
         System.out.println("1. Enter Student Details");
         System.out.println("2. Display Student Details");
         System.out.println("3. Search Student Details");
         System.out.println("4. Exit");
         Scanner sc=new Scanner(System.in);
         choice = sc.nextInt();
         switch(choice) {
         case 1: 
            enterStudentDetails();
            break;
         case 2:
            displayStudentDetails();
            break;
         case 3:
            searchStudentDetails();
            break;
         case 4:
            System.out.println("Exiting Program");
            break;
         default:
            System.out.println("Invalid Choice");
                }
            } while (choice != 4);
        }
        
        //Function to enter student details
        public static void enterStudentDetails() {
            System.out.println("Enter Student Name:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            //Check if the name is already entered
            if(!checkName(name)) {
                System.out.println("Enter Register Number:");
                String regNo = sc.nextLine();
                System.out.println("Enter Email Id:");
                String email = sc.nextLine();
                System.out.println("Enter Class:");
                String className = sc.nextLine();
                System.out.println("Enter Department:");
                String dept = sc.nextLine();
                //Add the details to the arrays
                addToArray(name, regNo, email, className, dept);
                System.out.println("Student Details Added Successfully!");
            }
            else {
                System.out.println("Student Details Already Exists!");
            }
        }
        
        //Function to display student details
        public static void displayStudentDetails() {
            System.out.println("Enter Student Name:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            //Check if the name is already entered
            if(checkName(name)) {
                //Get the index of the array
                int index = getIndex(name);
                //Print the details
                System.out.println("Name: "+studentDetails[index][0]);
                System.out.println("Register Number: "+studentDetails[index][1]);
                System.out.println("Email Id: "+studentDetails[index][2]);
                System.out.println("Class: "+studentDetails[index][3]);
                System.out.println("Department: "+studentDetails[index][4]);
            }
            else {
                System.out.println("Student Details Not Found!");
            }
        }
        
        //Function to search student details
        public static void searchStudentDetails() {
            System.out.println("Enter Student Name:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            //Check if the name is already entered
            if(checkName(name)) {
                System.out.println("Student Details Found!");
            }
            else {
                System.out.println("Student Details Not Found!");
            }
        }
        
        //Function to check if the name is already entered
        public static boolean checkName(String name) {
            for(int i=0;i<1024;i++) {
                if(studentNames[i] != null && studentNames[i].equalsIgnoreCase(name)) {
                    return true;
                }
            }
            return false;
        }
        
        //Function to get the index of the array
        public static int getIndex(String name) {
            for(int i=0;i<1024;i++) {
                if(studentNames[i] != null && studentNames[i].equalsIgnoreCase(name)) {
                    return i;
                }
            }
            return -1;
        }
        
        //Function to add the details to the arrays
        public static void addToArray(String name, String regNo, String email, String className, String dept) {
            for(int i=0;i<1024;i++) {
                if(studentNames[i] == null) {
                    studentNames[i] = name;
                    studentDetails[i][0] = name;
                    studentDetails[i][1] = regNo;
                    studentDetails[i][2] = email;
                    studentDetails[i][3] = className;
                    studentDetails[i][4] = dept;
                    return;
                }
            }
        }
      }










  