
/**
 * Created by Mark on 3/13/2019.
 */
import java.util.*;
public class wordsWithout {
    public static void main (String [] args) {
        int[] nums = new int[6];
        nums[0] = 3;
        nums[1] = 5;
        nums[2] = 6;
        nums[3] = 7;
        nums[4] = 2;

        System.out.println(nums, 1);

    }

}
    public static int copyEvens(int[] nums, int count) {
        ArrayList<Integer> evens= new ArrayList<Integer>();
        int evenCount =0;
        while (evenCount <= count) {
            for (int i = 0; i <= nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    evens.add(i);
                    count++;
                }


            }
        }

        return evens;
    }
}