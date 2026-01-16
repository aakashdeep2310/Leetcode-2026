class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // int [] ans = new int[2];
        // int n = nums.length;

        // for(int i = 0; i<n-1; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        // return ans;


        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int remaining = target - nums[i];

           if(map.containsKey(remaining)){
                return new int[]{map.get(remaining), i};
           }
           map.put(nums[i], i);
        }

        return new int[]{};
    }
}
