package solution;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1710. 卡车上的最大单元数
 * @author ASilentFigure
 * @project TrainingCampFourthDay
 * @date 2022/9/1 15:44
 */
public class MaximumUnits {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        int result = 0;
        for(int i = 0; i < boxTypes.length; i++){
            if(truckSize <= 0){
                break;
            }
            if(truckSize >= boxTypes[i][0]){
                result += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }else if(truckSize > 0){
                result += truckSize * boxTypes[i][1];
                break;
            }
        }
        return result;
    }
}
