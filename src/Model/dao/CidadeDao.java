package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Cidade;
import Model.bean.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CidadeDao {

    public void create(Cidade c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cidade (nome, estado)"
                    + "VALUES(?,?)");
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getEstado().getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cidade salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create
    
        public void update(Cidade c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cidade SET "
                    + "nome = ?, "
                    + "estado = ? "
                   +" WHERE id = ?");

            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getEstado().getId());
            stmt.setInt(3, c.getId());
           

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate
        
    public void delete(Cidade c) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cidade WHERE id = ?");
            stmt.setInt(1, c.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public List<Cidade> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cidade> cidades = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_cidade");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cidade c = new Cidade();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));

                Estado e = new Estado();
                e.setId(rs.getInt("estado"));
                e.setNome(rs.getString("nomeestado"));
                c.setEstado(e);

                cidades.add(c);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "CIdade não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cidades;
    }//lista tudo
    
    public List<Cidade> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cidade> cidades = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tabela_cidade WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

               Cidade c = new Cidade();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));

                Estado e = new Estado();
                e.setId(rs.getInt("estado"));
                e.setNome(rs.getString("nomeestado"));
                c.setEstado(e);

                cidades.add(c);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cidade não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cidades;
    }
}
