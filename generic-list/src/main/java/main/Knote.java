/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author zelle
 */
public class Knote<T> {
    
    private T t;
    private Knote<T> next;
    
    public void set(T t){
        this.t=t;
    }
    
    public boolean isNext(){
        return next == null;
    }
    
  
    
    public T getContent(){
        return t;
    }
    public void setNext(T elem){

        
        next = new Knote<T>();
        next.set(elem);
    }
    
    public void setNext(Knote<T> elem){

        
       
        next = elem;
    }
    
    public Knote<T> getnext(){
        return next;
    }
    
    
}
