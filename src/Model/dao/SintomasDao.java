package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Grau_Risco;
import Model.bean.Sintomas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SintomasDao {

    public void create(Sintomas s) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO sintomas (descricao)"
                    + "VALUES(?)");
            stmt.setString(1, s.getDescricao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Sintomas salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Sintomas s) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE sintomas SET "
                    + "descricao = ?"
                    + " WHERE id = ?");

            stmt.setString(1, s.getDescricao());
            stmt.setInt(2, s.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Sintomas s) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM sintomas WHERE id = ?");
            stmt.setInt(1, s.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Sintomas> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Sintomas> sintomas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM sintomas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Sintomas s = new Sintomas();
                s.setId(rs.getInt("id"));
                s.setDescricao(rs.getString("descricao"));

                sintomas.add(s);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sintomas não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return sintomas;
    }//lista tudo

    public List<Sintomas> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Sintomas> sintomas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM sintomas WHERE descricao LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Sintomas s = new Sintomas();
                s.setId(rs.getInt("id"));
                s.setDescricao(rs.getString("descricao"));

                sintomas.add(s);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sintoma não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return sintomas;
    }
}
