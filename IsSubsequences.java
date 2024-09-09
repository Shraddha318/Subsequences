public class IsSubsequences {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abccdg";
        System.out.print(isSubsequence(s1, s2));
    }
//    public static boolean isSubsequence(String s1, String s2) {
//        int m=s1.length();
//        int n=s2.length();
//        if(m>n) return false;
//        int i=0;
//        for(int j=0;j<n;j++){
//            if(i==m) return true;
//            if(s1.charAt(i)==s2.charAt(j)) i++;
//        }
//        return i==m;
//    }
    public static boolean isSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m>n) return false;
        int ans=solve(s1,s2,0,0);

        return ans==m;
    }
    public static int solve(String s1, String s2,int i,int j) {
        int m = s1.length();
        int n = s2.length();
        if(m==i || n==j) return 0;
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+ solve(s1,s2,i+1,j+1);
        }
        else{
            return solve(s1,s2,i,j+1);
        }

    }
}
