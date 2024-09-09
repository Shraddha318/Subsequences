import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        String p = "";
        String up = "Abc";
        //subsequence(p, up);
        System.out.println(subseq(p, up));
    }

    static void subsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }
    public static ArrayList<String> subseq(String p, String up) {
     if(up.isEmpty()) {
         ArrayList<String> list = new ArrayList<>();
         list.add(p);
         return list;
     }
     char ch=up.charAt(0);
     ArrayList<String> left = subseq(p+ch, up.substring(1));
     ArrayList<String> right = subseq(p, up.substring(1));
     left.addAll(right);
     return left;
    }
}
