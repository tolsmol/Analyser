package uk.ac.cam.amw223.Analyser;

import javax.swing.*;
import java.awt.*;

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

        //window
        JFrame window = new JFrame();
        JPanel panel = new JPanel();
        window.setSize(1000,700);
        window.setTitle("Analyser");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(panel);
        //panel
        panel.setLayout(new BorderLayout());
        //top
        JLabel title = new JLabel("Task List");
        panel.add("North", title);
        // //bottom
        // panel.add("South");
        // //right
        // panel.add("East");
        // //left
        // panel.add("West");
        //center
        JPanel pnlTaskList = new JPanel();
        GridLayout layTaskList = new GridLayout(3,10);
        pnlTaskList.setLayout(layTaskList);
        panel.add("Center", pnlTaskList);

        window.setVisible(true);
    }

}