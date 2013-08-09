/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.negocio.Automovel;
import br.com.modelo.negocio.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson_feliciano
 */
public class AutomovelDAOJDBC implements AutomovelDAO {

    private final String INSERT = "INSERT INTO AUTOMOVEL (anoFabricacao, anoModelo, observacoes, preco, quilometragem, modelo) VALUES(?,?,?,?,?,?)";
    private final String UPDATE = "UPDATE AUTOMOVEL SET anoFabricacao = ?, anoModelo = ?, observacoes = ?, preco = ?, quilometragem = ?, modelo = ? WHERE ID = ?";
    private final String DELETE = "DELETE FROM AUTOMOVEL WHERE ID = ?";
    private final String LIST = "SELECT * FROM AUTOMOVEL AUTOMOVEL.MODELO_ID = MODELO.ID";
    private final String LISTBYNOME = "SELECT * FROM AUTOMOVEL WHERE DESCRICAO LIKE ? AUTOMOVEL.MODELO_ID = MODELO.ID";
    private final String LISTBYID = "SELECT * FROM AUTOMOVEL WHERE ID = ? AUTOMOVEL.MODELO_ID = MODELO.ID";

    public void inserir(Automovel m) {
        Connection conn;
        try {
            conn = FabricaConexao.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setInt(1, m.getAnoFabricacao());
            pstm.setInt(2, m.getAnoModelo());
            pstm.setString(3, m.getObservacoes());
            pstm.setDouble(4, m.getPreco());
            pstm.setInt(5, m.getQuilometragem());
            pstm.setInt(6, m.getModelo().getId());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Automovel cadastrada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar uma automovel: " + e.getMessage());
        }
    }

    public void atualizar(Automovel m) {
        Connection conn;
        try {
            conn = FabricaConexao.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setInt(1, m.getAnoFabricacao());
            pstm.setInt(2, m.getAnoModelo());
            pstm.setString(3, m.getObservacoes());
            pstm.setDouble(4, m.getPreco());
            pstm.setInt(5, m.getQuilometragem());
            pstm.setInt(6, m.getModelo().getId());
            pstm.setInt(7, m.getId());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Automovel atualizada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar uma automovel: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        Connection conn;
        try {
            conn = FabricaConexao.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
            pstm.setInt(1, id);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Automovel excluida com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir uma automovel: " + e.getMessage());
        }
    }

    public List<Automovel> getAutomovel() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Automovel> automovels = new ArrayList<Automovel>();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Automovel automovel = new Automovel();
                Modelo mo = new Modelo();
                mo.setId(rs.getInt("marca.id"));
                //mo.setNome(rs.getString("marca.nome"));
                //automo
                automovel.setId(rs.getInt("id"));
                automovel.setObservacoes(rs.getString("observacoes"));
                automovels.add(automovel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as automovels: " + e.getMessage());
        }
        return automovels;
    }

    public List<Automovel> getAutomovelsByNome(String nome) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Automovel> automovels = new ArrayList<Automovel>();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LISTBYNOME);
            pstm.setString(1, '%' + nome + '%');
            rs = pstm.executeQuery();
            while (rs.next()) {
                Automovel automovel = new Automovel();
                automovel.setId(rs.getInt("id"));
                automovel.setObservacoes(rs.getString("observacoes"));
                automovels.add(automovel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as automovels: " + e.getMessage());
        }
        return automovels;
    }

    public Automovel getAutomovelsById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Automovel automovel = new Automovel();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                automovel.setId(rs.getInt("id"));
                automovel.setObservacoes(rs.getString("observacoes"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as automovels: " + e.getMessage());
        }
        return automovel;
    }

    public Automovel getAutomovelByNome(String nome) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Automovel automovel = new Automovel();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LISTBYNOME);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                automovel.setId(rs.getInt("id"));
                automovel.setObservacoes(rs.getString("observacoes"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as automovels: " + e.getMessage());
        }
        return automovel;
    }
}
