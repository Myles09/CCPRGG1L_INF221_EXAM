import java.util.Scanner;

   public class Exam {
    
    public static void main(String[] args) {
     studentNumber();
     even_odd();
     firstname_lastname(); 
     firstName();
     vowel();
     Uppercase();
     firstname_uppercase();
     bsit();   
    strand();   
    email();
    }


    // 1. Create a method and think of a formula to get the last 6 digits of your
    // student number. (10 pts)
    static void studentNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        
        int last6digits = studentNumber%1000000;
        System.out.println(" your last six digits: " + last6digits);
        
    }

      // 2. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        static void even_odd(){
            Scanner scan = new Scanner(System.in);
            System.out.println("2. ODD or EVEN numbers");

            System.out.print("Enter the last two digits of your student number: ");
    
            int lastTwoDigits = scan.nextInt();
     
            if(lastTwoDigits % 2 == 0)
    
                System.out.println(lastTwoDigits + " is even ");
    
            else
    
                System.out.println(lastTwoDigits +" is odd ");
    
        }
 
         // 3. Create a method that will return the total character length of your
        // firstname and your surname. (10 pts)
         static void firstname_lastname(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your firstname : ");
        String firstName = scan.nextLine();
        System.out.println("Enter your Lastname");
        String Lastname = scan.nextLine();

        int total = firstName.length() + Lastname.length();

        System.out.println(" Your firstname and lastname is " + total );
       

 
    }
        // 4. Create a method to that will return true if your firstname in BOTH
        // UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
    
    static void firstName(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the firstname in lower case: ");
        String firstName = scan.next();
        System.out.println("Input the firstname in UPPERCASE: ");
        String FIRSTNAME = scan.next();

        if ( firstName.equals("justin") && FIRSTNAME.equals("CANEDO") ){
          
            System.out.println("true ");    
        } else {
            System.out.println("false ");
        }
    }


     // 5. Create a method that will return true if your name starts with
        // a vowel 'A','E','I','O','U'.
        // Otherwise, return false.    
         static void vowel(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input one of the first letter of your name: ");
        char choice = scan.next().charAt(0);
        switch(choice){
            case 'A':
            System.out.print("true ");
            break;
        case 'E':
            System.out.print("true ");
            break;
        case 'I':
            System.out.print("true ");
            break;
        case 'O':
            System.out.print("true ");
            break;
        case 'U':
            System.out.print("true ");
            break;
        default:
            System.out.print("false ");
            break;
        }
    }  

    // Part 2

         // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
    static void Uppercase(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Student ID number: ");
        int studentNumber = scan.nextInt();

        if (studentNumber == 2022101883 ){
          
            System.out.println("Valid");    
        } else {
            System.out.println("Invalid");
        }

    }

      // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
    static void firstname_uppercase(){
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your firstName in uppercase: ");
        String firstname = scan.nextLine();
        System.out.println(" Enter your lastName in lowercase: ");
        String lastname = scan.nextLine();


        if ( firstname == firstname.toUpperCase() && lastname == lastname.toLowerCase()){
          
            System.out.println("Valid");    
        } else {
            System.out.println("Invalid");
        }
      


        }

          // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        static void bsit(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Type BSIT if taking BSIT or Type BSCS if taking BSCS");
            String choice = scan.next();

            switch (choice){
                case "BSIT":
                System.out.println(" you picked BSIT");  
                System.out.println(" Type MWA if you are taking MWA or Type MAA if you are taking MAA"); 
                String Choice = scan.next();
                switch (Choice){
                    case "MWA":
                    System.out.print("you are taking MWA ");
                    break;
    
                    case "MAA":
                    System.out.println("You are taking MAA");
                    break;
                    
                }
                break;

                case "BSCS":
                System.out.println(" you picked BSCS");  
                System.out.println(" TYPE DF if you are taking DF or Type ML if you are taking ML");
                String Choices = scan.next();
                switch (Choices){
                case "DF":
                System.out.print("you are taking DF ");
                break;

                case "ML":
                System.out.println("You are taking ML ");
                
            }
        
        }

        
    }
      // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)
    static void strand(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your SHS strand:  ");
        String strand = scan.next();
        switch(strand){
            case "STEM":
            System.out.print("valid ");
            break;
        case "ICT ":
            System.out.print("valid ");
            break;
        case "ABM":
            System.out.print("valid ");
            break;
        case "HUMSS":
            System.out.print("valid ");
            break;
        case "HOME ECONOMICS":
            System.out.print("valid ");
            break;

        case "ARTS AND DESGIN":
        System.out.print("valid ");
        break;
       
        case "TVL MARITIME":
            System.out.print("valid ");
            break;

        default:
            System.out.print("invalid ");
            break;
        }
    }  

        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)
    static void email(){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input your email address: ");
        String email = scan.nextLine();

        if (email.contains("canedo") ){    
            System.out.println("Valid");    
        } else {
            System.out.println("Invalid");
        }

        scan.close();
    }

   
}