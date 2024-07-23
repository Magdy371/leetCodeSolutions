public class RemoveDuplicates {
    public static int operations(int[] nums)
    {
        if(nums.length==0 || nums.length ==1)
        {
            return nums.length;
        }
        int j = 0; //pointer for the next unique element position;
        for(int i=1; i< nums.length;i++)
        {
            if(nums[i] != nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,1,2,2,3,4,5,5,6,7,7,8,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        // Example input
        int lengthWithoutDuplicates = operations(nums);
        System.out.println("Array without duplicates has length: " + lengthWithoutDuplicates);
        for (int i = 0; i < lengthWithoutDuplicates; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
    
