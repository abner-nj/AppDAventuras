
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    }

    //metodo para buscar una mision
    public boolean buscarMision(String mision) {
        boolean b = misiones.contains(mision);
        return b;
    }
}
