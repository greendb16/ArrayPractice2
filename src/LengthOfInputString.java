import java.util.Scanner;



public class LengthOfInputString {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter: a Word:\t");
        String input = key.nextLine();
        char [] myChars = input.toCharArray();
        int p=0;
        for( int i: myChars){
            p++;
            System.out.println(i);
           }
        System.out.println(p);
    }
}
