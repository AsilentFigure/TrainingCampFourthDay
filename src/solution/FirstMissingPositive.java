package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * 41. 缺失的第一个正数
 * @author ASilentFigure
 * @project TrainingCampFourthDay
 * @date 2022/9/1 15:06
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        for(int i  = 0; i < length; i++){
            if(nums[i] <= 0){
                nums[i] = length + 1;
            }
        }
        for(int i = 0; i < length; i++){
            int num = Math.abs(nums[i]);
            if(num <= length){
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for(int i = 0; i < length; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return length + 1;
    }
}
