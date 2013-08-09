/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.controller;

import br.com.modelo.negocio.Modelo;
import br.com.modelo.persistencia.ModeloDAO;
import br.com.modelo.persistencia.ModeloDAOJDBC;
import java.util.List;

/**
 *
 * @author anderson_feliciano
 */
public class ModeloController {
    public void inserir(Modelo m) {
        ModeloDAO md = new ModeloDAOJDBC();
        md.inserir(m);

    }

    /**
     * Método que liga o botão editar da interface gráfica com o método
     * atualizar do banco de dados
     *
     * @param pessoa
     */
    public void atualizar(Modelo m) {
        ModeloDAO md = new ModeloDAOJDBC();
        md.atualizar(m);

    }

    /**
     * Método que liga o botão excluir da interface gráfica com o método remover
     * do banco de dados
     *
     * @param pessoa
     */
    public void excluir(int id) {
        ModeloDAO md = new ModeloDAOJDBC();
        md.excluir(id);

    }

    /**
     * Método que retorna as modelos cadastradas na base
     * de dados para preencer a tabela presente na view
     * @return Array List Modelo
     */
    public List<Modelo> getModelo() {

        ModeloDAO md = new ModeloDAOJDBC();
        return md.getModelo();
    }
    /**
     * Método que retorna as modelos cadastradas na base
     * de dados para preencer a tabela presente na view de acordo com a pesquisa
     * @param nome
     * @return Array List Modelo
     */

    public List<Modelo> buscarModeloByNome(String nome) {
        ModeloDAO md = new ModeloDAOJDBC();
        return md.getModelosByNome(nome);
    }
    
    /**
     * Método que retorna a modelo cadastrada na base
     * de dados para preencer os campos presentes na view
     * @param id
     * @return Modelo
     */
    public Modelo buscarModeloById(int id) {
        ModeloDAO md = new ModeloDAOJDBC();
        return md.getModelosById(id);
    }
     public Modelo getMarcByNome(String nome) {
        ModeloDAO md = new ModeloDAOJDBC();
        return md.getModeloByNome(nome);
    }
    
}
