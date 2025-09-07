/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
}
import java.util.Random;

public class Message {
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String messageText;

    public Message(int messageNumber, String recipient, String messageText) {
        this.messageID = generateMessageID();
        this.messageNumber = messageNumber;
        this.recipient = recipient;
        this.messageText = messageText;
    }

    public String generateMessageID() {
        Random rand = new Random();
        long num = (long)(Math.random() * 1_000_000_0000L);
        return String.format("%010d", num);
    }

    public boolean checkMessageID() {
        return this.messageID.length() == 10;
    }

    public boolean checkRecipientCell() {
        return recipient.startsWith("+27") && recipient.length() <= 13 && recipient.length() >= 10;
    }

    public String createMessageHash() {
        String[] words = messageText.split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        String hash = messageID.substring(0, 2) + ":" + messageNumber + ":" + firstWord + lastWord;
        return hash.toUpperCase();
    }

    public String sendMessageOption(String option) {
        switch (option.toLowerCase()) {
            case "send":
                return "Message successfully sent.";
            case "discard":
                return "Message discarded.";
            case "store":
                return "Message successfully stored.";
            default:
                return "Invalid option.";
        }
    }

    public String printMessage() {
        return "Message ID: " + messageID + "\nMessage Hash: " + createMessageHash() +
                "\nRecipient: " + recipient + "\nMessage: " + messageText;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getMessageID() {
        return messageID;
    }
}
