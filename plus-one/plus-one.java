class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
		int q = 0;// 몫
		int []result=null;
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		digits[length - 1] = digits[length - 1] + 1;
		for (int i = length - 1; i>=0; i--)
		{
			q = digits[i] / 10;
			digits[i] = digits[i]%10;
			if(i!=0)
				digits[i - 1] = digits[i - 1] + q;
			else
			{
				if(q==1)
				{
					result=new int[length+1];
					result[0]=q;
				}
			}
		}
		
		if(result != null)
		{	
			for(int i=0;i<length;i++)
				result[i+1]=digits[i];
		}
		//Collections.reverse(arayList);
		// Arraylistf를 int 배열로 변환
		//result = arrayList.stream().mapToInt(i -> i).toArray();

		return result == null ? digits:result;
    }
}