/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalianlist;

/**
 *
 * @author Lenovo
 */
public class PerkalianList {

    
    static class node  
    {  
        int data;  
        node next;  
    };  

    static node newNode(int data)  
    {  
        node new_node = new node();  
        new_node.data = data;  
        new_node.next = null;  
        return new_node;  
    }  

    // method memasukan angka ke node pertama 
    static node push( node head_ref, int new_data)  
    {  
        node new_node = newNode(new_data);  
        new_node.next = (head_ref);  
        (head_ref) = new_node;  
        return head_ref; 
    }  

    // method perkalian list
    static long perkalianls ( node first, node second)  
    {  
        int num1 = 0, num2 = 0;  
        while (first != null || second != null)  
        {  
            if (first != null)  
            {  
                num1 = num1*10 + first.data;  
                first = first.next;  
            }  
            if (second != null)  
            {  
                num2 = num2*10 + second.data;  
                second = second.next;  
            }  
        }  
        return num1*num2;  
    }  

    // print list
    static void cetak( node node)  
    {  
        while(node != null)  
        {  
            System.out.printf("%d", node.data);  
            if(node.next != null)  
                System.out.printf("->");  
            node = node.next;  
        }  
        System.out.printf("\n");  
    }  
    /**
     * EKSEKUSI KODE
     */
    public static void main(String[] args) {
        node first = null;
        node second = null;
        
        // membuat list pertama dengan isi data 9, 3, dan 5
        first = push(first, 9);
        first = push(first, 3);
        first = push(first, 5);
        // cetak list 1
        System.out.printf("List pertama adalah : ");
        cetak(first);
                
        
        // membuat list kedua dengan isi data 1 dan 7
        second = push(second, 1);
        second = push(second, 7);
        // cetak list 2
        System.out.printf("List kedua adalah : ");
        cetak(second);
        
        // cetak hasil perkalian kedua list
        System.out.printf("Hasil perkalian kedua list adalah : ");
        System.out.println(perkalianls(first, second));
    }
}
