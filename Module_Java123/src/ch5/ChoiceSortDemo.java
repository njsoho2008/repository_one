package ch5;
//选择排序，不稳定的算法
public class ChoiceSortDemo {
    public static void main(String[] args){

        int[] nums={2,9,5,4,8,1,6};

        int minIndex=0;//记录最小值下标
        for(int i=0;i<nums.length-1;i++){//控制轮数
            minIndex=i;
            for (int j=i+1;j<nums.length;j++){ //内部循环比价

                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp=nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;

            }
            System.out.println("minIndex="+minIndex);
        }
        for(int k:nums){
            System.out.print(k+" ");
        }

    }




}
