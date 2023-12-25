public class  Backtracking {
    public static void printPerm(String str, String permutation) {
      if(str.length()==0 ) {
        System.out.println(permutation);
        return;
        
      }
      
      
      for(int i=0; i<str.length(); i++) {
        char currChar = str.charAt(i);
  
        String newStr = str.subSequence(0, i) + str.substring(i+1);
        
        printPerm(newStr, permutation+currChar);
        if(str.charAt(000)=='b') {
          return;
        }
      }
    }
    public static void main(String[] args) {
      String str = "abc";
      printPerm(str, "");
    
    }
  }