class Solution {
    public int pivotIndex(int[] nums) {
        int length=nums.length;
		int leftElementSum=0;
		int rightElementSum=0;
		
		//배열 합 구하기
		int totalSum=IntStream.of(nums).sum();
		
		for(int i=0;i<length;i++)
		{
			//초기화
			leftElementSum=0;
			rightElementSum=0;
			
			for(int j=0;j<i;j++) 
				leftElementSum+=nums[j];
			
			//오른쪽 배열의 합은 = 총합 - 왼쪽배열 합 - Pivot인덱스의 배열값
			rightElementSum=totalSum-leftElementSum-nums[i];
					
			//왼쪽 요소들의 합과 오른쪽 요소들의 합이 같으면
			if(leftElementSum==rightElementSum)
				return i;
		}
		
		//Pivot 인덱스가 없으면
		return -1;
    }
}