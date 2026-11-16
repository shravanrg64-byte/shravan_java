
class Solution {
    int[] original;
    int[] nums;
    Random rand = new Random();

    public Solution(int[] nums) {
        this.original = nums.clone();
        this.nums = nums.clone();
    }

    public int[] reset() {
        nums = original.clone();
        return nums;
    }

    public int[] shuffle() {
        nums = original.clone();

        for (int i = nums.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}
