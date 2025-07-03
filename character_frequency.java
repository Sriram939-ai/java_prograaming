public class character_frequency {
    


    public static void main(String[] args) {
        

             String s = "aaabbbccdddrtuooopppnbvdhmgfhdfghj";

                int[] frq = new int[256];



                for(int i=0; i<s.length(); i++){
                     char ch =s.charAt(i); 
                         frq[ch]++;
                }


                for(int i=0; i< frq.length; i++){
                    if (frq[i]> 0 ){{

                        System.out.println((char) i +  "  " + frq[i] );
                    }


                        
                    

                } 


            }
    
}
}