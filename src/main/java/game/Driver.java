package game;

import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        SnakesLadders newGame = new SnakesLadders();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while (!newGame.isGameOver()){
            System.out.println("Roll the dice (press Enter)");
            scan.nextLine();
            int die1 = 1 + rand.nextInt(6);
            int die2 = 1 + rand.nextInt(6);
            System.out.println("You rolled a " + die1 + " and a " + die2);
            String output = newGame.play(die1, die2);
            System.out.println(output);
        }

    }
}

/*
make code to return dice rolls, "Go again!", and "Player __ turn, roll the dice"
 */
