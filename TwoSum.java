package main;

/**
 * @author Paulo	 
 */
public class TwoSum 
{
	/* 
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
	   You may assume that each input would have exactly one solution, and you may not use the same element twice.
	   You can return the answer in any order.
		
		Example 1:
		
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	
		Example 2:
		
		Input: nums = [3,2,4], target = 6
		Output: [1,2]
	
		Example 3:
		
		Input: nums = [3,3], target = 6
		Output: [0,1]
		 
		
		Constraints:
		
		2 <= nums.length <= 10^4
		-10^9 <= nums[i] <= 10^9
		-10^9 <= target <= 10^9
		Only one valid answer exists.
	 */
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
