package Lab2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
        frame.setTitle("ЗЕЛЬЕМАШИНА");
        frame.setVisible(true);
        frame.setLayout(new GridLayout(5,2));

        frame.add(new JLabel("Основа"));
        JComboBox<String> PotionBox = new JComboBox<String>(new String[] {"Этанол","Родниковая вода","Туман истории","Сомнительная слизь"});
        frame.add(PotionBox);
        final JLabel PotionLabel = new JLabel("10");
        PotionBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (PotionBox.getSelectedItem().equals("Этанол")) {
                    PotionLabel.setText("10");
                }
                if (PotionBox.getSelectedItem().equals("Родниковая вода")) {
                    PotionLabel.setText("5");
                }
                if (PotionBox.getSelectedItem().equals("Туман истории")) {
                    PotionLabel.setText("30");
                }
                if (PotionBox.getSelectedItem().equals("Сомнительная слизь")) {
                    PotionLabel.setText("15");
                }
            }
        });
        frame.add(PotionLabel);

        frame.add(new JLabel("Дополнение"));
        JComboBox<String> AdditionBox = new JComboBox<String>(new String[]{"Драконий зуб", "Ночной кошмар", "Усталый осьминог", "Медвежья печень"});
        frame.add(AdditionBox);
        final JLabel AdditionLabel = new JLabel("50");
        AdditionBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (AdditionBox.getSelectedItem().equals("Драконий зуб")) {
                    AdditionLabel.setText("50");
                }
                if (AdditionBox.getSelectedItem().equals("Ночной кошмар")) {
                    AdditionLabel.setText("5");
                }
                if (AdditionBox.getSelectedItem().equals("Усталый осьминог")) {
                    AdditionLabel.setText("15");
                }
                if (AdditionBox.getSelectedItem().equals("Медвежья печень")) {
                    AdditionLabel.setText("10");
                }
            }
        });
        frame.add(AdditionLabel);

        frame.add(new JLabel("Ложек лунной пыли"));
        JTextField MoonField = new JTextField();
        frame.add(MoonField);
        final JLabel MoonLabel = new JLabel("");
        MoonField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                MoonUpdate();
            }
            public void removeUpdate(DocumentEvent e) {
                MoonUpdate();
            }
            public void insertUpdate(DocumentEvent e) {
                MoonUpdate();
            }
            public void MoonUpdate() {
                if (MoonField.getText().isEmpty()) {
                    MoonLabel.setText("");
                }
                else {
                    float MoonNum = Float.parseFloat(MoonField.getText());
                    MoonLabel.setText(String.valueOf(MoonNum*2));
                }
            }

        });
        frame.add(MoonLabel);

        frame.add(new JLabel("Опарыши"));
        JRadioButton WormButton = new JRadioButton("");
        frame.add(WormButton);
        final JLabel WormLabel = new JLabel("");
        WormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (WormButton.isSelected()) {
                    WormLabel.setText("10");
                }
                else {
                    WormLabel.setText("");
                }
            }
        });
        frame.add(WormLabel);

        JButton FinButton = new JButton("Приготовить!");
        frame.add(FinButton);
        JLabel FinLabel = new JLabel("");
        FinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float Fin = 0F;
                if (PotionLabel.getText() != "") {
                    Fin += Float.parseFloat(PotionLabel.getText());
                }
                if (AdditionLabel.getText() != ""){
                    Fin += Float.parseFloat(AdditionLabel.getText());
                }
                if (MoonLabel.getText() != ""){
                    Fin += Float.parseFloat(MoonLabel.getText());
                }
                if (WormLabel.getText() != ""){
                    Fin += Float.parseFloat(WormLabel.getText());
                }
                FinLabel.setText(String.valueOf(Fin));
            }
        });
        frame.add(FinLabel);
    }


}
