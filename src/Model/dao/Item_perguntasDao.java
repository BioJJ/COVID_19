package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Consulta;
import Model.bean.Item_perguntas;
import Model.bean.Pergunta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Item_perguntasDao {

    public void create(Item_perguntas p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO item_perguntas (pergunta, resposta, consulta)"
                    + "VALUES(?,?,?)");
            stmt.setInt(1, p.getPergunta().getId());
            stmt.setString(2, p.getResposta());
            stmt.setInt(3, p.getConsulta().getId());

            stmt.executeUpdate();

          //  JOptionPane.showMessageDialog(null, "itens salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Item_perguntas p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE item_perguntas SET "
                    + "pergunta = ?, "
                    + "resposta = ? "
                    + " WHERE id = ?");

            stmt.setInt(1, p.getPergunta().getId());
            stmt.setString(2, p.getResposta());
            stmt.setInt(3, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Item_perguntas i) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM item_perguntas WHERE id = ?");
            stmt.setInt(1, i.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Item_perguntas> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Item_perguntas> itens = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_pergunta");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item_perguntas p = new Item_perguntas();
                p.setId(rs.getInt("id"));

                Pergunta s = new Pergunta();
                s.setId(rs.getInt("pergunta"));
                s.setPergunta(rs.getString("descricao"));
                p.setPergunta(s);

                p.setResposta(rs.getString("resposta"));

                itens.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "itens não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return itens;
    }//lista tudo

    public List<Item_perguntas> listar_pergunta(int cod) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Item_perguntas> itens = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_pergunta WHERE consulta = ?");
            stmt.setInt(1, cod);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Item_perguntas p = new Item_perguntas();
                p.setId(rs.getInt("id"));

                Consulta cc = new Consulta();
                cc.setId(rs.getInt("consulta"));

                p.setConsulta(cc);

                Pergunta s = new Pergunta();
                s.setId(rs.getInt("pergunta"));
                s.setPergunta(rs.getString("descricao"));
                p.setPergunta(s);

                p.setResposta(rs.getString("resposta"));

                itens.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "'-' não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return itens;
    }
}
