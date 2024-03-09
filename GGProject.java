package Package1;
import java.util.Scanner;
class Guesser {
	public int takeGuessernum() {
		System.out.println("Guessser guess a number");
		Scanner sc =new Scanner(System.in);
		int Guessernum=sc.nextInt();
		return Guessernum;
	}
}
class Player {
	public int takePlayernum() {
		System.out.println("Player guess a number");
		Scanner sc =new Scanner(System.in);
		int Playernum=sc.nextInt();
		return Playernum;
	}
}
class Umpire {
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	void collectfromGuesser() {
		Guesser g=new Guesser();
	    numfromGuesser=g.takeGuessernum();
	}
	
	void collectfromPlayer() {
		Player P1=new Player();
		numfromPlayer1=P1.takePlayernum();
		
		Player P2=new Player();
		numfromPlayer2=P2.takePlayernum();
		
		Player P3=new Player();
		numfromPlayer3=P3.takePlayernum();
	}
	
	void compare() {
		if(numfromPlayer1==numfromGuesser) {
			if(numfromPlayer2==numfromGuesser && numfromPlayer3==numfromGuesser) {
				System.out.println("All players won the game");
			}
			else if(numfromPlayer2==numfromGuesser) {
				System.out.println("Player1 and Player2 won the game");
			}
			else if(numfromPlayer3==numfromGuesser) {
				System.out.println("Player1 and Player3 won the game");
			}
			else {
				System.out.println("Player1 won the game");
			}
		}
		else if(numfromPlayer2==numfromGuesser) {
			if(numfromPlayer3==numfromGuesser) {
				System.out.println("Player2 and Player3 won the game");
			}
			else {
				System.out.println("Player2 won the game");
			}
		}
		else if(numfromPlayer3==numfromGuesser) {
			System.out.println("Player3 won the game");
		}
		else {
			System.out.println("No Player won the game");
		}
	}
}
public class GGProject {
	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectfromGuesser();
		u.collectfromPlayer();
		u.compare();
	}

}
