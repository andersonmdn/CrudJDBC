/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.negocio.Marca;
import java.util.List;

/**
 *
 * @author anderson_feliciano
 */
public interface MarcaDAO {
    
    void inserir(Marca m);
    void atualizar(Marca m);
    void excluir(int id);
    List<Marca> getMarca();
    List<Marca> getMarcasByNome(String nome);
    Marca getMarcasById(int id);
    
    
}
