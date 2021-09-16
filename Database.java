/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thorsten
 */

import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;
    
    public Database(){
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        this.birds.add(bird);
    }
    
    public void printAll(){
        for(Bird b : birds){
            System.out.println(b);
        }
    }
    
    public String printOne(String name){
        for(Bird bird:birds){
            if(bird.getName().equals(name)){
                return bird.toString();
            }
        }
        return null;
    }
    
    public boolean observation(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                bird.observe();
                return true;
            }           
        }
        return false;
    }
    
    
}
