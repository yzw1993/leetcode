/**
 * Created by zeweiyang on 2017/6/12.
 */
public class LongestPalindromic {
    boolean [][] dp;
    public String longestPalindrome(String s){
        if(s.length()==0){
            return "";
        }
        if(s.length() ==1){
            return s;
        }
        dp =new boolean[s.length()][s.length()];
        int i,j;
        for(i=0;i<s.length();i++){
            for(j=0;j<s.length();j++){
                if(i>=j){
                    dp[i][j]=true;
                }else{
                    dp[i][j]=false;
                }
            }
        }
        int k;
        int maxLen =1;
        int rf =0,rt=0;
        for (k=1;k<s.length();k++){
            for (i=0;k+i<s.length();i++){
                j =i+k;
                if(s.charAt(i)!=s.charAt(j)){
                    dp[i][j]=false;
                }else {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j]) {
                        if (k + 1 > maxLen) {
                            maxLen = k + 1;
                            rf = i;
                            rt = j;
                        }
                    }
                }

            }
        }
    return s.substring(rf,rt+1);
    }
}
