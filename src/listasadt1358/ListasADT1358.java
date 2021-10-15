/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;
 
import ico.fes.modelo.Empleado;
import ico.fes.unam.edd11358.LinkedListADT;
import java.util.ArrayList;

/**
 *
 * @author Mireya
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("jose"));
        lsl.append(new String("Diana"));
        lsl.append(new String("Santiago"));
        lsl.append("Daniela");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        // Objetos del tipo empleado
        
        lsl2.append(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
        lsl2.append(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
        lsl2.append(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
        lsl2.append(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
        
        lsl2.transversal();
        ArrayList lista = new ArrayList();
        lista.add(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
        lista.add(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
         Object x = lista.get(0);
         System.out.println( ((Empleado)x).getNombre());
         
         ArrayList <Empleado> lista2 = new ArrayList<Empleado>();
         lista2.add(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
         lista2.add(new Empleado(1,"jose","Perez","Garcia",1850.f,2015,4));
         
         
        for(Empleado empleado : lista2){
            System.out.println(empleado.getNombre());
        }
    }
    
}
