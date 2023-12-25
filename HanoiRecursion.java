public class HanoiRecursion {

    public static void TowerofHanoi(int n,String scr,String hlpr,String desnt) {

        if(n==1) {
            System.out.println(" transfer "+ n + " from "+ scr  + " to " + desnt);
            return;
        }
        TowerofHanoi(n-1, scr, desnt, hlpr);
        System.out.println(" transfer "+ n + " from "+ scr + " to " + desnt);
        TowerofHanoi(n-1, hlpr, scr, desnt);
    }

    public static void main(String arrgs[]) {
        int n = 4;
        TowerofHanoi(n, "S", "H", "D");


    } 
}