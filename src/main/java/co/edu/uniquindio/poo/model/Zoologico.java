package co.edu.uniquindio.poo.model;
import java.util.ArrayList;
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
    public String addAnimal(Animal newAnimal){
        String result=" ";
        Animal foundAnimal=null;
        Animal existingAnimal= searchAnimal(newAnimal.getCode());
        if(existingAnimal==null){
            listAnimals.add(newAnimal);
            result= "The animal"  + newAnimal.getName() + "was added successfully";
        }else{
            result="The animal with the code:"+newAnimal.getCode() + "already exists in the Zoo";
        }
        return result;
    }

    public Animal searchAnimal (int code){
        Animal foundAnimal=null;
        for(Animal i: listAnimals){
            if(i.getCode()==code){
                foundAnimal=i;
                break;
            }
        }
        return foundAnimal;
    }

    public String updateAnimal (String newName, int code){
        String result=" ";
        Animal existingAnimal= searchAnimal(code);
        if(existingAnimal!=null){
            existingAnimal.setNombre(newName);
            result="The animal with code: "+ code + "was updated correctly";
        }else{
            result="The animal doesn't exist in the zoo";
        }
        return result;
    }

    public String removeAnimal(int code){
        String result=" ";
        Animal existingAnimal=searchAnimal(code);
        if(existingAnimal!=null){
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
