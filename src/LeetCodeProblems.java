import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeProblems {
    public static void main(String arg[]) {
        System.out.println(Arrays.toString(problemOne()));
    }

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.

    //Example
    // Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    private static int[] problemOne() {
        //My Code
        int[] array = {3, 2, 3};
        int target = 6;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array.length - 1; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

     /*   //Optimized Way
        Map<Integer,Integer> map = new HashMap<>();
        int []result = new int[2];
        for(int i = 0;i<array.length;i++){
            if(map.containsKey(target - array[i])){
                result[1]=i;
                result[0]=map.get(target-array[i]);
                break;
            }
            map.put(array[i],i);
        }
        return result;*/
    }
}
