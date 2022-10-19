public class Main {
    public static void main(String[] args) {
        StackStructure stack = new StackStructure(10);
        stack.push("Ahmet");
        stack.push(1);
        stack.push('s');
        stack.push(3.14);

        System.out.println(stack.size());
        System.out.println("-----------------");
        System.out.println(stack.peek());
        System.out.println("-----------------");
        System.out.println(stack.pop());
        System.out.println("-----------------");
        System.out.println(stack.isEmpty());

    }
}