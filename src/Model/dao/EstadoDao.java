package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EstadoDao {

    public void create(Estado e) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO estado (nome)"
                    + "VALUES(?)");
            stmt.setString(1, e.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Estado salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Estado e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE estado SET "
                    + "nome = ? "
                    + " WHERE id = ?");

            stmt.setString(1, e.getNome());
            stmt.setInt(2, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Estado e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM estado WHERE id = ?");
            stmt.setInt(1, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Estado> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Estado> estados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM estado");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Estado e = new Estado();
                e.setId(rs.getInt("id"));
                e.setNome(rs.getString("nome"));

                estados.add(e);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Estado não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return estados;
    }//lista tudo

    public List<Estado> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Estado> estados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM estado WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Estado e = new Estado();
                e.setId(rs.getInt("id"));
                e.setNome(rs.getString("nome"));

                estados.add(e);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Estado não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return estados;
    }
}
