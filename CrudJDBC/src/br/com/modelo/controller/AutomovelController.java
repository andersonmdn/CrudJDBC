/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.controller;

import br.com.modelo.negocio.Automovel;
import br.com.modelo.persistencia.AutomovelDAO;
import br.com.modelo.persistencia.AutomovelDAOJDBC;
import java.util.List;

/**
 *
 * @author anderson_feliciano
 */
public class AutomovelController {
    public void inserir(Automovel m) {
        AutomovelDAO md = new AutomovelDAOJDBC();
        md.inserir(m);

    }

    /**
     * Método que liga o botão editar da interface gráfica com o método
     * atualizar do banco de dados
     *
     * @param pessoa
     */
    public void atualizar(Automovel m) {
        AutomovelDAO md = new AutomovelDAOJDBC();
        md.atualizar(m);

    }

    /**
     * Método que liga o botão excluir da interface gráfica com o método remover
     * do banco de dados
     *
     * @param pessoa
     */
    public void excluir(int id) {
        AutomovelDAO md = new AutomovelDAOJDBC();
        md.excluir(id);

    }

    /**
     * Método que retorna as marcas cadastradas na base
     * de dados para preencer a tabela presente na view
     * @return Array List Automovel
     */
    public List<Automovel> getAutomovel() {

        AutomovelDAO md = new AutomovelDAOJDBC();
        return md.getAutomovel();
    }
    /**
     * Método que retorna as marcas cadastradas na base
     * de dados para preencer a tabela presente na view de acordo com a pesquisa
     * @param nome
     * @return Array List Automovel
     */

    public List<Automovel> buscarAutomovelByNome(String nome) {
        AutomovelDAO md = new AutomovelDAOJDBC();
        return md.getAutomovelsByNome(nome);
    }
    
    /**
     * Método que retorna a marca cadastrada na base
     * de dados para preencer os campos presentes na view
     * @param id
     * @return Automovel
     */
    public Automovel buscarAutomovelById(int id) {
        AutomovelDAO md = new AutomovelDAOJDBC();
        return md.getAutomovelsById(id);
    }
     public Automovel getMarcByNome(String nome) {
        AutomovelDAO md = new AutomovelDAOJDBC();
        return md.getAutomovelByNome(nome);
    }
    
}
