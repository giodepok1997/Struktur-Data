/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;




class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }

    public void tampil(){
        System.out.print("{"+data+"}");
    }
}

class DoubleLinkedList {
    Node first;
    Node last;

    //kontruktor
    //set nilai awal adalah null
    public DoubleLinkedList() {
        first = null;
        last = null;
    }
    
    //    eksekusi program
    public static void main(String[] args) {
        DoubleLinkedList theList = new DoubleLinkedList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward();
        theList.displayBackward();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(11);
        theList.displayForward();
        theList.insertAfter(22, 77);
        theList.insertAfter(33, 88);
        theList.displayForward();
    } 


    //mengecek apakah linked list kosong atau tidak
    public boolean isEmpty(){
        return (first==null);
    }

    //method untuk menginsert data dari pertama
    public void insertFirst(int data){
        Node node = new Node(data);
        if(isEmpty()){
            last = node;
        }else{
            first.prev = node;
        }

        node.next = first;
        first = node;
    }

    //method untuk menginsert data dari terakhir
    public void insertLast(int data){
        Node node = new Node(data);
        if( isEmpty() )
            first = node;
        else{
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    //method untuk menginsert data pertama
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.prev = null;
        first = first.next;
        return temp;
    }

    //method untuk menghapus data terakhir
    public Node deleteLast(){
        Node temp = last;
        if(first.next == null)
            first = null;
        else
            last.prev.next = null;
        last = last.prev;
        return temp;
    }

    //method untuk menginsert data di tengah
    public boolean insertAfter(int key, int data){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null)
            return false;
        }
        Node node = new Node(data);

        if(current==last){
            node.next = null;
            last = node;
        }else{
            node.next = current.next;
         
            current.next.prev = node;
        }
        node.prev = current;
        current.next = node;
        return true;
    }

    //method untuk menghapus data yang dipilih
    public Node deleteKey(int key){
        Node current = first;
        while(current.data != key){
            current = current.next;
        if(current == null)
            return null;
        }
        if(current==first)
            first = current.next;
        else
            current.prev.next = current.next;
        if(current==last)
            last = current.prev;
        else
            current.next.prev = current.prev;
            return current;
    }

    //menampilkan data dari pertama - terakhir
    public void displayForward(){
        System.out.print("List (first-->last): ");
        Node current = first;

        while(current != null){
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }

    //menampilkan data dari terakhir - pertama
    public void displayBackward(){
        System.out.print("List (last-->first): ");
        Node current = last;
        while(current != null){
            current.tampil();
            current = current.prev;
        }
        System.out.println("");
    }
}

