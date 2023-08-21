

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task2 {
    public static void main(String[] args) {
            JFrame frame = new JFrame("Word Counter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 1000);
            frame.setLayout(null);

            JLabel label = new JLabel("Enter a sentence or text:");
            label.setBounds(400, 200, 200, 20);
            frame.add(label);

            JTextField textField = new JTextField();
            textField.setBounds(400, 230, 250, 30);
            frame.add(textField);

            JButton countButton = new JButton("Count Words");
            countButton.setBounds(400, 300, 120, 30);
            frame.add(countButton);

            JLabel resultLabel = new JLabel("Number of words:");
            resultLabel.setBounds(550, 300, 120, 30);
            frame.add(resultLabel);

            countButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String input = textField.getText();
                    int wordCount = countWords(input);
                    resultLabel.setText("Number of words: " + wordCount);
                }
            });

            frame.setVisible(true);
        }

        public static int countWords (String input){
            if (input == null || input.isEmpty()) {
                return 0;
            }

            String[] words = input.split("\\s+");
            return words.length;
        }
    }

