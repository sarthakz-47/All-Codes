package DSA.Arrays;

class PMaxConsucutiveOnes {
    public int findMaxConsucutiveOnes(int nums[]) {
        // initalize to keep track of 1's:
        int count = 0;

        // initalize to keep track of max 1 apperead:
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                // check if your currCount > MaxCount then update MaxCount
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            // reset currCount when 0 is triggered:
            else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1, 1 };
        PMaxConsucutiveOnes obj = new PMaxConsucutiveOnes();
        System.out.println(obj.findMaxConsucutiveOnes(nums));
    }

}
