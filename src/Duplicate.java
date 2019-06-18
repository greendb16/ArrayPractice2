import java.util.Scanner;
import java.util.Arrays;
public class Duplicate {
    public static void main(String[]args){
        int [] myArray = new int[10];


        Scanner key = new Scanner(System.in);
        int total = myArray.length;
        for(int i=0; i<myArray.length; i++) {
            myArray[i] = key.nextInt();
        }
        for (int i=0; i<myArray.length-1;i++){
                for(int p= i+1;p<myArray.length-1;p++){
                    if(myArray[i]==myArray[p]){
                        myArray[p] = myArray[total-1];
                        total--;



                }



            }






            }
        int [] finalArray = Arrays.copyOf(myArray, total);
        for(int word:finalArray){
            System.out.println(word);
    }
}}
