package com.katapios.chat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ChatClient {

    private JTextArea output;
    private JTextField input;
    private JButton sendButton;
    private JButton quitButton;

    public ChatClient() {
        this.output = new JTextArea(10, 50);
        this.input = new JTextField(50);
        this.sendButton = new JButton("Send");
        this.quitButton = new JButton("Quit");
    }

    public void launchFrame() {
        JFrame frame = new JFrame("Bank chat rooom");
        frame.setLayout(new BorderLayout());

        frame.add(output, BorderLayout.CENTER);
        frame.add(input, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1));
        buttonPanel.add(sendButton);
        buttonPanel.add(quitButton);

        frame.add(buttonPanel, BorderLayout.EAST);
        output.setEditable(false);

        input.addActionListener(new SendHandler());
        sendButton.addActionListener(new SendHandler());
        quitButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
         ChatClient myChat = new ChatClient();
         myChat.launchFrame();
    }

    private class SendHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = input.getText();
            output.append(message+"\n");
            input.setText("");
        }
    }

}
