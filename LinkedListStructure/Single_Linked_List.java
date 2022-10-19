public class Single_Linked_List {
    private Node head;

    public String toString() {
        if(head== null) {
            return "[]";
        }else {
            String result="[" +head.data;
            Node current=head.next;
            while(current !=null) {
                result+=" , "+current.data;
                current=current.next;
            }
            result+="]";
            return result;
        }
    }

    public void insert(Object dataToAdd){
        Node newData = new Node(dataToAdd);
        if (head == null){
            head = newData;
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newData;
            newData.next=null;
        }

    }

    public void insertToIndex(Object dataToAdd,int index){
        Node newData = new Node(dataToAdd);
        if (index == 0){
            Node temp = head;
            newData.next=temp;
            head = newData;
        } else {
            Node current = head;
            for (int i = 0; i<index-1;i++){
                current = current.next;
            }
            Node var = current.next;
            current.next=newData;
            newData.next = var;
        }
    }

    public void remove(int index){
        if (index == 0){
            head = head.next;
        } else if (index == -1) {
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        } else {
            Node temp = head;
            for (int i =0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    
    public int size(){
        Node temp = head;
        int count = 0;
        if (head == null){
            System.out.println("Linked List is empty");

        }else {
            while (temp.next != null){
                temp = temp.next;
                count++;
            }
        }
        return count+1;
    }

    public Object indexOf(int index){
        Node temp = head;
        int count =0;
        while (temp != null){
            if (count == index){
                return temp.data;
            }
            count++;
            temp = temp.next;

        }
        return "Insufficient list length";
    }
}
