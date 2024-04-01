package Eventhandling;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample {

    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Radio Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton greenButton = new JRadioButton("Green");
        JRadioButton blueButton = new JRadioButton("Blue");

       
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(greenButton);
        group.add(blueButton);

         
        ActionListener listener = new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {
                JRadioButton button = (JRadioButton) e.getSource();
                String color = button.getText();
                JOptionPane.showMessageDialog(frame, "Selected color: " + color);
            }
        };

        redButton.addActionListener(listener);
        greenButton.addActionListener(listener);
        blueButton.addActionListener(listener);

        
        JPanel panel = new JPanel();
        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blueButton);
        frame.add(panel);
 
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        
        frame.pack();
        frame.setVisible(true);
    }
}

