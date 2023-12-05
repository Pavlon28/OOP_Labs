package Laborator_3.Queue;

public interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    boolean isEmpty();
    int size();
}