/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.linked_queue;

/**
 *
 * @author farouk
 */
public class main {
 
    node front , rear ; 
    public boolean  isEmpty()
    {
        
   return this.rear == null ; 
   //or return this.front ==null ;
  
    
    }
    
   public void enqueue (int item)
   {
   node js = new node ();
   if(isEmpty())
   {
   this.rear = this.front = new node() ; 
   
   }else {this.rear.next = new node() ;
   this.rear = new node() ;
   
   }
   
    
                                                                                 
   
   }
   public void dequeue()
   {
   if(isEmpty()){
       System.out.println("cant delete item becouse this is already Empty");
   }else
   this.front=this.front.next;
   if(this.front==null) this.rear=null;
   
   }
  public node getfront()
   {
   assert (!isEmpty());
   return front ;
   
   }
  public node getrear()
  {
  assert (!isEmpty());
  return rear ; 
  }
  public void clearlinkedqueue()
  {
  this.front = null ;
  this.rear = null ; 
  
  }
  public void display()
  {
  // will not use front or rear becouse if i used them will move from first item and last item and then cant get this items again
      node current = front ; 
      while(current.next!=null)
      {
          System.out.println(current.item);
       
        current=current.next;
      
      }
      
  
  }
  
}
