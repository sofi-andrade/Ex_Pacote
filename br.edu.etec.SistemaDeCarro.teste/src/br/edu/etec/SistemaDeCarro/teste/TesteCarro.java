package br.edu.etec.SistemaDeCarro.teste;

import br.edu.etec.SistemaDeCarro.model.Carro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro = new Carro("Vermelho", "18238923", "BMW", "X5");
        carro.info();
        
        
    }
    
}
