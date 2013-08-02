/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.negocio;

/**
 *
 * @author anderson_feliciano
 */
public class Modelo {
    int id;
    String descrição;
    int potencia;
    Marca marca;

    public Modelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
}
