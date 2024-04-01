package Eventhandling;

import javax.swing.*;

public class JListExample {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a DefaultListModel
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement("Item 1");
        model.addElement("Item 2");
        model.addElement("Item 3");

        // Create a JList with the model
        JList<String> list = new JList<>(model);

        // Add the list to the frame
        frame.getContentPane().add(new JScrollPane(list));

        // Set size and visibility
        frame.pack();
        frame.setVisible(true);
    }
}

