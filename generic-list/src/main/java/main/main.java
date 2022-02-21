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
public class main {
    public static void main(String[] args) {
        
        
        Liste<String> list = new Liste<String>();
        
        
        list.add("Hallo");
        list.add("Wie Gehts so?");
        list.add("sehr gut");
        
        
        list.ToFirst();
        
        while(list.hasAccess()){
            System.out.println(list.getContent());
            list.next();
        }
        
    }
}
