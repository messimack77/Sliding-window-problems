import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SlidingWindowProblems {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums, 2));

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j <=  k+i && j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static int lengthOfLongestSubstring(String s){
      //pwwkew

    Set<Character> hashSet = new HashSet<>();
    int slowPointer = 0;
    int fastPointer = 0;
    int current = 0;
    int longest = 0;

    while (fastPointer < s.length()){
        if (!hashSet.contains(s.charAt(fastPointer))){
           hashSet.add(s.charAt(fastPointer));
           longest = Math.max(hashSet.size(), current);
           fastPointer++;
        } else {
          hashSet.remove(s.charAt(fastPointer));
          slowPointer++;
        }

    }
      return  longest;

    }
}

