public class SingleNumber {
    public int findSingleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result^ num;
        }

        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        int[] nums = {4, 2, 1, 2, 1};
        int singleNumber = solution.findSingleNumber(nums);

        System.out.println("The single number is: " + singleNumber);
    }
}
