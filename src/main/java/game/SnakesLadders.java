package game;

import java.util.HashMap;
import java.util.Map;

public class SnakesLadders {

    private int p1 = 0;
    private int p2 = 0;
    private int playerTurn = 1;
    private boolean gameOver = false;
    private Map<Integer, Integer> ladders = new HashMap<>();
    private Map <Integer, Integer> snakes = new HashMap<>();

    public boolean isGameOver() {
        return gameOver;
    }

    public SnakesLadders() {
        ladders.put(2, 38);
        ladders.put(7, 14);
        ladders.put(8, 31);
        ladders.put(15, 26);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(78, 98);
        ladders.put(87, 94);

        snakes.put(99, 80);
        snakes.put(95, 75);
        snakes.put(92, 88);
        snakes.put(89, 68);
        snakes.put(74, 53);
        snakes.put(64, 60);
        snakes.put(62, 19);
        snakes.put(49, 11);
        snakes.put(46, 25);
        snakes.put(16, 6);
    }
    public String play(int die1, int die2) {
        if (gameOver){
            return "Game over!";
        }
        int sum = die1 + die2;

        if(playerTurn == 1){
            if(p1 + sum < 100){
                p1 += sum;
            } else if (p1 + sum == 100){
                gameOver = true;
                return "Player 1 Wins!";
            } else {
                p1 = 100 - (p1 + sum - 100);
            }
            if(ladders.containsKey(p1)) {
                p1 = ladders.get(p1);
            } else if(snakes.containsKey(p1)){
                p1 = snakes.get(p1);
            }

            if (die1 != die2){
                playerTurn = 2;
            }

            return "Player 1 is on square " + p1;
        } else {
            if(p2 + sum < 100){
                p2 += sum;
            } else if (p2 + sum == 100){
                gameOver = true;
                return "Player 2 Wins!";
            } else {
                p2 = 100 - (p2 + sum - 100);
            }
            if(ladders.containsKey(p2)) {
                p2 = ladders.get(p2);
            } else if(snakes.containsKey(p2)){
                p2 = snakes.get(p2);
            }

            if (die1 != die2){
                playerTurn = 1;
            }

            return "Player 2 is on square " + p2;
        }
    }
}



/*
Ladders: 2   7    8   15  21  28  36  51  71  78  87
    to   38  14   31  26  42  84  44  67  91  98  94


Snakes:   99  95  92  89  74  64  62  49  46  16
          80  75  88  68  53  60  19  11  25  6
*/



/*
Ladders: 2   7    8   15  21  28  36  51  71  78  87
    to   38  14   31  26  42  84  44  67  91  98  94


Snakes:   99  95  92  89  74  64  62  49  46  16
          80  75  88  68  53  60  19  11  25  6
*/