package ch5;
// 冒泡排序算法，稳定的算法
public class BubbleSortDemo {
    public static void main(String[] args){
        int[] nums={23,89,44,77,78,99,4};
        for(int i=0;i<nums.length-1;i++){//外循环控制比较的论述
            for(int j=0;j<nums.length-1-i;j++){  //控制比较的数，相邻的2个数比较 并换位置
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }


            }
        }

        for (int k:nums){
            System.out.print(k+" ");
        }

    }
}
