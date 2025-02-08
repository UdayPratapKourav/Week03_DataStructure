package hashmapshashfunctions.longestconsecutivesequence;

import java.util.HashMap;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int findLongestConsecutive(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, true);
        }

        int longestStreak = 0;

        for (int num : arr) {
            if (!map.containsKey(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (map.containsKey(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }


}