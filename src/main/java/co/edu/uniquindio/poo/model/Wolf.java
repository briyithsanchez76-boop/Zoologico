package co.edu.uniquindio.poo.model;

public class Wolf extends Animal {
    
    
    public Wolf(String name, int code, int numberWhiskers, Zoologico ownedByZoologico) {
        super(name, code, numberWhiskers, ownedByZoologico);
        
    }

        @Override
    public String makeSound() {
        return " Awoo!";
    }
    

}
