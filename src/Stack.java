public interface Stack <T> {

    void push(T  item);
    T pop() throws MyEmptyStackException;

    void peek();
    boolean isEmpty();


}
