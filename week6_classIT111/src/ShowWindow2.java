package src.src;
import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {
        // declare our variables
        // we are going to make them CONSTANTS
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 400;

        // Create a window
        JFrame window = new JFrame();

        // set the title
        window.setTitle("A Simple Window");

        // setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        // Get the content pane and set layout and background color
        Container container = window.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.RED);

        // Create and add the first label
        JLabel label1 = new JLabel("My First Big Label!!!");
        label1.setBounds(20, 20, 300, 50);
        label1.setFont(new Font("Verdana", Font.PLAIN, 18)); // Not bold
        container.add(label1);

        // Create and add the first text field
        JTextField myTextField1 = new JTextField();
        myTextField1.setBounds(20, 80, 300, 50);
        container.add(myTextField1);

        // Create and add the second label
        JLabel label2 = new JLabel("My Second Big Label!");
        label2.setBounds(20, 150, 300, 50);
        label2.setFont(new Font("Verdana", Font.BOLD, 18)); // Bold
        container.add(label2);

        // Create and add the second text field
        JTextField myTextField2 = new JTextField();
        myTextField2.setBounds(20, 210, 300, 50);
        container.add(myTextField2);

        // display the window - if we do not display the window, it will not display!
        // displaying the window is a boolean
        window.setVisible(true);
    }
}