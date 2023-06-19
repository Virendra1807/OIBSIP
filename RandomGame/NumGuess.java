package OasisInfoProjects.RandomGame;

import java.util.Random;
import java.util.Scanner;

public class NumGuess implements GameInterface {

    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    @Override
    public void numGenerator() {
        int ranNum = rd.nextInt(101);

        while (true) {
            System.out.print("Guess a Number : ");
            int reply = sc.nextInt();

            if (reply > ranNum) {
                System.out.println("Number is Smaller than your guess number");
            } else if (reply < ranNum) {
                System.out.println("Number is Bigger than your guess number");
            } else if (reply == ranNum) {
                System.out.println("\n\tYou guess Right Number \n\tYou WON the Game ...!\n");
                break;
            } else {
                System.out.println("Oop's Something went Wrong");
            }
        }
    }

    @Override
    public void rePlay(int op) {
        if (op == 1) {
            numGenerator();
        } else if (op == 2) {
            System.out.println("Thanks for Visiting...!");
            System.exit(0);
        } else {
            System.out.println("You Select Wrong Option");
            System.exit(0);
        }
    }
}
