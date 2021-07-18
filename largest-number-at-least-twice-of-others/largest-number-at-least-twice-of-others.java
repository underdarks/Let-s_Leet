class Solution {
    public int dominantIndex(int[] nums) {
        int dominanyIndex=0;
			int length=nums.length;	//배열길이
			int max = 0;
			int prevValue=-1;
			//1.배열의 요소가 하나만 있으면
			if(length<=1)
				return 0;
			
			//Arrays.parallelSort(nums);
			//Arrays.sort(nums);
			//int max=nums[0];
        
			max=nums[0];
			for(int i=1;i<length;i++)
			{
				//2.최댓값과 최대값 인덱스 찾기
				if(max < nums[i])
				{
					max=nums[i];
					dominanyIndex=i;
				}
			}
			
			//3.루프 돌면서 최대값이 다른 요소들의 2배이상 값보다 큰지 확인
			for(int i=0;i<length;i++)
			{
				prevValue=nums[i>0?i-1:dominanyIndex];
				if(nums[i]==prevValue || dominanyIndex==i)	//이전값과 같은값거나 최댓값의 인덱스면 비교안함
					continue;
				
				//최대값이 다른 요소의 2배보다 작으면
				if(max < nums[i]*2)
					return -1;
			}
			
			//4.인덱스 리턴하기 
			return dominanyIndex;
    }
}