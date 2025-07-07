/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node temp = head;
        int count =0;
        //  if(head.next == null){
        //      return 1;
        //  }
         
         while(temp != null){
             count++;
             temp =temp.next ;
             }
         
         return count;
    }
    
}