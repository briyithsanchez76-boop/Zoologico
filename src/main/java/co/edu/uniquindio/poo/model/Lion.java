package co.edu.uniquindio.poo.model;

public class Lion extends Animal{
    
    public Lion(String name, int code, int numberWhiskers, Zoologico ownedByZoologico) {
        super(name, code, numberWhiskers, ownedByZoologico);
    }

     @Override
    public String makeSound() {
        return "   Roarr!";
    }


}
