import java.util.*;

class ex1 {

    public static void main(String[] args){
        
        int nums[] = {1, 3, 5, 6, 8, 1};


        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
            System.out.print(nums[i]+" ");
        }



    }
}