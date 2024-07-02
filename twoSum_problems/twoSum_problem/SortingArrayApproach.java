public class SortingArrayApproach
{
  public static void main(String[] args)
  {
    int target =9;
    int[] nums = {2,5,7,11};
    int[] result = twoSum(nums , target);
    System.out.println("indicies=> "+ result[0] +" : "+result[1]);
  }
  public static int[] twoSum(int[] numbers , int target)
  {
    int left = 0;
    int right = numbers.length-1;
    while (left < right) {
        int sum = numbers[left] + numbers[right];
        if (sum == target) {
            return new int[]{left , right }; // 1-indexed
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[0];
  }
}
