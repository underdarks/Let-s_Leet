class Solution {
       public int search(int[] nums, int target) {
       int left=0;
        int right=nums.length-1;
        int mid=0;

        while(left <=right){
            if(nums[(left+right)/2] == target)
                return (left+right)/2;

            else if(nums[(left+right)/2] > target)
                right=(left+right)/2-1;

            else
                left=(left+right)/2+1;

        }

        return -1;
    }
}