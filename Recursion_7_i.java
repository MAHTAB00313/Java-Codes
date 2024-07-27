public class Recursion_7_i {
    static String revsString(String s, int idx) {
        if(idx == s.length()) {
            return "";
        }
        String small = revsString(s, idx+1);
        return small + s.charAt(idx);
    }

    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(revsString(s, 0));
    }
}