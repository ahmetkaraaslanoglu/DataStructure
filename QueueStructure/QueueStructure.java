public class QueueStructure {
    private int rear,front;
    private Object[] element;

    QueueStructure(int capacity){
        element = new Object[capacity];
        rear = -1;
        front =0;
    }

    void Enqueue(Object data){
        rear++;
        element[rear] = data;

    }

    Object Dequeue(){
        Object temp = element[front];
        element[front] = null;
        front--;
        return temp;
    }

    void size (){
        System.out.println((rear-front)+1);
    }

    Object peek(){
        return element[front];
    }

    void print(){
        for (int i=0; i<element.length;i++){
            System.out.println(element[i]);
        }
    }
}
