package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Grau_Risco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Grau_RiscoDao {
    
    public void create(Grau_Risco g) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO grau (descricao)"
                    + "VALUES(?)");
            stmt.setString(1, g.getDescricao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Tipo salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Grau_Risco g) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE grau SET "
                    + "descricao = ? "
                    + " WHERE id = ?");

            stmt.setString(1, g.getDescricao());
            stmt.setInt(2, g.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Grau_Risco g) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM grau WHERE id = ?");
            stmt.setInt(1, g.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Grau_Risco> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Grau_Risco> tipos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM grau");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Grau_Risco e = new Grau_Risco();
                e.setId(rs.getInt("id"));
                e.setDescricao(rs.getString("descricao"));

                tipos.add(e);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "tipos não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return tipos;
    }//lista tudo

    public List<Grau_Risco> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Grau_Risco> tipos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM grau WHERE descricao LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Grau_Risco e = new Grau_Risco();
                e.setId(rs.getInt("id"));
                e.setDescricao(rs.getString("descricao"));

                tipos.add(e);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tipo não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return tipos;
    }
}
