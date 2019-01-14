package polymorphism;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Almodad
 */
public class Cow extends AbstractCow{
    protected String name, breed;
    protected int age;
    public Cow(){
        
    }
    public Cow(String name){
        setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String getBreed() {
        return this.breed;        
    }
}
