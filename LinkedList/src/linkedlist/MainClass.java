/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author monesh
 */
public class MainClass 
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        list.insert(3);
        list.insert(6);
        list.insert(9);
        list.insertAtStart(12);
        list.insertAt(2,15);
        list.insertAt(5,18);
        list.deleteAt(2);
        list.deleteAt(0);
        list.show();
    }
}
