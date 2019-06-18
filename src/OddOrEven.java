import java.util.Scanner

public class OddOrEven {
    public static void main(String[]args){
        Scanner key = new Scanner(System.in);
        int[] myArray = new int[10];
        int odd = 0;
        int even =0;
        System.out.println("Enter 10 numbers: ");
        for (int i =0; i<myArray.length; i++){
            myArray[i] = key.nextInt();
        }
        for(int myVar:myArray){
            int test = myVar%2;
            if(test ==0){
                even++;
            }
            else{odd++;}
        }
    }
}
