public class Recursion_7_i {
    static String revesString(String s, int idx) {
        if(idx == s.length()) {
            return "";
        }

        String small = revesString(s, idx+1);

        return small + s.charAt(idx);
    }

    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(revesString(s, 0));
    }
}