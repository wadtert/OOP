package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //Инициализация окошка
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 150);
        frame.setLocation(500, 500);
        frame.setTitle("Калькулятор");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(3, 2));

        frame.add(new JLabel("Первое число"));
        JTextField FirstNumField = new JTextField();
        frame.add(FirstNumField);

        frame.add(new JLabel("Второе число"));
        JTextField SecondNumField = new JTextField();
        frame.add(SecondNumField);

        JButton SumButton = new JButton("+");
        JButton DiffButton = new JButton("-");
        JButton MulButton = new JButton("*");
        JButton QuoButton = new JButton("/");
        JPanel LeftPanel = new JPanel();
        LeftPanel.add(SumButton);
        LeftPanel.add(DiffButton);
        LeftPanel.add(MulButton);
        LeftPanel.add(QuoButton);
        frame.add(LeftPanel);

        JTextField FinTextField = new JTextField();
        frame.add(FinTextField);

        SumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float FirstNum = Float.parseFloat(FirstNumField.getText());
                    Float SecondNum = Float.parseFloat(SecondNumField.getText());
                    Float FinNum = FirstNum + SecondNum;
                    FinTextField.setText(FinNum.toString());
                }
                catch (NumberFormatException nfe) {
                    FinTextField.setText("Неверно задан формат чисел");
                }
            }
        });

        DiffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float FirstNum = Float.parseFloat(FirstNumField.getText());
                    Float SecondNum = Float.parseFloat(SecondNumField.getText());
                    Float FinNum = FirstNum - SecondNum;
                    FinTextField.setText(FinNum.toString());
                }
                catch (NumberFormatException nfe) {
                    FinTextField.setText("Неверно задан формат чисел");
                }
            }
        });

        MulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float FirstNum = Float.parseFloat(FirstNumField.getText());
                    Float SecondNum = Float.parseFloat(SecondNumField.getText());
                    Float FinNum = FirstNum * SecondNum;
                    FinTextField.setText(FinNum.toString());
                }
                catch (NumberFormatException nfe) {
                    FinTextField.setText("Неверно задан формат чисел");
                }
            }
        });

        QuoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float FirstNum = Float.parseFloat(FirstNumField.getText());
                    Float SecondNum = Float.parseFloat(SecondNumField.getText());
                    if (SecondNum == 0) {
                        FinTextField.setText("Деление на ноль!");
                    }
                    else {
                        Float FinNum = FirstNum / SecondNum;
                        FinTextField.setText(FinNum.toString());
                    }
                }
                catch (NumberFormatException nfe) {
                    FinTextField.setText("Неверно задан формат чисел");
                }
            }
        });

        frame.setVisible(true);
    }
}