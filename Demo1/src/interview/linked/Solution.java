package interview.linked;

import java.util.ArrayList;

/**
 * @author lin
 * @create 2019-12-13
 * @Info(输入两个单调递增的链表，输出两个链表合成后的链表)
 * @Notes--()
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}

public class Solution{
   public ListNode Merge(ListNode list1,ListNode list2){
       ListNode list3 = null;
       //非空判断
       if(list1 != null && list2 != null){
           //递归算法
           if(list1.val < list2.val){
               list3 = list1;
               list3.next = Merge(list1.next,list2);
           }else{
               list3 = list2;
               list3.next = Merge(list1,list1.next);
           }
       }
       if(list1 != null && list2 == null){
           list3 = list1;
       }
       if(list1 == null && list2 != null){
           list3 = list2;
       }
       return list3;
   }
}