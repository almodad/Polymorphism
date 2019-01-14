/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Almodad
 */
public class Calf extends Cow implements CowInterface{

    @Override
    public void setAge() {
        this.age = 10;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}
