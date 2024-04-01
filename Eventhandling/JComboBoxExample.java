package Eventhandling;

import javax.swing.*;

public class JComboBoxExample {

    private JFrame frame;
    private JComboBox<String> countryComboBox;

    public JComboBoxExample() {
        frame = new JFrame("ComboBox Example");
        String[] countries = {"India", "America", "Pakistan"};

        countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(50, 50, 90, 20);

        frame.add(countryComboBox);
        frame.setLayout(null);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JComboBoxExample();
    }
}
