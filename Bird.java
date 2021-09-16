/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thorsten
 */
public class Bird {
    private String name;
    private String nameLatin;
    private int numberOfObservations;
    
    public Bird(String name, String nameLatin){
        this.name = name;
        this.nameLatin = nameLatin;
        this.numberOfObservations = 0;
    }
    
    public void observe(){
        this.numberOfObservations++;        
    }
    
    public String getName(){
        return this.name; 
    }
    
    public String getLatinName(){
        return this.nameLatin;
    }
    
    public String toString(){
        return this.name + " ("+this.nameLatin + "): " +this.numberOfObservations + " observations";
    }
}
