class FrstNonRepeatingChar {



    public static void main(String[] args) {
        

        
            String s = "progrrraming";


            int[] freq = new int[256];



            // first loop on string to iterate all string character 


            for(int i=0; i < s.length(); i++){
                char ch =s.charAt(i);
                freq[ch]++;

            }


              // second loop for check nonrepeting frequency
              
              for(int i=0; i < s.length(); i++){

                char ch =s.charAt(i);
                if(freq[ch]==1)
                {
                    System.out.println(ch + "      non repting ");
                }else {
                    System.out.println(ch + "     repeating");
                }
              }








    }

}
