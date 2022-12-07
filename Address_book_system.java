package day_22;
import java.util.*;

public class Address_book_system {

public String firstName,lastName,address,state,city,zip,phoneNumber,email;
    
    public Address_book_system(String Fname,String Lname,String address,String city,String state,String zip,String phoneNumber,String email)
    {
        this.firstName = Fname;
        this.lastName = Lname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
        public void displayDetails() {
    	System.out.println("FirstName: "+firstName+ "," +" LastName: " +lastName+ "," +" Address: " +address+"," +" City: " +city+"," +" State: " +state+"," +" zip: " +zip+"," +" PhoneNumber: " +phoneNumber+"," +" email: " +email);
    }
     
public static void main(String[] args)  
    {
	try (Scanner sc =new Scanner(System.in)) {
	
	System.out.println("enter first name");
	String firstname=sc.next();
	System.out.println("enter last name");
	String lastname=sc.next();
	System.out.println("enter address");
	String address=sc.next();
	System.out.println("enter city");
	String city=sc.next();
	System.out.println("enter state");
	String state=sc.next();
	System.out.println("enter zip");
	String zip=sc.next();
	System.out.println("enter phoneNumber");
	String phoneNumber=sc.next();
	System.out.println("enter email");
	String email=sc.next();
	
	Address_book_system p = new Address_book_system(firstname,lastname,address, city,state,zip,phoneNumber,email);
	
	p.displayDetails();	
         }

}
}

