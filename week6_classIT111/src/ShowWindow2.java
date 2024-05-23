package src.src;
import javax.swing. *;

import java.awt.*;

import static java.awt.SystemColor.text;

public class ShowWindow2 extends JFrame {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS

        JTextField  MyFirstBigLabel;
        JLabel myLabel;


        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 400;

        // Create a window

        JFrame window = new JFrame();
        JLabel Label1 = new JLabel("My First Big Label!!");
        JLabel Label2 = new JLabel("My Second Big Label!");

        // set the title
        window.setTitle("A Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        // display the window - if we do not display the window, it will not display!
        // displaying the window is a boolean
        window.setVisible(true);

    }

    public static void Background() {

        // JFrame color
        getContentPane().setBackground(Color.red);
        setLocation();
        setBounds();
        setFont();

    }
}



