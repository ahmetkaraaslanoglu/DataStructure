public class Node {
    public Object data;
    public Node next;

    public Node() {
        this.data=0;
        this.next=null;
    }

    public Node(Object data){
        this.data=data;
        this.next=null;
    }

    public Node(Object data,Node next){
        this.data=data;
        this.next=next;
    }
}
