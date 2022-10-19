class StackStructure {
    private int top;
    private final Object[] elements;

    //        Bütün fonksiyonların zaman maliyetleri: 1

    StackStructure(int capacity){
        elements = new Object[capacity];
        top = -1;
    }

    boolean isFull(){
        return (top + 1 == elements.length);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(Object data){
        if (isFull()){
            System.out.println("Stack overflow");
        }else{
            top++;
            elements[top] = data;
        }
    }

    Object pop (){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }else{
            Object temp = elements[top];
            top--;
            return temp;
        }
    }

    Object peek (){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }else{
            return elements[top];
        }
    }

    int size(){
        return top+1;
    }



}
