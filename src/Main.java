import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[!@#$%^&*(),.?\":{}|<>]";
        Pattern pattern = Pattern.compile(regex);
        MessageProcessor messageProcessor = new MessageProcessor();
        System.out.println("Enter message");
        while (true) {
            String message = scanner.nextLine();
            Matcher matcher = pattern.matcher(message);
            if (message.length() > 250 ||matcher.find()) {
                System.out.println("Invalid message");
            } else {
                messageProcessor.sendMessage(new Message(message));
            }
            if (messageProcessor.checkAmountMessage()){
                break;
            }
        }
        System.out.println("Queue is full");
        // Xử lý tin nhắn từ hàng đợi và đẩy vào ngăn xếp
        messageProcessor.processMessages();

        // Xử lý tin nhắn từ ngăn xếp
        messageProcessor.processStackMessages();

        
    }
}