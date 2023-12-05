import java.util.LinkedList;

public class Queue<T> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int front; // chỉ số của phần tử đầu tiên trong hàng đợi
    private int rear;  // chỉ số của phần tử cuối cùng trong hàng đợi
    private int size;  // số lượng phần tử hiện tại trong hàng đợi

    public Queue() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Phương thức để thêm một phần tử vào hàng đợi
    public void enqueue(T item) {
        if(isFull()){
            System.out.println("Queue is full");
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = item;
        size++;
    }

    // Phương thức để loại bỏ một phần tử khỏi hàng đợi và trả về giá trị của phần tử đó
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = (T) elements[front];
        front = (front + 1) % elements.length;
        size--;
        return data;
    }

    // Phương thức để kiểm tra xem hàng đợi có trống hay không
    public boolean isEmpty() {
        return size == 0;
    }

    // Phương thức để kiểm tra xem hàng đợi có đầy hay không
    public boolean isFull() {
        return size == elements.length;
    }

    // Phương thức để truy cập đỉnh của hàng đợi mà không loại bỏ nó
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[front];
    }



}
