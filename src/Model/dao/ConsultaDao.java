package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Consulta;
import Model.bean.Pessoas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaDao {
    
        public void create(Consulta c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO consulta (pessoa, statuss)"
                    + "VALUES(?,?)");
            stmt.setInt(1, c.getPessoa().getId());
            stmt.setString(2, c.getStatuss());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Consulta Iniciada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create
    
        public void update(Consulta c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE consulta SET "
                    + "statuss = ?, "
                    + "idade = ?, "
                    + "tempe = ?, "
                    + "pressa = ? "
                   +" WHERE id = ?");

            stmt.setString(1, c.getStatuss());
            stmt.setString(2, c.getIdade());
            stmt.setString(3, c.getTemp());
            stmt.setString(4, c.getPress());
            stmt.setInt(5, c.getId());
           

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate
        
    public void delete(Consulta c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM consulta WHERE id = ?");
            stmt.setInt(1, c.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public List<Consulta> read(String statuus) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Consulta> consultaa = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_consulta WHERE statuss LIKE ?");
            stmt.setString(1, "%"+statuus+"%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Consulta c = new Consulta();
                c.setId(rs.getInt("id"));
                c.setStatuss(rs.getString("statuss"));

                Pessoas p = new Pessoas();
                p.setId(rs.getInt("pessoa"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                c.setPessoa(p);

                consultaa.add(c);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CIdade não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return consultaa;
    }//lista tudo
    
    public List<Consulta> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Consulta> consultaa = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_consulta WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

             Consulta c = new Consulta();
                c.setId(rs.getInt("id"));
                c.setStatuss(rs.getString("statuss"));
                c.setIdade(rs.getString("idade"));
                c.setTemp(rs.getString("tempe"));
                c.setPress(rs.getString("pressa"));

                Pessoas p = new Pessoas();
                p.setId(rs.getInt("pessoa"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                c.setPessoa(p);

                consultaa.add(c);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "consulta não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return consultaa;
    }
}
