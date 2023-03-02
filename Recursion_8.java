import java.util.ArrayList;

public class Recursion_8 {
    static ArrayList<String> getSSQ(String s) {

        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(s.length()==0) {
            ans.add("");
            return ans;
        }

        char curnt = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        // for simple FOR Loop
        // for(int i=0; i< smallAns.size(); i++) {
        //     String ss = smallAns.get(i);
        //     ans.add(ss);
        //     ans.add(curnt + ss);
        //   }

        //for is FOR Loop
        for(String ss: smallAns) {
            ans.add(ss);
            ans.add(curnt+ ss);
        }
        
        return ans;
 }
    public static void main(String[] args) {

        ArrayList<String> ans = getSSQ("abc");

    
        System.out.println(ans);
    
        
    }
}
