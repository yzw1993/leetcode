/**
 * Created by zeweiyang on 2017/6/9.
 */

public class AddTwoNumbers {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  public ListNode addTwoNumbers(ListNode l1,ListNode l2){
     int sum=0;
     ListNode l3 =new ListNode(0);
     ListNode p1=l1;ListNode p2 =l2;ListNode p3=l3;
     while (p1!=null||p2!=null){
         sum/=10;
         if(p1 !=null){
             sum +=p1.val;
             p1=p1.next;
         }
         if(p2 !=null){
             sum +=p2.val;
             p2=p2.next;
         }
         p3.next=new ListNode(sum%10);
         p3=p3.next;
     }
     if (sum/10==1){
         p3.next=new ListNode(1);
     }
    return l3.next;

  }
}
