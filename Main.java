package miniprojekt1;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
	
				while (true) {
				Scanner scanner = new Scanner(System.in);
				
				int randomNumber = (int)(Math.random()*100 + 1);
				int userInput = -1;
				int tries=0;

				System.out.println("Guess the number between 0-100!");
										
				while (!(isGuessCorrect(userInput, randomNumber))) {
				
				userInput = scanner.nextInt();
				
				if (userInput < randomNumber) {
					System.out.println("You guessed too low");		
				}	
				else if (userInput > randomNumber){
						System.out.println("You guessed too high");
				}
				tries++;
				}
				System.out.println("You guessed correct");
				System.out.println("Amount of attempts: " + tries);
				}
				
	}//mainEnd
		
		static boolean isGuessCorrect(int x, int y) {
			return x==y;
		}
		
}//classEnd