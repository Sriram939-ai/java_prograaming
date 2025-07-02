package java_8_features;

public class reverse_strings {


    public static void main(String[] args) {

        String input = "shubham I M THERE , COME PLZ";
        char[] chars = input.toCharArray() ;
        String rev = "";

        for (int i = chars.length-1;  i >=0; i--){
            rev = rev+ chars[i];
        }
        System.out.println(rev);
    }



}
