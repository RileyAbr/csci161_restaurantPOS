package Utilities; 

public class SinglyLinkedList <E>
{
    protected static class Node<E>
    {
        protected E element;
        protected Node<E> next;
        public Node(E e, Node<E> n)
        {
            element = e;
            next = n;
        }
        
        public E getElement()
        {
            return element;
        }
        
        public Node<E> getNext()
        {
            return next;
        }
        
        public void setNext( Node<E> n )
        {
            next = n;
        }       
    }
    
    //instantce variables of the SinglyLinkedList
    protected Node<E> head = null;
    protected Node<E> tail = null;
    protected int size = 0;
    
    public SinglyLinkedList(){}
    
    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return size == 0;
    }
    
    public E first()
    {
        if( isEmpty()) 
            return null;
        return head.getElement();
    }
    
    public E last()
    {
        if( isEmpty() )
            return null;
        return tail.getElement();
    }
    
    public void addFirst(E e)
    {
        head = new Node<>(e, head);
        if( size == 0)
            tail = head;
        size++;
    }
    
    public E removeFirst() 
    {
        if(isEmpty())
        {
            return null;
        }
        
        E temp = head.getElement();
        head = head.getNext();
        size--;
        
        if(size == 0)
        {
            tail = null;
        }
        
        return temp;
    }
    
    public E removeLast()
    {
        if(isEmpty())
        {
            return null;
        }
        
        if(size == 1)
        {
            E temp = head.getElement();
            head = null;
            tail = null;
            return temp;
        }

        //Creates a loop that filters through each item by tracing their next references
        Node<E> tempCurrent = head;
        
        for(int i = 0; i < size - 1; i++) 
        {  
            if(i == (size - 2))
            {
                tempCurrent.setNext(null);
                tail = tempCurrent;
                size--;
                return tail.getElement();
            }
            
            tempCurrent = tempCurrent.getNext();
            
        }
        
        return null;
    }
    
    public void addLast( E e )
    {
        Node<E> newest = new Node<>(e, null);
        if(isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }
}