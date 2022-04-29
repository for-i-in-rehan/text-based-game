import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//inputs
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		//game variables 
		String[] monsters = {"medusa", "zombie cat", "warrior"};
		int enemyhealth = 100;
		int enemyattackdmg = 30;
		
		//player variables 
		int playerhealth = 90;
		int playerattackdmg = 40;
	
		
		
		boolean running = true;
		
		System.out.println("---------------------");
		System.out.println("Welcome to your Trial");
		System.out.println("---------------------");
		
		
GAME:
	while(running){
		
		int enhealth = rn.nextInt(enemyhealth);
		String enemy = monsters[rn.nextInt(monsters.length)];
		
		System.out.println( enemy + " has appeared \n");
		
		
		while(enhealth > 0){
			System.out.println("Your HP: " + playerhealth);
			System.out.println(enemy + "'s HP: " + enhealth);
			System.out.println("\nWhat would you like to do?");
			System.out.println("1. Attack");
			System.out.println("2. Run");
			
			String input = sc.nextLine();
			if(input.equals("1")) {
				int damagedealt = rn.nextInt(playerattackdmg);
				int damagetaken = rn.nextInt(enemyattackdmg);
				
				enhealth -= damagedealt;
				playerhealth -= damagetaken;
				
				System.out.println("You have striked the" + enemy + " for " + damagedealt + "damage");
				System.out.println("You recieved " + damagetaken + " in retaliation");
				
				if (playerhealth < 1) {
					System.out.println("You've taken too much damage, you can't carry on like this");
					break;
				}
			} else if(input.equals("2")) {
				System.out.println("You run away from the " + enemy);
				continue GAME;
				
			} else {
				System.out.println("Invalid command!");
			}
			
			if(playerhealth < 1) {
				System.out.println("You limp from battle weak");
				break;
			}
			
			System.out.println("--------------------------------");
			System.out.println(enemy + "was defeated");
			System.out.println("You have: " + playerhealth + " HP left");
			
			System.out.println("--------------------------------");
			System.out.println("What would you like to do now?");
			System.out.println("1. Continue fighting");
			System.out.println("2. Exit dungeon");
			
			String in = sc.nextLine();
			
			while(!in.equals("1") && !in.equals("2")) {
				System.out.println("Invalid command");
				in = sc.nextLine();
			}
			
			if(in.equals("1")) {
				System.out.println("You want to continue your trial");
			
			}else if(in.equals("2")) {
				System.out.println("You have exited the trial");
				break;
				
			}
			
			System.out.println("####################");
			System.out.println("THANKS FOR PLAYING");
			System.out.println("####################");
			
			
			
			
		}
	}
		





	}

}
