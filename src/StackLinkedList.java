public class StackLinkedList<T> implements Stack<T>{

    StackItem top;
    @Override
    public void push(T item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop() {
        Object tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    public void displayStack(){
        StackItem<T> tempNode = top;
        if(this.isEmpty()){
            System.out.println("the stack is empty");
        }else{
            do{
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext()
            }
            while (tempNode.getNext()!= null);
                 System.out.println(tempNode.getData());
                 tempNode = tempNode.getNext();
        }

    }

    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }
}
