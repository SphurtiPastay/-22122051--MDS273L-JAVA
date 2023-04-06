import java.io.*;
import java.util.Scanner;


//create a class called STUDENTs
public class STUDENTs{
    private static final int MAX_STUDENTS = 100; // Maximum number of students
    private static STUDENTs[] students = new STUDENTs[MAX_STUDENTS]; // Array to hold student objects
    private static int numStudents = 0; // Number of students currently in the array 
    private String regNo;
    private String name;
    private String email;
    private String phone;
    private String _class;
    private String department;

    //Create a constructor

    public STUDENTs(String regNo, String name, String email, String phone, String _class, String department){

        this.regNo=regNo;
        this.name=name; 
        this.email=email;
        this.phone=phone;
        this._class=_class;
        this.department=department;

    }

    // Method to print student details
    public void displayDetails() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + _class);
        System.out.println("Department: " + department);
    }

    // toString() method to convert student details to string
    
    public String toString() {
        return "Registration Number: " + regNo + "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone
                + "\nClass: " + _class + "\nDepartment: " + department;

    } 

    // Add these methods to the STUDENTs class
    public String getName() {
    return name;
}

   public String getRegNo() {
    return regNo;
}

  public String getEmail() {
    return email;
 }

 public String getPhone() {
    return phone;
}

public String getDepartment() {
    return department;
}




    
    // Method to add a student to the array
    private static void addStudent() {
        if (numStudents < MAX_STUDENTS) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student Details:");

            // Input student details
            System.out.print("Registration Number: ");
            String regNo = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Class: ");
            String _class = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            // Create and add student object to the array
            students[numStudents] = new STUDENTs(regNo, name, email, phone, _class, department);
            numStudents++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Maximum number of students reached. Cannot add more students.");
        }
    }

    // Method to search for a student by name or registration number
    private static void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search query (Name or Registration Number): ");
        String searchQuery = sc.nextLine();
        boolean found = false;

        // Search for student in the array
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equalsIgnoreCase(searchQuery) ||
                    students[i].getRegNo().equalsIgnoreCase(searchQuery)) {
                System.out.println("Student Details:");
                students[i].displayDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with the given search query: " + searchQuery);
        }
    } 


      // Method to update details of a student
      private static void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search query (Name or Registration Number): ");
        String searchQuery = sc.nextLine();
        boolean found = false;

        // Search for student in the array
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getName().equalsIgnoreCase(searchQuery) ||
                    students[i].getRegNo().equalsIgnoreCase(searchQuery)) {
                System.out.println("Student Details:");
                students[i].displayDetails();
                System.out.println("Enter new details:");

                // Input updated student details
                System.out.print("Registration Number: ");
                String regNo = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();
                System.out.print("Class: ");
                String _class = sc.nextLine();
                System.out.print("Department: ");
                String department = sc.nextLine();

                // Update student object in the array
                students[i].regNo=regNo;
                students[i].name=name;
                students[i].email=email;
                students[i].phone=phone;
                students[i]._class=_class;
                students[i].department=department;

                System.out.println("Student details updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with the given search query: " + searchQuery);
        }
    }

    // Method to display details of all students
    private static void displayAllStudents() {
        System.out.println("List of all Students:");
        for (int i = 0; i < numStudents; i++) {
            students[i].displayDetails();
            System.out.println("-----------------------------");
        }
    } 


    // Method to save details of each student in a file with student name as filename
    private static void saveStudentDetailsToFile() {
        for (int i = 0; i < numStudents; i++) {
            String fileName = students[i].getName() + ".txt";
            try {
                FileWriter writer = new FileWriter(fileName);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("Registration Number: " + students[i].getRegNo());
                bufferedWriter.newLine();
                bufferedWriter.write("Name: " + students[i].getName());
                bufferedWriter.newLine();
                bufferedWriter.write("Email: " + students[i].getEmail());
                bufferedWriter.newLine();
                bufferedWriter.write("Phone: " + students[i].getPhone());
                bufferedWriter.newLine();
                bufferedWriter.write("Class: " + students[i].getClass());
                bufferedWriter.newLine();
                bufferedWriter.write("Department: " + students[i].getDepartment());
                bufferedWriter.newLine();
                bufferedWriter.close();
                System.out.println("Student details saved to file: " + fileName);
            } catch (IOException e) {
                System.out.println("Failed to save student details to file: " + fileName);
                e.printStackTrace();
            }
        }
    }


// Main Method

    public static void main(String[] args) {

    

    Scanner sc=new Scanner(System.in);
    int choice;
        do {

            System.out.println("Enter Student Details");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Save Student Details to File");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    displayAllStudents();
                    break;
                case 4:
                    saveStudentDetailsToFile();
                    break;
                case 5:
                    System.out.println(" Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

            




}



