/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.SistemaDeCarro.model;

/**
 *
 * @author Admin
 */
public class Carro {
    private String cor;
    private String placa;
    private String marca;
    private String modelo;
    
    
    public Carro(String cor, String placa, String marca, String modelo) {
       setCor(cor);
       setPlaca(placa);
       setMarca(marca);
       setModelo(modelo);
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
    public void info(){
       System.out.println("---GERENCIAMENTO DE CARRO---");
       System.out.println("Marca: " + getMarca());
       System.out.println("Modelo: " + getModelo());
       System.out.println("Cor: " + getCor());
       System.out.println("Num da placa: " + getPlaca());
    }
    
}
