/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.negocio.Modelo;
import java.util.List;

/**
 *
 * @author anderson_feliciano
 */
public interface ModeloDAO {
    
    void inserir(Modelo m);
    void atualizar(Modelo m);
    void excluir(int id);
    List<Modelo> getModelo();
    List<Modelo> getModelosByNome(String nome);
    Modelo getModelosById(int id);
    Modelo getModeloByNome(String nome);
    
    
}
