/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgbdjava;

import linear.Linear;

/**
 *
 * @author Administrador
 */
public class SgbdJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Linear linear = new Linear();
        System.out.println(linear.buscar(97844667088L));
    }
    
}