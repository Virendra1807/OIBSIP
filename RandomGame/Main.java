package OasisInfoProjects.RandomGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameInterface ng = new NumGuess();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tPlay The Game");
        ng.numGenerator();
        

        System.out.println("\nProvide your Choice");
        System.out.println("1 - Replay");
        System.out.println("2 - Exit");
        System.out.print("Select Option : ");
        int op = sc.nextInt();
        ng.rePlay(op);

        sc.close();
    }
}
