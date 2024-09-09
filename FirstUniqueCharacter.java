public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(firstUniqChar(str));

    }
    public static int firstUniqChar(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            boolean found = false;
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    found=false;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
