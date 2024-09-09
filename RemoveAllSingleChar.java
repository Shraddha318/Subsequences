public class RemoveAllSingleChar {
    public static void main(String[] args) {
        String str = "aabcd";
        System.out.print(removeAllSingleChar(str));
    }

    public static String removeAllSingleChar(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.length() == 1) {
            return " ";
        }

        int n = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            boolean isSingle = true;

            // Check if the character appears more than once
            for (int j = 0; j < n; j++) {
                if (i != j && ch == str.charAt(j)) {
                    isSingle = false;
                    break;
                }
            }

            // Append the character to the result if it appears more than once
            if (!isSingle) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
