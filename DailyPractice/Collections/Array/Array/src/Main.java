import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // this is the algorithm that reverses the input array (nums)
        public int[] solve(int[] nums) {
            int j=nums.length-1;
            int i=0;
            // hint: define 2 pointers (pointing to the last and first item of the array) and make a single iteration ...
            while(i<j){
                swap(nums,i,j);
                ++i;
                --j;
            }
            return nums;
        }

        private void swap(int[] nums, int index1, int index2) {
            int temp;
            temp=nums[index1];
            nums[index1]=nums[index2];
            nums[index2]=temp;
        }

    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        Main m=new Main();
        array=m.solve(array);
        System.out.println(Arrays.toString(array));
    }
}