import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zeweiyang on 2017/8/25.
 */
public class RussianDollEnvelopes {
    public static class Dot{
        int a;
        int b;
        public Dot(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    public static  class Dolcompatator implements Comparator<Dot>{
        @Override
        public int compare(Dot d1,Dot d2){
            if (d1.a==d2.a)
                return d2.b-d1.b;
            else
                return d1.a-d2.a;
        }
    }
    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes==null||envelopes.length==0)
            return 0;
        Dot[] dots=new Dot[envelopes.length];
        for (int i=0;i<envelopes.length;i++){
            dots[i]=new Dot(envelopes[i][0],envelopes[i][1]);

        }
        Arrays.sort(dots,new Dolcompatator());
        int[] h=new int[envelopes.length];
        h[0]=dots[0].b;
        int j=0;
        for (int i=0;i<envelopes.length;i++){
            int low=0;
            int high=j;
            while (low<=high){
                int mid =(low+high)/2;
                if (h[mid]<dots[i].b)
                    low=mid+1;
                else
                    high=mid-1;
            }
            h[low]=dots[i].b;
            j =low>j?low:j;
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[][] doll = new int[][]{{1,2}};
        System.out.println(maxEnvelopes(doll));
    }

}
