
//My Solution 
class Solution {
    public void sortColors(int[] nums) {
        int countOf0 = 0;
        int countOf1 = 0;
        int countOf2 = 0;
        for(int i =0 ; i< nums.length ; i++) {
            if(nums[i] == 0) {
                countOf0 ++;
            }else if(nums[i] == 1) {
                countOf1 ++;
            }else if(nums[i] == 2) {
                countOf2 ++;
            }
            
        }
        
        for(int i =0 ; i< nums.length ; i++) {
           if(countOf0 >=1) {
               nums[i] = 0;
                countOf0 --;
            } else if(countOf1 >=1) {
               nums[i] = 1;
                countOf1 --;
            }else if(countOf2 >=1) {
               nums[i] = 2;
                countOf2 --;
            }
    }
    System.out.print(Arrays.toString(nums));    
//     for(int i =0 ; i< nums.length ; i++) { 
//     System.out.print(nums[i]);
//     }
//    System.out.print(']');      
// 
                     }
}

//Better Aproach
public void sortColors(int[] nums) {
    // 2-pass
    int count0 = 0, count1 = 0, count2 = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {count0++;}
        if (nums[i] == 1) {count1++;}
        if (nums[i] == 2) {count2++;}
    }
    for(int i = 0; i < nums.length; i++) {
        if (i < count0) {nums[i] = 0;}
        else if (i < count0 + count1) {nums[i] = 1;}
        else {nums[i] = 2;}
    }
}