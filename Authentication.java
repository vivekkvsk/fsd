package lockMe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Authentication {
	
	private static Scanner input;
	private static Scanner lockerInput;
	private static  Scanner keyboard;
	private static PrintWriter output;
	private static PrintWriter lockerOutput;
	private static Userdetails userdetails;
	private static users users;
	
	public static void main (String[] args) {	
		
		 application();
		 welcomeScreen();
		 SignInoptions();
		 }
public static void welcomeScreen() {
		// TODO Auto-generated method stub
		System.out.println("#####################################################");
		System.out.println("                                                     ");
		System.out.println("                                                      ");
		System.out.println("    Welcome to Lock me.com                                   ");
		System.out.println("#######################################################");
	}
public static void SignInoptions() {
	System.out.println("1. Registration");
	System.out.println("2. Login");
	int option = keyboard.nextInt();
	switch(option) {
		case 1:
			registration();
			break;
		case 2:
			login();
			break;
	    default :
			System.out.println("Please choose either of the optoins 1 or 2");
			break;
	
	}
	keyboard.close();
	input.close();
	
}
public static void lockerOptions(String inpUsername) {
	// TODO Auto-generated method stub
	System.out.println("1. Fetch the detials");
	System.out.println("2. Store the detials");
	int option = keyboard.nextInt();
	

	switch(option){
		case 1:
			fetchdetails(inpUsername);
			break;
		case 2:
			stroedetails(inpUsername);
			break;
	default :
			System.out.println("Please choose either of the optoins 1 or 2");
			break;	
	
	}
	keyboard.close();
	lockerInput.close();
	
}

public static void registration() {
	// TODO Auto-generated method stub
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome to Registation screen                                    ");
	System.out.println("#######################################################");
	
	System.out.println("Enter username:");
	String username = keyboard.next();
	users.setUsername(username);
    System.out.println("Enter Password:");
    String password = keyboard.next();
    users.setPassword(password);
    
    output.println(users.getUsername());
    output.println(users.getPassword());
    System.out.println("Regitataion successful");
    output.close();
    }
public static void login() {
	// TODO Auto-generated method stub
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome to login screen                           ");
	System.out.println("#######################################################");
	
	System.out.println("Enter username:");
	String inpUsername = keyboard.next();
	boolean found = false;
	while (input.hasNext()) {
		if(input.next().equals(inpUsername)) {
			System.out.println("Enter Password : ");
			String inpPassword = keyboard.next();
			if(input.next().equals(inpPassword)) {
				System.out.println("you had successfuly logged in");
				found = true;
				lockerOptions(inpUsername);
				break;
			}
		}
	}
		if(!found) {
			System.out.println("Usernot found error 404");
		}
	}

public static void stroedetails(String loggedInUser) {
	// TODO Auto-generated method stub
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome Screen- Store the details screen                                    ");
	System.out.println("#######################################################");
	
	userdetails.setLoggedInUser(loggedInUser);
	System.out.println("enter sitename:");
	String sitename = keyboard.next();
    userdetails.setSitename(sitename);	
	
	System.out.println("enter username:");
	String username = keyboard.next();
	userdetails.setUsername(username);
    
	
	System.out.println("enter password:");
	String password = keyboard.next();
	userdetails.setPassword(password);
	
    
	lockerOutput.println(userdetails.getSitename());
	lockerOutput.println(userdetails.getUsername());
	lockerOutput.println(userdetails.getPassword());
    
	System.out.println("username and passowrd deatils are stored");
	lockerOutput.close();		
	}

public static void fetchdetails(String inpUsername) {
	// TODO Auto-generated method stub
	System.out.println("#####################################################");
	System.out.println("                                                     ");
	System.out.println("                                                      ");
	System.out.println("    Welcome Screen- Fetch userdetails                                    ");
	System.out.println("#######################################################");
	
	
	while(lockerInput.hasNext()) {
		if(lockerInput.next().equals(inpUsername)) {
		System.out.println("Enter sitedetails:" + lockerInput.next());
		System.out.println("Enter username:" + lockerInput.next());
		System.out.println("Enter Password:" + lockerInput.next());
		}
	}
	
	}

	
	

public static void application() {
	// TODO Auto-generated method stub
	File dbFile = new File("database.txt");
	File lockerFile = new File("locker-file.txt");
	
	try {
		input = new Scanner(dbFile);
		lockerInput = new Scanner(lockerFile);
		keyboard = new Scanner(System.in);
		
		output = new PrintWriter(new FileWriter(dbFile,true));
		lockerOutput = new PrintWriter(new FileWriter(lockerFile, true));
		users = new users();
		userdetails = new Userdetails();
	}
	catch (IOException e) 
		{
		System.out.println("File not found 404");
	}

}
}



