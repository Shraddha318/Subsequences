import java.util.ArrayList;

public class AsciiValueOfChar {
    public static void main(String[] args) {
        String up="ab";
        String p="";
        //Ascii(p,up);
        System.out.println(AsciiSubseq(p,up));
    }
    static void Ascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        Ascii(p+ch,up.substring(1));
        Ascii(p+ch,up.substring(1));
        Ascii(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> AsciiSubseq(String p,String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = AsciiSubseq(p + ch, up.substring(1));
        ArrayList<String> right = AsciiSubseq(p, up.substring(1));
        ArrayList<String> ascii = AsciiSubseq(p + (int) ch, up.substring(1)); // Corrected this line
        ArrayList<String> ans = new ArrayList<>(left);
        ans.addAll(right);
        ans.addAll(ascii);
        return ans;
    }
}
