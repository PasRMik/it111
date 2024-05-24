package src.src;
import javax.swing. *;

import java.awt.*;

import static java.awt.SystemColor.text;

public class ShowWindow2 {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS



        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 400;

        // Create a window

        JFrame window = new JFrame();
        JLabel label1 = new JLabel("My First Big Label");

        JTextField myTextField1 = new JTextField();


        // set the title
        window.setTitle("A Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        // display the window - if we do not display the window, it will not display!
        // displaying the window is a boolean
        window.setVisible(true);


        window.getContentPane().setBackground(Color.RED);
        window.setLocation(500, 300);
        window.setBounds(20, 50, 220, 30);
        window.setFont(new Font("Verdana", Font.PLAIN, 20));
        myTextField1.setBounds(20, 80, 300, 50);

    }


    }




