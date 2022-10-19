public class Main {
    public static void main(String[] args) {

        Single_Linked_List linked_list = new Single_Linked_List();

        linked_list.insert(4);
        linked_list.insert(8);
        linked_list.insert(8);
        linked_list.insert(3);
        linked_list.insertToIndex(0,0);
        System.out.println(linked_list);
        linked_list.remove(0);
        System.out.println(linked_list);
        linked_list.insertToIndex(19,3);
        System.out.println(linked_list);
        linked_list.insert(10);
        System.out.println(linked_list);
        linked_list.remove(-1);
        System.out.println(linked_list);
        linked_list.remove(1);
        System.out.println(linked_list);
        System.out.println(linked_list.size());
        linked_list.insertToIndex(8,1);
        System.out.println(linked_list);
        linked_list.insert("a");
        System.out.println(linked_list);
        System.out.println(linked_list.indexOf(20));









    }
}
