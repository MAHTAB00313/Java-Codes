public class hashIntrQ {

   static boolean fun(String s1, String s2) {
        int count =0;

        if(s1.length()==s2.length()) {

            for(int i=0;i<s1.length();i++) {
                char curr1 = s1.charAt(i);

                for(int j=0;j<s2.length();j++) {
                    char curr2 = s2.charAt(j);

                    if(curr1 == curr2) {
                        count = 1;
                        break;
                    }

                    else if(j==s2.length()-1 && count == 0) {
                        return false;       
                    }
                }
                count = 0; 
            }
        } else {
            count = 1;
        }

        return count == 0;

    }



    public static void main(String[] args) {
        String s1 = "abcda";
        String s2 = "dbcaw";

       System.out.println(fun(s1,s2)); 


    }
}
