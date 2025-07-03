public class palindrome {




    public static void main(String[] args) {
        

            String pal_str = "rotators";



            String rev = "";



            for(int i= pal_str.length()-1; i>=0; i--){


                rev = rev + pal_str.charAt(i);
            }

            if(pal_str.equals(rev)){
                System.out.println(pal_str + "  its a plaindrom string");
            }else{
                System.out.println(pal_str + "   its not a palidrom string");
            }




    }

    
}