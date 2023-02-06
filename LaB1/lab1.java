//package -22122051--MDS273L-JAVA; 


public class lab1{

    public static void main(String[] args) {

        //declare employee details using different data types

        String name = "Sphurti Pastay";
        int age = 22;
        char gender = 'f';
        double salary = 80000;
        String state = "Karnataka";
        String company = " Google "; 
    
        
        //checking gender

        if (gender == 'm') {
            System.out.println("Gender: Male");
        } else if (gender == 'f') {
            System.out.println("Gender: Female");
        }           
    
           
        

      

       
        //checking region

        switch(state){
            case "Andhra Pradesh":
            case "Karnataka":
            case "Kerala":
            case "Tamil Nadu":
                System.out.println("The Employee is from the southern states of India; Preferable work location is in "+state);
                System.out.println("Employee Name: " + name);
                System.out.println("Employee Age: " + age);
                System.out.println("Salary: " + salary);
    
                break;

            case "Himachal Pradesh":
            case "Haryana":
            case "Uttarakhand":
            case "UttarPradesh":

                System.out.println("The Employee is from the Northern states of India");
                break; 

            case "Bihar":
            case "Orissa":
            case "Jharkhand":
            case "West Bengal":
                System.out.println("The Employee is from the Eastern states of India");
                break; 
            
            case "Rajasthan":
            case "Gujarat":
            case "Goa":
            case "Maharashtra":
                System.out.println("The Employee is from the Western states of India");
                break; 

            case "Madhya Pradesh":
            case "chattisgarh":
            
                System.out.println("The Employee is from the Central states of India");
                break; 

            default:
                System.out.println("The Employee is from other states of India");
                break;
        }
       
       



          //Checking Company
	
          
         switch(company){
            case "Facebook":
            case "Google":
            case "Microsoft":
            case "Samsung":
            case "IBM":
            case "Apple":
                System.out.println("The Employee is working in Top MNC Companies"+company);
                break;
            default:
                System.out.println("The Employee is not working in Top MNC Companies");
                break;

        }    

    



        
    }
    
}
