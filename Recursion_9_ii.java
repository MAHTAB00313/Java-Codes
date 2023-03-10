/*
    Given a String containing digits from 2-9 inclusive, return all possible letter combinations
    that the number could represent. Return the answer in any order.
    Input: digits = "23"
    Output: "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
 */
public class Recursion_9_ii {
    static void possCom(String dig, String[] kyp, String result ) {
        if(dig.length()==0) {
            System.out.print(result+ " ");
            return;
        }

        int currNum = dig.charAt(0) - '0';

        String currChoise = kyp[currNum];

        for(int i=0; i<currChoise.length();i++) {
            possCom(dig.substring(1), kyp, result + currChoise.charAt(i));
        }


           
    }
    public static void main(String[] args) {
        String dig = "23";
        String[] kyp = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        possCom(dig, kyp, "");

    }
}
