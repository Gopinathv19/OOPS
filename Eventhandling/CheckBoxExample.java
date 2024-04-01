package Eventhandling;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Select me");

        // Add an action listener to the checkbox
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Checkbox is selected!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Checkbox is deselected.");
                }
            }
        });

        // Add the checkbox to the frame
        frame.add(checkBox);

        // Set size and visibility
        frame.pack();
        frame.setVisible(true);
    }
}
