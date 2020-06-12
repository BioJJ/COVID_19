package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Pergunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PerguntaDao {

    public void create(Pergunta p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO pergunta (descricao)"
                    + "VALUES(?)");
            stmt.setString(1, p.getPergunta());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Estado salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Pergunta p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE pergunta SET "
                    + "descricao = ? "
                    + " WHERE id = ?");

            stmt.setString(1, p.getPergunta());
            stmt.setInt(2, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Pergunta e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM pergunta WHERE id = ?");
            stmt.setInt(1, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Pergunta> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pergunta> estados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM pergunta");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pergunta e = new Pergunta();
                e.setId(rs.getInt("id"));
                e.setPergunta(rs.getString("descricao"));

                estados.add(e);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pergunta não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return estados;
    }//lista tudo

    public List<Pergunta> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pergunta> estados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM pergunta WHERE descricao LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pergunta e = new Pergunta();
                e.setId(rs.getInt("id"));
                e.setPergunta(rs.getString("descricao"));

                estados.add(e);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pergunta não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return estados;
    }
}
