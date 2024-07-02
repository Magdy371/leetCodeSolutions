import java.util.*;
public class HashMap_Approach
{
  public static void main(String[] args)
  {
    int[] nums={2, 11,5,7};
    int target =9;
    int[] result = twoSum(nums, target);
    System.out.println("Indices: " + result[0] + ", " + result[1]);
  }
  public static int[] twoSum(int[] nums,int target)
  {
    HashMap<Integer,Integer>map = new HashMap<>();
    int complement =0;
    for(int i=0; i< nums.length;i++)
      {
        complement = target - nums[i];
        if(map.containsKey(complement))
        {
          return new int[]{map.get(complement) ,i};
        }
        map.put(nums[i], i);
      }
    return new int[0];
  }
}
