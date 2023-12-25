public class Recursion_SubSeq {
    static void prntSSQ(String s, String currAns) {
        //base case
        if(s.length() == 0) {
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);
        String remainAns = s.substring(1);
        prntSSQ(remainAns, currAns + curr); // added
        prntSSQ(remainAns, currAns); // not added
    }
    public static void main(String[] args) {
        String s = "abc";
        prntSSQ(s, " ");
    }
}
