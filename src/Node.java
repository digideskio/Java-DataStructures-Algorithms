/**
 * Neeraj Aggarwal
 * Created 28 January 2016
 * A core implementation of Node in Java.
 */

public class Node<type> {

   private Node<type> next;
   private type value;

   public Node(type valueInput)
   {
      this.value=valueInput;
   }

   public Node(type valueInput, Node<type> nextInput)
   {
      this.value=valueInput;
      this.next=nextInput;
   }

   public type getValue()
   {
      return this.value;
   }

   //will return the old value
   public type setValue(type newValue)
   {
      type oldValue = this.value;
      this.value=newValue;
      return oldValue;
   }

   public Node<type> getNext()
   {
      return this.next;
   }

   //return the old next node
   public Node<type> setNext(Node<type> newNext)
   {
      Node<type> oldNext = this.next;
      this.next= newNext;
      return oldNext;
   }

}
