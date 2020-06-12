package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Consulta;
import Model.bean.Grau_Risco;
import Model.bean.Item_selecionados;
import Model.bean.Sintomas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Item_SelecionadosDao {

    public void create(Item_selecionados i) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO item_sintomas (sintoma, grau, consulta)"
                    + "VALUES(?,?,?)");
            stmt.setInt(1, i.getSintoma().getId());
            stmt.setInt(2, i.getGrau().getId());
            stmt.setInt(3, i.getConsulta().getId());

            stmt.executeUpdate();

          //  JOptionPane.showMessageDialog(null, "itens salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Item_selecionados i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE item_sintomas SET "
                    + "sintoma = ?, "
                    + "grau = ?, "
                    + "consulta = ? "
                    + " WHERE id = ?");

            stmt.setInt(1, i.getSintoma().getId());
            stmt.setInt(2, i.getGrau().getId());
            stmt.setInt(3, i.getConsulta().getId());
            stmt.setInt(4, i.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Item_selecionados i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM item_sintomas WHERE id = ?");
            stmt.setInt(1, i.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Item_selecionados> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Item_selecionados> itens = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_sintomas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item_selecionados i = new Item_selecionados();
                i.setId(rs.getInt("id"));
               
                Consulta cc =  new Consulta();
                cc.setId(rs.getInt("consulta"));
                
                i.setConsulta(cc);

                Sintomas s = new Sintomas();
                s.setId(rs.getInt("sintoma"));
                s.setDescricao(rs.getString("nome"));
                i.setSintoma(s);

                Grau_Risco g = new Grau_Risco();
                g.setId(rs.getInt("grau"));
                g.setDescricao(rs.getString("risco"));
                i.setGrau(g);

                itens.add(i);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "itens não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return itens;
    }//lista tudo

    public List<Item_selecionados> listar_sintomas(int cod) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Item_selecionados> cidades = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_sintomas WHERE consulta = ?");
            stmt.setInt(1, cod);
            rs = stmt.executeQuery();

            while (rs.next()) {

                 Item_selecionados i = new Item_selecionados();
                i.setId(rs.getInt("id"));
               
                Consulta cc =  new Consulta();
                cc.setId(rs.getInt("consulta"));
                
                i.setConsulta(cc);

                Sintomas s = new Sintomas();
                s.setId(rs.getInt("sintoma"));
                s.setDescricao(rs.getString("nome"));
                i.setSintoma(s);

                Grau_Risco g = new Grau_Risco();
                g.setId(rs.getInt("grau"));
                g.setDescricao(rs.getString("risco"));
                i.setGrau(g);

                cidades.add(i);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cidade não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cidades;
    }
}
