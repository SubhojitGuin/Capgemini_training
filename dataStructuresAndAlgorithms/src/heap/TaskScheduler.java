package heap;

import java.util.*;

public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;

        TaskScheduler obj = new TaskScheduler();
        System.out.println("Total time: " + obj.leastInterval(tasks, n));
    }

    private int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freqMap = new HashMap<>();

        int maxFreq = 0;
        for (char task: tasks) {
            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(task));
        }

        int maxFreqCount = 0;
        for (char task: freqMap.keySet()) {
            if (freqMap.get(task) == maxFreq) maxFreqCount++;
        }

        int partialCount = maxFreq - 1;
        int cycle = n + 1;
        return Math.max(partialCount * cycle + maxFreqCount, tasks.length);
    }

//    public int leastInterval(char[] tasks, int n) {
//        Map<Character, Integer> freqMap = new HashMap<>();
//
//        for (char task: tasks) {
//            freqMap.put(task, freqMap.getOrDefault(task, 0) + 1);
//        }
//
//        PriorityQueue<CharFreqPair> pq = new PriorityQueue<>((p1, p2) -> p2.count - p1.count);
//        for (Map.Entry<Character, Integer> entry: freqMap.entrySet()) {
//            pq.offer(new CharFreqPair(entry.getKey(), entry.getValue()));
//        }
//
//        int timeInterval = 0;
//        while (!pq.isEmpty()) {
//            int cycle = n + 1;
//            List<CharFreqPair> list = new ArrayList<>();
//
//            while (!pq.isEmpty() && cycle > 0) {
//                CharFreqPair pair = pq.poll();
//                pair.count--;
//                if (pair.count > 0) list.add(pair);
//                cycle--;
//            }
//
//            if (list.isEmpty()) {
//                timeInterval += (n + 1 - cycle);
//            } else {
//                timeInterval += n + 1;
//            }
//
//            for (CharFreqPair pair: list) {
//                pq.offer(pair);
//            }
//        }
//
//        return timeInterval;
//    }



}

class CharFreqPair {
    char ch;
    int count;

    CharFreqPair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}
