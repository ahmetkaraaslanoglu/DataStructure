import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir kelime giriniz : ");
        String word = input.next();

        StackStructure s = new StackStructure(word.length());

        for (int i =0; i<word.length(); i++){
            s.push(word.charAt(i));
        }

        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
