public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return new int[0];
    }
    public static void main(String[] args) {
         TwoSum test = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = test.twoSum(nums1, target1);
        print(result1);


        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = test.twoSum(nums2, target2);
        print(result2);

    }

    private static void print(int[] result) {
        if (result.length == 0) {
            System.out.println("[ ]");
        } else {
            System.out.println("Result: [" + result[0] + "," + result[1] + "]");
        }
    }
}


