import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Bir kelime giriniz : ");
        String str = input.next();

        StackStructure s = new StackStructure(str.length());

        char ch;
        boolean flag = true;

        int len = str.length() / 2;

        for (int i=0;i<len;i++)
            s.push(str.charAt(i));

        if (str.length() % 2 == 1)
            len++;

        for (int i=len;i<str.length();i++)
        {
            ch = (Character) s.pop();
            if (ch!=str.charAt(i))
                flag = false;
        }

        if (flag) System.out.println(" is Palindrome");
        else System.out.println("is not Palindrome");
    }
}

