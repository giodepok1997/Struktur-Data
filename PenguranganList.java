/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penguranganlist;

/**
 *
 * @author Lenovo
 */
public class PenguranganList {

        static class Node{
              int data;
              Node next = null;

              public Node(int data){
                    this.data = data;
              }

              //insert in list at end
              public void insert(int data){
                     Node n = this;
                     Node newNode = new Node(data);

                     while(n.next != null){
                           n = n.next;
                     }
                     n.next = newNode;
               }

               //Utility function to print the list
               public static void cetak(Node n){
                      while(n != null){
                            if(n.next == null)
                                 System.out.println(n.data);
                            else
                                 System.out.print(n.data + "->");
                            n = n.next;
                      }
               }
         }

          //Utility function to subtract given lists
          static Node pengurangan(Node n1, Node n2, int borrow){
                  //Base condition
                  if(n1 == null && n2 == null && borrow == 0)
                          return null;

                  Node result = new Node(borrow);
                  int value = borrow;

                  if(n1.data >= n2.data){
                         value += n1.data - n2.data;
                         borrow = 0;
                  }else{
                         if(n1.next != null){
                               value += (n1.data)+10 - n2.data;
                               borrow = -1;
                         }else{
                               value += (n1.data)+10 - n2.data;
                               value = value*(-1);
                               borrow = 0;
                         }
                   }
                   result.data = value;

                   
                   if(n1.next!=null || n2.next!=null || borrow<0)
                   {
                        Node more = pengurangan(n1.next != null ? n1.next : null, n2.next != null ? n2.next : null, borrow < 0 ? -1 : 0);
                        result.next = more;
            }
            return result;
       }
    public static void main(String[] args) {
        Node n1 = new Node(7);
        n1.insert(9);
        n1.insert(3);
        
        Node n2 = new Node(4);
        n2.insert(1);
        n2.insert(6);
        
        Node result = pengurangan(n1, n2, 0);
        Node.cetak(result);
    }
}
