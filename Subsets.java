import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subsets(arr));

    }
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
            ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
            outer.add(new ArrayList<>());

            for (int num : nums) {
                int size = outer.size();
                for (int i = 0; i < size; i++) {

                    ArrayList<Integer> sub = new ArrayList<>(outer.get(i));
                    sub.add(num);
                    outer.add(sub);
                }
            }
            return outer;
    }
}
