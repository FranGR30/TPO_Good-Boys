package estadoCondicionMedica;
import java.util.*;
import modelo.Animal;

public class Saludable implements EstadoCondicionMedica {


    public Saludable() {
    }
    
    public void serAdoptado(Animal animal) {
        animal.cambiarEstado(null);
    }


    public void recuperar(Animal animal) {
    }

}