package com.company;

public class Main {

    public static void main(String[] args) {
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Priya", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Ankit", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Yash", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Riya", position);

    }
    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println( name +" managed to get into position " + position
                + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score)
    {
        int ps;
        if(score>=1000)
        {
            ps=1;
        }
        else if(score>=500)
        {
            ps=2;
        }
        else if(score>=100)
        {
            ps=3;
        }
        else
        {
            ps=4;
        }
        return ps;
    }
}

