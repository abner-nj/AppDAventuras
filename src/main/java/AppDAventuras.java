/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Abner
 */
public class AppDAventuras {

    public static void main(String[] args) {
        DiarioAventurero diario = new DiarioAventurero();
        
        //se agregan misiones
        diario.registrarMision("Explorar a la mazmorra");
        diario.registrarMision("Ir a la taberna");
        diario.registrarMision("Salvar a la princesa");
        diario.registrarMision("Derrotar al jefe de la mazmorra");
        
        //muestra todas la misiones
        diario.mostrarMisiones();
        System.out.println("");
        
        //busca una mision
        System.out.println("¿Exploró la mazmorra?: " + diario.buscarMision("Explorar a la mazmorra"));
        System.out.println("");
        //Elimina la ultima mision
        diario.eliminarMision();
        System.out.println("");
        
        //muestra las misiones 
        diario.mostrarMisiones();
    }
}
