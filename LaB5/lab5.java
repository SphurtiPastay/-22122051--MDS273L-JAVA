
// Import the Scanner class to read input from the user
import java.util.Scanner;

public class lab5 {

 static String[] message;
 


// Function to encode the input string
    public static String encode(String message)
    {
        
       
        String result = "";
        
        // Iterate over each character in the message
        for (char c : message.toCharArray()) {
            // Calculate the index of the character in the alphabet
            int index = c - 'A';

            // If the character is a letter between A and Z, encrypt it
            if (index >= 0 && index < 26) {
            // Replace the character with the corresponding character from the cypher row    
            result += "XYZABCDEFGHIJKLMNOPQRSTUVW".charAt(index);
            } 
            
            else {
                result += c;
            }
        }
        return result;
    }
    // Function to decode the input string
    public static String decode(String message){

      
        String result = "";
         // Iterate over each character in the message
        for (char c : message.toCharArray()) {
            int index = c - 'A';
            if (index >= 0 && index < 26) {
                result += "DEFGHIJKLMNOPQRSTUVWXYZABC".charAt(index);
            } else {
                result += c;
            }
        }
        return result;
    }
    


    // Define the main() function to read input from the user and run the program
    public static void main(String[] args) { 

        // Create a Scanner object to read input from the user
        Scanner scan=new Scanner(System.in);

        // Display a menu and prompt the user for their choice
        while(true){

            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            String choice = scan.nextLine(); 

            // If the user chooses to encrypt a message, prompt them for the message and display the encrypted message
            if (choice.equals("1")){


                System.out.println("Enter the message for encryption");
                String message=scan.nextLine();
                message=message.toUpperCase();
                System.out.println("Enrypted message is:" +encode(message));

            }

            // If the user chooses to decrypt a message, prompt them for the message and display the decrypted message
            else if(choice.equals("2")){ 

                System.out.println("Enter the message for decryption");
                String message=scan.nextLine();
                message=message.toUpperCase();
                System.out.println("Decrypted message is:" +decode(message));


            }

            // Condition to exit from the program
            else if(choice.equals("3")){

                System.out.println("Exit the program");
                break;
            }

            else{

                System.out.println("Invalid choice");
            }




        }

     
    }
    
}


//INPUT: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
//OUTPUT: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD