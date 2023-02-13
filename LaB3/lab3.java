package LaB3;

import java.util.Scanner;


public class lab3{ 

    static String[][] students = new String[10][5];
    static int count = 0;
    
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
    
          do {
             System.out.println("1. Collect student details");
             System.out.println("2. Display student details");
             System.out.println("3. Search student details");
             System.out.println("4. Exit");
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
    
             switch (choice) {
                case 1:
                   collectDetails();
                   break;
                case 2:
                   displayDetails();
                   break;
                case 3:
                   searchDetails();
                   break;
                case 4:
                   System.out.println("Exiting...");
                   break;
                default:
                   System.out.println("Invalid choice! Try again.");
                   break;
             }
          } while (choice != 4);
       }

    
    
    static void collectDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        students[count][0] = sc.nextLine();
        System.out.print("Enter register number: ");
        students[count][1] = sc.nextLine();
        System.out.print("Enter email: ");
        students[count][2] = sc.nextLine();
        System.out.print("Enter class: ");
        students[count][3] = sc.nextLine();
        System.out.print("Enter department: ");
        students[count][4] = sc.nextLine();
        count++;
        System.out.println("Details collected successfully!");
       }
    
       static void displayDetails() {
          System.out.println("Name\tReg. No.\tEmail\t\tClass\tDepartment");
          for (int i = 0; i < count; i++) {
             for (int j = 0; j < 5; j++) {
                System.out.print(students[i][j] + "\t");
             }
             System.out.println();
          }
       }
    
       static void searchDetails() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter name or email to search: ");
          String searchTerm = sc.nextLine();
          boolean found = false;
          for (int i = 0; i < count; i++) {
             if (students[i][0].equalsIgnoreCase(searchTerm) || students[i][2].equalsIgnoreCase(searchTerm)) {
                System.out.println("Name\tReg. No.\tEmail\t\tClass\tDepartment");
                for (int j = 0; j < 5; j++) {
                   System.out.print(students[i][j] + "\t");
                }
                System.out.println();
                found = true;
                break;
             }
          }
          if (!found) {
             System.out.println("Name not found");
           }

    }
}   


    
 