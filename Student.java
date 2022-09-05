public class Student {
        String LastName;
       String firstName;
       String middleInitial;
       String surname;
       int dateOfBirth;
       int studentNumber;
       String studentEmailAddress;
       Boolean iAmAwesome;

    
       public void sayMystudentNumber() {
         System.out.println("My Student Number is " + studentNumber);
    }
       public void sayMystudentEmailAddress() {
       System.out.println("My studentEmailAddress is " + studentEmailAddress);
    }  
       public void AmIAwesome() {
        System.out.println(iAmAwesome);
    }

}