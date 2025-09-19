package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
import java.util.Optional;
public class Zoologico {
    private String name;
    private ArrayList<Animal> listAnimals;
    
    public Zoologico(String name) {
        this.name = name;
        this.listAnimals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getListAnimals() {
        return listAnimals;
    }

    public void setListAnimals(ArrayList<Animal> listAnimals) {
        this.listAnimals = listAnimals;
    }
    
    @Override
    public String toString() {
        return "Zoologico " + name + ", listAnimals=" + listAnimals.size();
    }

    public String addAnimal(Animal newAnimal){
        String result=" ";
        Optional <Animal> existingAnimal= searchAnimal(newAnimal.getCode());
        if(existingAnimal.isPresent()){
            listAnimals.add(newAnimal);
            result= "The animal"  + newAnimal.getName() + "was added successfully";
        }else{
            result="The animal with the code:  "+newAnimal.getCode() + " already exists in the Zoo";
        }
        return result;
    }

    public Optional searchAnimal (int code){
        return listAnimals.stream().filter(animal -> animal.getCode() == code).findFirst();
    }

    public String updateAnimal (String newName, int code){
        String result=" ";
        Optional <Animal> existingAnimal= searchAnimal(code);
        if(existingAnimal.isPresent()){
            existingAnimal.get().setNombre(newName);
            result="The animal with code: "+ code + "was updated correctly";
        }else{
            result="The animal doesn't exist in the zoo";
        }
        return result;
    }

    public String removeAnimal(int code){
        String result=" ";
        Optional <Animal> existingAnimal=searchAnimal(code);
        if(existingAnimal.isPresent()){
            listAnimals.remove(existingAnimal);
            result="The animal with code: " + code + "was removed successfully";
        }else{
            result="The animal with code doesn't exist in the zoo";
        }
        return result;
    }
    public String animalSound(){
        String sound=" ";
        for (Animal aux: listAnimals){
            sound+=aux.getName() + " makes the sound" + aux.makeSound() + "\n";
        }
        return sound;
    }
    
}
