/**
 * Created by zeweiyang on 2017/6/29.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int n;
        if(x>=0){
            n=x;
        }else{
            n=-x;
        }
        int result=0;
        while(n!=0){
            int tail=n%10;
            result=result*10+tail;
            n=n/10;
        }
        if (result==x){
            return true;
        }else{
            return false;
        }

    }
}
