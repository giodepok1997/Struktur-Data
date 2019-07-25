
package singlelinkedlist;


public class SingleLinkedList {


        public static void main(String[] args) {
        
        LinkList link = new LinkList();
        link.addFirst(1);
        link.addFirst(2);
        link.addLast(3);
        link.addLast(4);
        link.tampilkan();
        link.deleteLast();
        link.tampilkan();
    }
}

    

    class Node {
    
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    public void tampil(){
        System.out.print("{"+data+"}");
    }
    }
    
    
    class LinkList {

    Node first ;

    public LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    // Menambah data dari simpul terakhir
    public void addLast(int data){
        Node node, help;
        node = new Node(data);
        node.next = null;

        if(isEmpty()){
            first = node;
            first.next = null;
        }else{
            help = first;
            while(help.next!=null){
                help=help.next;
            }
            help.next=node;
        }
    }

    // menghapus data dari simpul pertama
    public Node deleteFirst(){
        if(!isEmpty()){
            Node temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }

    // menghapus data dari simpul terakhir
    public Node deleteLast(){
        if(!isEmpty()){
            Node temp, current;
            current=first;
            while(current.next.next != null){
                current=current.next;
            }
            temp=current.next;
            current.next=null;
            return temp;
        }else{
            Node temp = first;
            first = null;
            return temp;
        }
    }

    // menampilkan isi linked list
    public void tampilkan(){
        Node current = first;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
    }



