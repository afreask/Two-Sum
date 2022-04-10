public class TwoSum 
{
	public int[] twoSum(int[] nums, int target)
	{
		int[] result = new int[0];
		int j = 0;
		if(nums.length >= 2 && nums.length <= (Math.pow(10,4)) && target >= -(Math.pow(10,9)) && target <= (Math.pow(10,9)))
		{
			if(nums[0] >= -(Math.pow(10,9)) && nums[0] <= (Math.pow(10,9)))
			{

				for(int i = 0; i < nums.length; i++)
				{
					for (j = i + 1; j < nums.length; j++)
					{
						if(nums[j] >= -(1*Math.pow(10,9)) && nums[j] <= (1*Math.pow(10,9)))
						{
							if(nums[i] + nums[j] == target)
							{
								result = new int[2];
								result[0] = i;
								result[1] = j;
								break;
							}
						}
					}

					if (j+1 == nums.length)
					{
						break;
					}

				}
			}
		}
		return result;	
	}
}
