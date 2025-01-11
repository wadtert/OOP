package Lab4;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //Инициализация окошка
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,150);
        frame.setLocation(500,500);
        frame.setTitle("Конвертер");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3,2));

        frame.add(new JLabel("Введите число"));
        JSpinner NumberSpinner = new JSpinner();
        JComponent editor = NumberSpinner.getEditor();
        JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)editor;
        spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);
        frame.add(NumberSpinner);

        frame.add(new JLabel("Двоичный код"));
        JTextField BinaryField = new JTextField();
        BinaryField.setText("0");
        frame.add(BinaryField);

        frame.add(new JLabel("Код Грея"));
        JTextField GreyCodeField = new JTextField();
        GreyCodeField.setText("0");
        frame.add(GreyCodeField);

        NumberSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String NumberString = NumberSpinner.getValue().toString();

                int Number = Integer.parseInt(NumberString);
                String BinaryString = Integer.toBinaryString(Number);
                BinaryField.setText(BinaryString);

                int GreyCodeNumber = Number ^ (Number >> 1);
                String GreyCodeString = Integer.toBinaryString(GreyCodeNumber);
                GreyCodeField.setText(GreyCodeString);
            }
        });

        BinaryField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String BinaryString = BinaryField.getText();

                int Number= Integer.parseInt(BinaryString,2);
                NumberSpinner.setValue(Number);

                int GreyCodeNumber = Number ^ (Number >> 1);
                String GreyCodeString = Integer.toBinaryString(GreyCodeNumber);
                GreyCodeField.setText(GreyCodeString);
            }
        });
        frame.setVisible(true);
    }
}
