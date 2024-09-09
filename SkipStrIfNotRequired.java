public class SkipStrIfNotRequired {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.print(skipStrIfNotRequired(str));
    }
    public static String skipStrIfNotRequired(String str) {
        if(str.isEmpty()){
            return " ";
        }
        if(str.startsWith("aa") && !str.startsWith("aab")){
            return skipStrIfNotRequired(str.substring(2));
        }
        else{
            return str.charAt(0)+skipStrIfNotRequired(str.substring(1));
        }
    }
}
