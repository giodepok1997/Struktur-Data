/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penambahanlist;

/**
 *
 * @author Lenovo
 */
public class PenambahanList {

    static Node head1, head2;
    
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    
    Node addTwoLists(Node first, Node second)
    {
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;
        while (first != null || second != null)
        {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            temp = new Node(sum);
            if (res == null)
            {
                res = temp;
            }
            else
            {
                prev.next = temp;
            }
            prev = temp;
            if(first != null)
            {
                first = first.next;
            }
            if(second != null)
            {
                second = second.next;
            }
        }
        
        if (carry > 0)
        {
            temp.next = new Node(carry);
        }
        return res;
    }
    
    void cetak(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) {
        PenambahanList list = new PenambahanList();
        list.head1 = new Node(1);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(2);
        list.head1.next.next.next = new Node(3);
        list.head1.next.next.next.next = new Node(4);
        System.out.print("Data pada List ke-1 : ");
        list.cetak(head1);
        
        list.head2 = new Node(7);
        list.head2.next = new Node(2);
        list.head2.next.next = new Node(7);
        list.head2.next.next.next = new Node(3);
        list.head2.next.next.next.next = new Node(4);
        
        System.out.print("Data pada List ke-2 : ");
        list.cetak(head2);
        
        Node rs = list.addTwoLists(head1, head2);
        System.out.print("Hasil penjumlahannya adalah : ");
        list.cetak(rs);
    }
}
