import Implementation.ChatServer;
import Implementation.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ChatServer rainbowSixSiege = new ChatServer("R6 Gang");

        User Hibana = new User("Hibana", rainbowSixSiege);
        User Ash = new User("Ash", rainbowSixSiege);
        User Lion = new User("Lion", rainbowSixSiege);

        //Registers users
        rainbowSixSiege.registerUser(Hibana);
        rainbowSixSiege.registerUser(Ash);
        rainbowSixSiege.registerUser(Lion);

        // Registered Users
        System.out.println(rainbowSixSiege);
        System.out.println();

        ArrayList<User> receivers = new ArrayList<>();
        receivers.add(Ash);
        receivers.add(Lion);
        Hibana.sendMessage(receivers, "Do we need a hard breacher ?");

        System.out.println("Hibana sent a message: ");
        System.out.println("Hibana sent Messages: ");
        System.out.println(Hibana.getSentChatHistory());
        System.out.println();
        System.out.println("Ash received Messages: ");
        System.out.println(Ash.getReceivedChatHistory());
        System.out.println();
        System.out.println("Lion received Messages: ");
        System.out.println(Lion.getReceivedChatHistory());

        // Ash send a message
        receivers.clear();
        receivers.add(Hibana);
        receivers.add(Lion);
        Ash.sendMessage(receivers, "Yes, we do. Only have soft breach");
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Ash sent a message: ");
        System.out.println("Ash sent Messages: ");
        System.out.println(Ash.getSentChatHistory());
        System.out.println();
        System.out.println("Hibana received Messages: ");
        System.out.println(Hibana.getReceivedChatHistory());
        System.out.println();
        System.out.println("Lion received Messages: ");
        System.out.println(Lion.getReceivedChatHistory());

        // Lion send a message
        receivers.clear();
        receivers.add(Ash);
        receivers.add(Hibana);
        Lion.sendMessage(receivers, "I will gather info");
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Lion sent a message: ");
        System.out.println("Lion sent Messages: ");
        System.out.println(Lion.getSentChatHistory());
        System.out.println();
        System.out.println("Hibana received Messages: ");
        System.out.println(Hibana.getReceivedChatHistory());
        System.out.println();
        System.out.println("Ash received Messages: ");
        System.out.println(Ash.getReceivedChatHistory());

        // Hibana send 2 more messages
        receivers.clear();
        receivers.add(Ash);
        Hibana.sendMessage(receivers, "You sure we can trust Lion?");
        Hibana.sendMessage(receivers, "He's 0 and 8, no?");

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Hibana sent a message: ");
        System.out.println("Hibana sent Messages: ");
        System.out.println(Hibana.getSentChatHistory());
        System.out.println();
        System.out.println("Ash received Messages: ");
        System.out.println(Ash.getReceivedChatHistory());
        System.out.println();
        System.out.println("Lion received Messages: ");
        System.out.println(Lion.getReceivedChatHistory());

        // Hibana Undo her last message
        Hibana.undoLastSentMessage();
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Hibana undo a message: ");
        System.out.println("Hibana sent Messages: ");
        System.out.println(Hibana.getSentChatHistory());
        System.out.println();
        System.out.println("Ash received Messages: ");
        System.out.println(Ash.getReceivedChatHistory());
        System.out.println();
        System.out.println("Lion received Messages: ");
        System.out.println(Lion.getReceivedChatHistory());

        // Ash Blocked Hibana for toxicity
        Ash.blockUser(Hibana);
        receivers.clear();
        receivers.add(Ash);
        receivers.add(Lion);
        Hibana.sendMessage(receivers, "Lion got skill issues");
        Hibana.sendMessage(receivers, "Try git gud");

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Testing blocking other users message");
        System.out.println("Hibana sent a message: ");
        System.out.println("Hibana sent Messages: ");
        System.out.println(Hibana.getSentChatHistory());
        System.out.println();
        System.out.println("Ash received Messages: ");
        System.out.println(Ash.getReceivedChatHistory());
        System.out.println();
        System.out.println("Lion received Messages: ");
        System.out.println(Lion.getReceivedChatHistory());

        //Iterate messages by sender
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("Iterate over Ash Messages and find all message sent by Hibana");
        Iterator senderIterator = Ash.iterator(Hibana);
        while (senderIterator.hasNext()) {
            System.out.println(senderIterator.next());
        }
    }
}