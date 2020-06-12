package Model.dao;

import Connection.ConnectionFactory;
import Model.bean.Pessoas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PessoasDao {

    public void create(Pessoas p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO pessoa (nome, cpf, telefone, cep, rua,"
                    + "bairro, cidade, nasc, estado)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, p.getCep());
            stmt.setString(5, p.getRua());
            stmt.setString(6, p.getBairro());
            stmt.setString(7, p.getCidade());
            stmt.setString(8, p.getNasc());
            stmt.setString(9, p.getEstado());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Pessoa salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código já existente ou campos vazios!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//create

    public void update(Pessoas p) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE pessoa SET "
                    + "nome = ?, "
                    + "cpf = ?, "
                    + "telefone = ?, "
                    + "cep = ?, "
                    + "rua = ?, "
                    + "bairro = ?, "
                    + "cidade = ?, "
                    + "nasc = ?, "
                    + "estado = ?"
                    + " WHERE id = ?");

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getCpf());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, p.getCep());
            stmt.setString(5, p.getRua());
            stmt.setString(6, p.getBairro());
            stmt.setString(7, p.getCidade());
            stmt.setString(8, p.getNasc());
            stmt.setString(9, p.getEstado());
            stmt.setInt(10, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }//upadate

    public void delete(Pessoas e) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM pessoa WHERE id = ?");
            stmt.setInt(1, e.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Pessoas> read() {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pessoas> pessoas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pessoas p = new Pessoas();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setTelefone(rs.getString("telefone"));
                p.setCep(rs.getString("cep"));
                p.setRua(rs.getString("rua"));
                p.setBairro(rs.getString("bairro"));
                p.setCidade(rs.getString("cidade"));
                p.setNasc(rs.getString("nasc"));
                p.setEstado(rs.getString("estado"));

                pessoas.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoas não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pessoas;
    }//lista tudo

    public List<Pessoas> readForNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pessoas> pessoas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pessoas p = new Pessoas();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setTelefone(rs.getString("telefone"));
                p.setCep(rs.getString("cep"));
                p.setRua(rs.getString("rua"));
                p.setBairro(rs.getString("bairro"));
                p.setCidade(rs.getString("cidade"));
                p.setNasc(rs.getString("nasc"));
                p.setEstado(rs.getString("estado"));

                pessoas.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoa não encontrado" + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pessoas;
    }

    public List<Pessoas> Verificar_Login(String cpf, String nasc) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pessoas> pessoas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa WHERE cpf like ? and nasc like ?");
            stmt.setString(1, "%" + cpf + "%");
            stmt.setString(2, "%" + nasc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Pessoas p = new Pessoas();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
                p.setTelefone(rs.getString("telefone"));
                p.setCep(rs.getString("cep"));
                p.setRua(rs.getString("rua"));
                p.setBairro(rs.getString("bairro"));
                p.setCidade(rs.getString("cidade"));
                p.setNasc(rs.getString("nasc"));

                pessoas.add(p);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pessoas não encontrado" + ex.getMessage());

            return null;
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return pessoas;
    }//lista tudo
}
