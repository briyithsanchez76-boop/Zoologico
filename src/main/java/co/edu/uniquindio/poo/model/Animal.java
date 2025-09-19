package co.edu.uniquindio.poo.model;

public abstract class Animal {
    private String name; 
    private int code;
    private int numberWhiskers;
    private Zoologico ownedByZoologico;

   
    public Animal(String name, int code, int numberWhiskers, Zoologico ownedByZoologico) {
        this.name = name;
        this.code = code;
        this.numberWhiskers = numberWhiskers;
        this.ownedByZoologico = ownedByZoologico;
    }

    public String getName() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }
    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNumberWhiskers() {
        return numberWhiskers;
    }

    public void setNumberWhiskers(int numberWhiskers) {
        this.numberWhiskers = numberWhiskers;
    }

    public Zoologico getOwnedByZoologico() {
        return ownedByZoologico;
    }

    public void setOwnedByZoologico(Zoologico ownedByZoologico) {
        this.ownedByZoologico = ownedByZoologico;
    }

    @Override
    public String toString() {
        return  name + 
        "\n , code= " + code + 
        " \n , numberWhiskers= " + numberWhiskers + 
        "\n , ownedByZoologico= " + ownedByZoologico ;
    }

    public String makeSound(){
        return " makes the sound: ";
    }
}
