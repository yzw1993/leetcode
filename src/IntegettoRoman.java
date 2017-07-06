/**
 * Created by zeweiyang on 2017/7/6.
 */
public class IntegettoRoman {
    public String intToRoman(int num){
        String[] I={"","I","II","III","IV","V","VI","VII","VIII","IX"};//个位数
        String[] X={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};//十位数
        String[] C={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};//百位数
        String[] M={"","M","MM","MMM"};//千位数
        return M[num/1000]+C[(num%1000)/100]+X[(num%100)/10]+I[num%10];
    }
}
