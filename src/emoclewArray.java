public class emoclewArray {
    public static void main(String[]args){

        String myString = "welcome";

        for(int i=6; i<=myString.length();i-- ){
            System.out.println(myString.charAt(i));
            if (i==0){
            break;
            }
        }

    }
}
