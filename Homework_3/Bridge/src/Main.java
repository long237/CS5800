import Contracts.MessageType;
import Contracts.MessagingApp;
import Implementation.ImageMessage;
import Implementation.TelegramMessagingApp;
import Implementation.TextMessage;
import Implementation.VideoMessage;

public class Main {
    public static void main(String[] args) {
        MessagingApp telegram = new TelegramMessagingApp(new TextMessage());
        MessagingApp whatsapp = new TelegramMessagingApp(new VideoMessage());
        MessagingApp facebook = new TelegramMessagingApp(new ImageMessage());

        System.out.println("Telegram messages");
        telegram.sendMessage();
        telegram.setMessageType(new VideoMessage());
        telegram.sendMessage();
        telegram.setMessageType(new ImageMessage());
        telegram.sendMessage();

        System.out.println("--------------");

        System.out.println("Whatsapp messages");
        whatsapp.sendMessage();
        whatsapp.setMessageType(new TextMessage());
        whatsapp.sendMessage();
        whatsapp.setMessageType(new ImageMessage());
        whatsapp.sendMessage();

        System.out.println("-----------");

        System.out.println();
        facebook.sendMessage();
        facebook.setMessageType(new TextMessage());
        facebook.sendMessage();
        facebook.setMessageType(new VideoMessage());
        facebook.sendMessage();
    }
}