public class App {

    public static void main(String[]args) {
      
        Student Me = new Student();

        Me.firstName = "Justin Myles";
        Me.middleInitial = "Q";
        Me.surname = "Cañedo";
        Me.dateOfBirth = 02/9/2004;
        Me.studentNumber = 2022101883;
        Me.studentEmailAddress = "canedojq@students.national-u.edu.ph";
        Me.iAmAwesome = true;
    
        Me.sayMystudentNumber();
        Me.sayMystudentEmailAddress();
        Me.AmIAwesome();
    }

}
     


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
