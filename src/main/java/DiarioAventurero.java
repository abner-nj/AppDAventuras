
import java.util.Stack;

/**
 *
 * @author Abner
 */
public class DiarioAventurero {
    //donde se almacenaran las misiones
    private Stack<String> misiones = new Stack<>();

    //metodo que agrega una nueva mision
    public void registrarMision(String mision) {
        misiones.push(mision);
    }

    //metodo para eliminar la ultima mision
    public void eliminarMision() {
        if (misiones.isEmpty()) {
            System.out.println("No hay misiones registradas para eliminar");
        } else {
            String misionD = misiones.pop();
            System.out.println("La mision fallida ha sido eliminada: " + misionD);
        }
    }
    
    //metodo para mostrar las misiones
    public void mostrarMisiones() {
        if (misiones.isEmpty()) {
            System.out.println("No hay misiones agregadas");
        } else {
            System.out.println("-- Misiones --");
            for (String m : misiones) {
                System.out.println(" - " + m);
            }
        }
        System.out.println("");
    }

    //metodo para buscar una mision
    public boolean buscarMision(String mision) {
        boolean b = misiones.contains(mision);
        return b;
    }
    
    public void editarMision(String mision, String mNueva) {
        if (misiones.contains(mision)) {
            Stack<String> temp = new Stack<>();
            //se crea un arreglo temporal donde sera vaciado todos los elementos
            //del arreglo original para hacer la comparacion
            while (!misiones.isEmpty()) {
                String mtemp = misiones.pop();
                if (mtemp.equals(mision)) {
                    temp.push(mNueva);
                    break;
                } else {
                    temp.push(mtemp);
                }
            }
            
            while (!temp.isEmpty()) {  //agregando las misiones al arreglo principal
                misiones.push(temp.pop());
            }
            System.out.println("Misión editada con éxito: " + mNueva);
        } else {
            System.out.println("La misión no existe en el diario.");
        }
    }
}
