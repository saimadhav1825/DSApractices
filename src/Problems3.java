public class Problems3 {
    public static int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                int outCheck = nums[i] + nums[j];
                if (outCheck == target) {
                    out[0] = i;
                    out[1] = j;
                }
            }
        }
        return out;
    }
    public static boolean isPalindrome(int x) {
        String k = String.valueOf(x);
        for (int i = 0; i < k.length() / 2; i++) {
            if (k.charAt(i) != k.charAt(k.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }




    public static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
