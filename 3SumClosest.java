class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;


        int closestDiff = Integer.MAX_VALUE;
        int mainAns = 0;

        for(int k = 0; k<n-2; k++){
            int i = k+1;
            int j = n-1;

            while(i<j){
                int sum = nums[k] + nums[i] + nums[j];
                int diff = Math.abs(target - sum);

                if(diff < closestDiff){
                    closestDiff = diff;
                    mainAns = sum;
                }
                if(sum < target) {
                    i++;
                }else if(sum > target){
                    j--;
                }else{
                    return sum;
                }
            }
        }
        return mainAns;
    }
}
