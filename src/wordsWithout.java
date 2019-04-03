
/**
 * Created by Mark on 3/13/2019.
 */
import java.util.*;
public class wordsWithout {
    public static void main (String [] args) {
        int[] nums = new int[6];
        nums[0] = 3;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 7;
        nums[4] = 2;

        System.out.println(copyEvens(nums, 3));

    }

    public static ArrayList<Integer> copyEvens(int[] nums, int count) {
        ArrayList<Integer> evens = new ArrayList<Integer>();
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    evens.add(nums[i]);
                    evenCount++;
                }
                if(evenCount == count){
                  //System.out.println("Entered");
                  //return evens;
                    break;
                }
                //System.out.println(evenCount);
        }

        return evens;
    }
}