package mru.game.view;
import java.util.Scanner;

import mru.game.model.Player;

public class AppMenu {

    /**
     * This class will be used to show the menus and sub menus to the user It also
     * prompts the user for the inputs and validates them
     */
    Scanner input;
    
    public AppMenu() {
        input = new Scanner(System.in);
    }
    
    public void enterToContinue() {
    	System.out.println("Press \"Enter\" to continue...");
    	input.nextLine();
    }
    
    public char showMainMenu() {
        System.out.println("Select a option");
        System.out.println("\t(P) Play Game ");
        System.out.println("\t(S) Search ");
        System.out.println("\t(E) Save and Exit");
        System.out.print("Enter a choice: ");
        return input.nextLine().toLowerCase().charAt(0);
    }
    
    public char showSubMenu() {
        System.out.println("Select a option");
        System.out.println("\t (T) Top Player ");
        System.out.println("\t (N) Search By Name");
        System.out.println("\t (B) Back to main menu");
        System.out.print("Enter your Choice: ");
        char option = input.nextLine().toLowerCase().charAt(0);
        return option;
    }
    
    public char showBetmenu() {
        System.out.println("What do you want to bet on?");
        System.out.println("\t (P) Player Wins ");
        System.out.println("\t (B) Banker Wins");
        System.out.println("\t (T) Tie Game");
        System.out.print("Enter your Choice: ");
        char option = input.nextLine().toLowerCase().charAt(0);
        return option;
    }
    
    public String promptName() {
        System.out.print("What is your name: ");
        String name = input.nextLine().trim().toLowerCase();
        return name;
    }
    
    public Double promptBetAmount() {
    	System.out.println("How much do you want to bet ?");
    	Double val = input.nextDouble();
    	input.nextLine();
    	return val;
    }
    
    public char promptContinue() {
    	System.out.println("Do you want to play again (y/n)?");
    	char option = input.nextLine().toLowerCase().charAt(0);
        return option;
    }
    
    public void showPlayer(Player ply) {
	     if(ply !=null) {
	         System.out.println(ply);
	     }
	     else
	     {
	         System.out.println("No recorded found");
	     }
    }
    
	public int showGameMenu() {
        int guess;
        System.out.print("Please enter a number between 1 and 10: ");
        guess = input.nextInt();
        return guess;
	    
	}
	
	public void showGreaterMsg() {
	    System.out.println("My number is greater than yours!");
	    
	}
	
	public void showLessMessage() {
	    System.out.println("My number is less than yours!");
	    
	}
	
	public void showCongrats() {
	    System.out.println("Congrats! You won!!");
	}
	
	public void showSorryMsg(int number) {
	    System.out.println("Sorry my number was" + number);
	}
	
	public void showError() {
		System.out.println("ERROR: Please chose correct option");
	}
}
