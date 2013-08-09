/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.negocio.Automovel;
import java.util.List;

/**
 *
 * @author anderson_feliciano
 */
public interface AutomovelDAO {
    
    void inserir(Automovel m);
    void atualizar(Automovel m);
    void excluir(int id);
    List<Automovel> getAutomovel();
    List<Automovel> getAutomovelsByNome(String nome);
    Automovel getAutomovelsById(int id);
    Automovel getAutomovelByNome(String nome);
    
    
}
