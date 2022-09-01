package solution;

import java.util.*;

/**
 * 506. 相对名次
 * @author ASilentFigure
 * @project TrainingCampFourthDay
 * @date 2022/8/31 10:05
 */
public class FindRelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < score.length;i++){
            map.put(score[i], i);
        }
        String [] answer = new String[score.length];
        Arrays.sort(score);
        for(int i = 0;i < score.length;i++){
            if(score.length - 1 == i){
                answer[map.get(score[i])] = "Gold Medal";
            }else if(score.length - 2 == i){
                answer[map.get(score[i])] = "Silver Medal";
            }else if(score.length - 3 == i){
                answer[map.get(score[i])] = "Bronze Medal";
            }else {
                answer[map.get(score[i])] = score.length - i + "";
            }
        }
        return answer;
    }
}
