/**
 * Neeraj Aggarwal
 * Created 28 January 2016
 * A core implementation of a singly linked list.
 */

public class SinglyLikedList<type> {

   private int count;
   private Node<type> head;

   public SinglyLikedList()
   {
      this.count=0;
      this.head=null;
   }

   public SinglyLikedList(Node<type> headInput)
   {
      this.count=0;
      this.head=headInput;
   }



}
