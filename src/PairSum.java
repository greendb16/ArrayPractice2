public class PairSum {
    public static void main(String[]args){
        int [] array1 = {1,7,6,5,9};
        int [] array2 = {2,7,6,3,4};

        for(int i=0; i<array1.length; i++){
            for(int p=0; p<array2.length; p++){
                 int sum = array1[i] + array2[p];
                if(sum ==13){
                    System.out.println("("+array1[i]+","+array2[p]+")");

                }
            }
        }
    }
}
