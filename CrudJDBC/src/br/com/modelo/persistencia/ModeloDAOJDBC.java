/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo.persistencia;

import br.com.modelo.negocio.Marca;
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
public class ModeloDAOJDBC implements ModeloDAO {

    private final String INSERT = "INSERT INTO MODELO (DESCRICAO,POTENCIA ,MARCA_ID) VALUES(?,?,?)";
    private final String UPDATE = "UPDATE MODELO SET DESCRICAO = ?, POTENCIA = ?, MARCA_ID = ? WHERE ID = ?";
    private final String DELETE = "DELETE FROM MODELO WHERE ID = ?";
    private final String LIST = "SELECT * FROM MODELO, MARCA "
            + "WHERE MODELO.MARCA_ID = MARCA.ID";
    private final String LISTBYNOME = "SELECT * FROM MODELO , marca WHERE NOME LIKE ? AND MODELO.MARCA_ID = marca.ID";
    private final String LISTBYID = "SELECT * FROM MODELO WHERE ID = ? AND MODELO.MARCA_ID = MARCA.ID";

    public void inserir(Modelo m) {
        Connection conn;
        try {
            conn = FabricaConexao.getConnection();
            PreparedStatement pstm = conn.prepareStatement(INSERT);
            pstm.setString(1, m.getDescrição());
            pstm.setInt(2, m.getPotencia());
            pstm.setInt(3, m.getMarca().getId());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Modelo cadastrada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar uma modelo: " + e.getMessage());
        }
    }

    public void atualizar(Modelo m) {
        Connection conn;
        try {
            conn = FabricaConexao.getConnection();
            PreparedStatement pstm = conn.prepareStatement(UPDATE);
            pstm.setString(1, m.getDescrição());
            pstm.setInt(2, m.getPotencia());
            pstm.setInt(3, m.getMarca().getId());
            pstm.setInt(4, m.getId());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Modelo atualizada com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar uma modelo: " + e.getMessage());
        }
    }

    public void excluir(int id) {
        Connection conn;
        try {
            conn = FabricaConexao.getConnection();
            PreparedStatement pstm = conn.prepareStatement(DELETE);
            pstm.setInt(1, id);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Modelo excluida com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir uma modelo: " + e.getMessage());
        }
    }

    public List<Modelo> getModelo() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Modelo> modelos = new ArrayList<Modelo>();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setDescrição(rs.getString("descricao"));
                modelo.setPotencia(rs.getInt("potencia"));
                Marca ma = new Marca();
                ma.setId(rs.getInt("marca.id"));
                ma.setNome(rs.getString("marca.nome"));
                modelo.setMarca(ma);
                modelos.add(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as modelos: " + e.getMessage());
        }
        return modelos;
    }

    public List<Modelo> getModelosByNome(String nome) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Modelo> modelos = new ArrayList<Modelo>();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LISTBYNOME);
            pstm.setString(1, '%' + nome + '%');
            rs = pstm.executeQuery();
            while (rs.next()) {
                Modelo modelo = new Modelo();
                modelo.setId(rs.getInt("id"));
                modelo.setDescrição(rs.getString("descricao"));
                modelo.setPotencia(rs.getInt("potencia"));
                Marca ma = new Marca();
                ma.setId(rs.getInt("marca.id"));
                ma.setNome(rs.getString("marca.nome"));
                modelo.setMarca(ma);
                modelos.add(modelo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as modelos: " + e.getMessage());
        }
        return modelos;
    }

    public Modelo getModelosById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                modelo.setId(rs.getInt("id"));
                modelo.setDescrição(rs.getString("descricao"));
                modelo.setPotencia(rs.getInt("potencia"));
                Marca ma = new Marca();
                ma.setId(rs.getInt("marca.id"));
                ma.setNome(rs.getString("marca.nome"));
                modelo.setMarca(ma);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as modelos: " + e.getMessage());
        }
        return modelo;
    }

    public Modelo getModeloByNome(String nome) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Modelo modelo = new Modelo();
        try {
            conn = FabricaConexao.getConnection();
            pstm = conn.prepareStatement(LISTBYNOME);
            pstm.setString(1, nome);
            rs = pstm.executeQuery();
            while (rs.next()) {
                modelo.setId(rs.getInt("id"));
                modelo.setDescrição(rs.getString("descricao"));
                modelo.setPotencia(rs.getInt("potencia"));
                Marca ma = new Marca();
                ma.setId(rs.getInt("marca.id"));
                ma.setNome(rs.getString("marca.nome"));
                modelo.setMarca(ma);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar as modelos: " + e.getMessage());
        }
        return modelo;
    }
}
