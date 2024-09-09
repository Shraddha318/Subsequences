public class SkipString {
    public static void main(String[] args) {
        String str="Apple";
        str=str.toLowerCase();
        System.out.println(skip(str));
    }

    public static String skip(String s) {
        if(s.isEmpty()) return s;
        if(s.startsWith("app")){
            return skip(s.substring(3));
        }
        else{
            return s.charAt(0)+skip(s.substring(1));
        }
    }
}