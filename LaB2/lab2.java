import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[1024];
        int choice;
        int count = 0;

        do {
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a name: ");
                    String name = scanner.next();
                    if (count == 1024) {
                        System.out.println("Maximum limit is reached.");
                        break;
                    }
                    boolean isDuplicate = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(name)) {
                            System.out.println("Name already exists.");
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        names[count++] = name;
                        System.out.println("Name added successfully.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a name to search: ");
                    name = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(name)) {
                            System.out.println("Name found at index " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Name not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter a name to remove: ");
                    name = scanner.next();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(name)) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Name not found.");
                        break;
                    }
                    for (int i = index; i < count - 1; i++) {
                        names[i] = names[i + 1];
                    }
                    count--;
                    System.out.println("Name removed successfully.");
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println(" Please enter a valid choice.");
            }
        } 
        while (choice != 4);
        scanner.close();
    }
}


