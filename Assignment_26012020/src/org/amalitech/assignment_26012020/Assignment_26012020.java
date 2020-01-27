package org.amalitech.assignment_26012020;

import java.util.Scanner;

public class Assignment_26012020 {
	
	// Initializations
	   static Scanner keyboardInput = new Scanner(System.in);
	   static String keyboardInputString;
	   static String codeTriggerStarterString="Start";
	   static String codeTriggerEnderString="End";

	    public static void main(String[] args) {
	        System.out.println(
	        		"Enter 'start' to run the program"
	        		);
	        keyboardInputString = keyboardInput.nextLine();

	        if (keyboardInputString.equalsIgnoreCase
	        		(codeTriggerStarterString)) {
	            reRunKeyboardInput();
	        }else{
	            System.out.println("Program just ended");
	            System.exit(0);
	        }
	    }  // End of main method

	    private static void reRunKeyboardInput() {
	        
	    	while (keyboardInputString.equalsIgnoreCase
	        		(codeTriggerStarterString)) {
	        	
	            Scanner scanner = new Scanner(System.in);
	            String anyWordOrStatement = scanner.nextLine();
	        
	            System.out.println(anyWordOrStatement);

	            if (anyWordOrStatement.equalsIgnoreCase
	            		(codeTriggerEnderString)){
	            	
	            	keyboardInputString = "End";
	                System.out.println("Program just ended");
	                break;
	            }else{
	            	reRunKeyboardInput();
	            }
	        }
	    }
	}
