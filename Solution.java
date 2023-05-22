import java.util.HashMap;
import java.util.Map;

public class Solution{

    public Character firstNonRepeated(String s){

        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (count.get(c) == 1) {
                return c;
            }
        }

        return ' ';
    }


    public static void main(String[] args){

        Solution solution = new Solution();
        char test = solution.firstNonRepeated("hello");
        char test2 = solution.firstNonRepeated("aabcc");
        char test3 = solution.firstNonRepeated("aabbcc");
        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

    }

    //This has a run-time of O(n) since we must go through the whole string once, this should
    //have a space-complexity of O(n) as we implement a hashmap so it takes extra memory.
}