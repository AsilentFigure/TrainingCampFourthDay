package solution;

/**
 * 面试题 01.01. 判定字符是否唯一
 * @author ASilentFigure
 * @project TrainingCampFourthDay
 * @date 2022/9/1 15:34
 */
public class IsUnique {

    public boolean isUnique(String astr) {
        if(astr.length() > 26){
            return false;
        }
        int [] cnt = new int [26];
        for(int i = 0; i < astr.length(); i++){
            if(cnt[astr.charAt(i) - 'a'] != 0){
                return false;
            }
            cnt[astr.charAt(i) - 'a']++;
        }
        return true;
    }
}
