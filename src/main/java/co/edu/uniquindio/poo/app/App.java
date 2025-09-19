package co.edu.uniquindio.poo.app;
import co.edu.uniquindio.poo.model.Zoologico;
import javax.swing.JOptionPane;
import co.edu.uniquindio.poo.model.Animal;
import co.edu.uniquindio.poo.model.Lion;
import co.edu.uniquindio.poo.model.Wolf;

public class App {
    public static void main(String[] args) {
        Zoologico zoo=new Zoologico("zoo uku");
        Animal animal1=new Lion(" leo ",4565,36, zoo);
        Animal animal2=new Wolf(" Shadow ", 1445, 34, zoo);
        Animal animal3=new Lion(" Mufasa ", 1234, 32, zoo);
        Animal animal4=new Wolf(" Storm ", 9876, 30, zoo);
        Animal animal5=new Lion(" Scar ", 10912, 36, zoo);

        JOptionPane.showMessageDialog(null, zoo.addAnimal(animal1));
        JOptionPane.showMessageDialog(null, zoo.addAnimal(animal2));
        JOptionPane.showMessageDialog(null, zoo.addAnimal(animal3));
        JOptionPane.showMessageDialog(null, zoo.addAnimal(animal4));
        JOptionPane.showMessageDialog(null, zoo.addAnimal(animal5));
        JOptionPane.showMessageDialog(null, zoo.animalSound());
    }
}
