/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

import ico.fes.unam.edd11358.DoubleLinkedList;

/**
 *
 * @author Mireya
 */
public class doble {
    public static void main(String[] args) {
     DoubleLinkedList ldl = new DoubleLinkedList();
        ldl.append(new Integer(10));
        ldl.append(new Integer(20));
        ldl.transversal();
        ldl.append(new Integer(30));
        ldl.transversal();
        ldl.append(new Integer(40));
        ldl.transversal();
        
        
        
}
}