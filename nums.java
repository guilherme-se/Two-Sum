class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numeral = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length;i++){
            Integer numeralInit = numeral.get(nums[i]);
            if (numeralInit != null){
                return new int[]{i,numeralInit};
            }
            numeral.put(target - nums[i],i);
        }
        return nums;
    }
}