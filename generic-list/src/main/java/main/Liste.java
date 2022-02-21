/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author zelle
 * @param <T>
 */
public class Liste<T> {

    private Knote<T> head;
    private Knote<T> counter;
    
    public void add(T elem){
        if(head == null){
            head= new Knote<>();
            head.set(elem);
            
        }else{
            Knote<T> temp;
            temp = head;
            
            while(!temp.isNext()){
                temp = temp.getnext();
            }
            
            temp.setNext(elem);
            
        }
    }
    
    public void concat(Liste<T> pliste){
        pliste.ToFirst();
        
        while(pliste.hasAccess()){
            this.add(pliste.getContent());
            pliste.next();
        }
    }
    
    public void ToFirst(){
        counter = head;
    }
    
    public void next(){
        counter = counter.getnext();
    }
    
    public T getContent(){
        return counter.getContent();
    }
    
    public boolean hasAccess(){
        return counter != null;
    }
    
}
