package solution;

import java.util.*;

/**
 * 692. 前K个高频单词
 * @author ASilentFigure
 * @project TrainingCampFourthDay
 * @date 2022/8/31 10:44
 */
public class TopKFrequent {

    public List<String> topKFrequent1(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> wordList = new ArrayList<>();
        for(String word : words){
            if(!map.containsKey(word)){
                wordList.add(word);
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) != map.get(o2)){
                    return map.get(o2) - map.get(o1);
                }else {
                    return o1.compareTo(o2);
                }
            }
        });
        List<String> list = new ArrayList<>();
        for(int i = 0;i < k; i++ ){
            list.add(wordList.get(i));
        }
        return list;
    }

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue() != o2.getValue()){
                    return o1.getValue() - o2.getValue();
                }else {
                    return o2.getKey().compareTo(o1.getKey());
                }
            }
        });
        for(Map.Entry<String, Integer> entrySet : map.entrySet()){
            priorityQueue.add(entrySet);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        List<String> list = new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            list.add(priorityQueue.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
}
