public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class MessageProcessor {
    private Queue<Message> messageQueue;
    private Stack<Message> messageStack;

    public MessageProcessor() {
        this.messageQueue = new Queue<>();
        this.messageStack = new Stack<>();
    }
    public boolean checkAmountMessage() {
        return messageQueue.isFull();
    }
    // Phương thức để gửi một tin nhắn vào hàng đợi
    public void sendMessage(Message message) {
        messageQueue.enqueue(message);
    }


    public void processMessages() {
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.dequeue();
            messageStack.push(message);
            System.out.println("Message received: " + message.getContent());
        }


    }

    public void processStackMessages() {
        while (!messageStack.isEmpty()) {
            Message message = messageStack.pop();
            System.out.println("Message processed: " + message.getContent());
        }
    }
}
