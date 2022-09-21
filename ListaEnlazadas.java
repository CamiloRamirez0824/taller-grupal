/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KEVIN ACEVEDO, HUGO ALEJANDRO , JUAN CAMILO
 */
import java.util.*;


class LinkedList {
    static Node head;
    
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
    //METODO DEL SEGUNDO PUNTO DEL TALLER
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null;
        
        while (current != null) 
        { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
    void printList(Node node)   
    { 
        while (node != null) 
        { 
        System.out.print(node.data + "->"); 
        node = node.next; 
        } 
    }
    //METODO DEL 3 punto del taller 
    void invertir(String c){
        
        String cadena = c;	
	String invertida = "";
		
	for (int indice = cadena.length() - 1; indice >= 0; indice--) 
        {
			
            invertida += cadena.charAt(indice);
	}
	System.out.println("Cadena original: " + cadena);
	System.out.println("Cadena invertida: " + invertida);
              
        return;
    }
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        LinkedList class1 = new LinkedList();
        
        class1.invertir("alejandro");
        
        LinkedList.head = new Node(10); 
        LinkedList.head.next = new Node(20); 
        LinkedList.head.next.next = new Node(30); 
        LinkedList.head.next.next.next = new Node(40); 
        
        
        System.out.println("L1"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("L2"); 
        list.printList(head);
        System.out.println("\n");
    } 
}
