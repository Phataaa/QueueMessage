import java.util.LinkedList;

public class Stack<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int top; // Chỉ số của đỉnh của ngăn xếp

    public Stack() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.top = -1; // Ngăn xếp rỗng khi top = -1
    }

    // Phương thức để đẩy một phần tử lên đỉnh ngăn xếp
    public void push(T item) {
        elements[++top] = item;
    }

    // Phương thức để lấy một phần tử từ đỉnh ngăn xếp và loại bỏ nó
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[top--];
    }

    // Phương thức để xem phần tử ở đỉnh ngăn xếp mà không loại bỏ nó
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) elements[top];
    }

    // Phương thức để kiểm tra xem ngăn xếp có trống hay không
    public boolean isEmpty() {
        return top == -1;
    }

    // Phương thức để kiểm tra xem ngăn xếp có đầy hay không
    private boolean isFull() {
        return top == elements.length - 1;
    }


}