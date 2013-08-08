/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.controller;

import br.com.modelo.negocio.Marca;
import br.com.modelo.persistencia.MarcaDAO;
import br.com.modelo.persistencia.MarcaDAOJDBC;
import java.util.List;

/**
 *
 * @author anderson_feliciano
 */
public class MarcaController {
    public void inserir(Marca m) {
        MarcaDAO md = new MarcaDAOJDBC();
        md.inserir(m);

    }

    /**
     * Método que liga o botão editar da interface gráfica com o método
     * atualizar do banco de dados
     *
     * @param pessoa
     */
    public void atualizar(Marca m) {
        MarcaDAO md = new MarcaDAOJDBC();
        md.atualizar(m);

    }

    /**
     * Método que liga o botão excluir da interface gráfica com o método remover
     * do banco de dados
     *
     * @param pessoa
     */
    public void excluir(int id) {
        MarcaDAO md = new MarcaDAOJDBC();
        md.excluir(id);

    }

    /**
     * Método que retorna as marcas cadastradas na base
     * de dados para preencer a tabela presente na view
     * @return Array List Marca
     */
    public List<Marca> getMarca() {

        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarca();
    }
    /**
     * Método que retorna as marcas cadastradas na base
     * de dados para preencer a tabela presente na view de acordo com a pesquisa
     * @param nome
     * @return Array List Marca
     */

    public List<Marca> buscarMarcaByNome(String nome) {
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcasByNome(nome);
    }
    
    /**
     * Método que retorna a marca cadastrada na base
     * de dados para preencer os campos presentes na view
     * @param id
     * @return Marca
     */
    public Marca buscarMarcaById(int id) {
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcasById(id);
    }
     public Marca getMarcByNome(String nome) {
        MarcaDAO md = new MarcaDAOJDBC();
        return md.getMarcaByNome(nome);
    }
    
}
