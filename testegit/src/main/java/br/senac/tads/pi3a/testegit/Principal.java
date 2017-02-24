/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.testegit;

/**
 *
 * @author DANILO&PAULA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    private static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i <= 10; i++) {
            mostrarMensagem(i);
        }
    }

    public static void mostrarMensagem(int i){
          System.out.println("Hello world Senac PI3A!!!");
    }
}
