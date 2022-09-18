import java.io.*;
import java.util.Scanner;

class linkedlist {
    int data;
    linkedlist prev;
    linkedlist next;
    linkedlist(int value){
        this.data = value;
    }

    void display(){
        System.out.println(data);
    }
}

class linked {
    public linkedlist fstnode, lastnode;

    linked(){
        fstnode = null;
        lastnode = null;
    }

    /*Insert node at the begining or create a linked list */
    void insert_end(int value){
        linkedlist node = new linkedlist(value);
        if(fstnode == null){
            node.prev = node.next = null;
            fstnode = lastnode = node;
            System.out.println("Linked list is sucessfully created...");
        }
        else{
            node.next = null;
            node.prev = lastnode;
            lastnode.next = node;
            lastnode = node;
            System.out.println("Node Inserted at the end of the Linked list!");
        }
    }

    /*Delete node from linked list */
    void delete(){
        int count = 0, number, i;
        linkedlist node, node1, node2;
        Scanner input = new Scanner(System.in);

        for (node = fstnode; node!= null; node = node.next){
            count ++;
        }
        display();
        node = node1 = node2 = fstnode;
        System.out.println(count + " nodes available here!");
        System.out.println("Enter the node number which you want to delete from ascending order list:");
        number = Integer.parseInt(input.nextLine());
        if(number != 1){
            if(number < count && number > 0){
                for(i=2; i<=number;i++)
                    node = node.next;
                for(i = 2; i <=number-1; i++)
                    node1=node1.next;
                for(i = 2; i <=number+1; i++)
                    node2 = node2.next;
                node2.prev = node1;
                node1.next = node2;
                node.prev = null;
                node.next = null;
                node = null;
            }
            else if(number == count){
                node = lastnode;
                lastnode = node.prev;
                lastnode.next = null;
                node = null;
            }
            else{
                System.out.println("Invalid node Number!\n");
            }
        }
        else{
            node = fstnode;
            fstnode = node.next;
            fstnode.prev = null;
            node=null;
        }
        System.out.println("Node has been deleted successfully!\n");
    }

    /*Display linked list */
    void display(){
        
    }
}