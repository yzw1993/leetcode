import java.util.HashSet;
import java.util.Set;

/**
 * Created by zeweiyang on 2017/6/9.
 */
public class LongestSubstringWithoutPC {
    public int lengthOfLongestSubstring(String s){
        if(s.length()==0){
            return 0;
        }
        int count =1;
        int end =0;
        for (int start=0;start<s.length();start++){
            Set<Character> set =new HashSet<Character>();
            set.add(s.charAt(start));
            for(end=start+1;end<s.length()&&!set.contains(s.charAt(end));end++){
                set.add(s.charAt(end));
            }
            if((end-start)>count){
                count = end -start;
            }
        }
        System.out.println(count);
        return  count;
    }
}
