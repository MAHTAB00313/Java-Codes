import java.util.Scanner;

public class Recursion_7 {
    static String removeA(String s, int idx) {
        if(idx == s.length()) {
            return "";
        }

        String small = removeA(s, idx+1);
        char currnt = s.charAt(idx);

        if(currnt != 'a') {
            return currnt +small;
        } else {
            return small;
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));

       
    }
}