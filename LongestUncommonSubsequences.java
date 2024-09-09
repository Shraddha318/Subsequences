public class LongestUncommonSubsequences {
    public static void main(String[] args) {
        String a = "abcsdsa";
        String b = "sbjdb";
        System.out.println(longestUncommonSubsequences(a, b));

    }
    public static int longestUncommonSubsequences(String a, String b) {
        int m = a.length();
        int n = b.length();
        if(a.equals(b)) return -1;
        return Math.max(m, n);
    }
}
