/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

/**
 *
 * @author riley.abrahamson
 */
public class LinkedQueue<E> implements Queue<E>{
    
    private SinglyLinkedList<E> list;
    
    public LinkedQueue()
    {
        //new queue relies on the initially empty list
        list = new SinglyLinkedList<>();
    }
    
    @Override
    public int size()
    {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
    
}
