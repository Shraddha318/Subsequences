public class SkipCharacter {
    public static void main(String[] args) {
        String up="Apple";
        up=up.toLowerCase();

        String p="";
        skipCharacter(up,p);

    }
    public static void skipCharacter(String up,String p) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skipCharacter(p,up.substring(1));
        }
        else{
            skipCharacter(p+ch,up.substring(1));
        }
    }
}
