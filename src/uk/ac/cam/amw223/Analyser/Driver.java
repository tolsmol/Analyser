package uk.ac.cam.amw223.Analyser;

import javax.swing.*;

public class Driver
{
    public static void main(String[] args)
    {
        //Tracking
        Mood[] moods = new Mood[] {
            new Mood ("Happiness"),
            new Mood ("Calmness"),
            new Mood ("Fulfillment"),
            new Mood ("Social"),
            new Mood ("Energy")
        };
        JFrame window = new JFrame();
        window.setSize(1000,300);
        window.setTitle("Analyser");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
    }
}