/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.UsuarioDTO;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class UsuarioDAO {
    
    Connection conn;
    
 public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        try {
            conn = new Conexao().conectaBD();
            String sql = "SELECT * FROM usuario WHERE email_usuario = ? AND senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getEmail_usuario());

            String senhaEncriptada = encriptarSenha(objusuariodto.getSenha_usuario());
            pstm.setString(2, senhaEncriptada);
            
            ResultSet resultado = pstm.executeQuery();
            return resultado;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null; 
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e);
            return null; 
        }
    }
 
 public ArrayList<UsuarioDTO> buscarUsuarios() {
     ArrayList<UsuarioDTO> listaUsuario = new ArrayList<UsuarioDTO>();
             
      try {
            conn = new Conexao().conectaBD();
            String sql = "SELECT * FROM usuario";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet resultado = pstm.executeQuery();
            
            
            while (resultado.next()){                  
                  UsuarioDTO usuario = new UsuarioDTO();
                   usuario.setId_usuario(resultado.getInt("id_usuario"));
                   usuario.setCpf_usuario(resultado.getString("cpf_usuario"));
                   usuario.setEmail_usuario(resultado.getString("email_usuario"));
                   usuario.setNome_usuario(resultado.getString("nome_usuario"));
                   usuario.setStatus_usuario(resultado.getBoolean("status"));
                   usuario.setGrupo_usuario(resultado.getString("grupo"));
                   listaUsuario.add(usuario);
              }
            
            return listaUsuario;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null; 
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + e);
            return null; 
        }
 }

    private String encriptarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            JOptionPane.showMessageDialog(null, "Erro ao encriptar senha: " + e);
            return null;
        }
    }
    
public boolean alterar(UsuarioDTO usuario) throws SQLException {
        boolean sucesso = false;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = new Conexao().conectaBD();
            String sql = "UPDATE usuario SET grupo_usuario = ?, cpf_usuario = ?, senha_usuario = ? WHERE id_usuario = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getGrupo_usuario());
            stmt.setString(2, usuario.getCpf_usuario());
            stmt.setString(3, usuario.getSenha_usuario());
            stmt.setInt(4, usuario.getId_usuario());
            stmt.executeUpdate();
            sucesso = true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            sucesso = false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexão: " + ex.getMessage());
            }
        }

        return sucesso;
    }

public void create(UsuarioDTO usuario) throws ClassNotFoundException {
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = new Conexao().conectaBD();

        String sql = "INSERT INTO usuario (nome_usuario, senha_usuario, email_usuario, grupo, status, cpf_usuario)"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        stmt = conn.prepareStatement(sql);

        stmt.setString(1, usuario.getNome_usuario());
        stmt.setString(2, usuario.getSenha_usuario());
        stmt.setString(3, usuario.getEmail_usuario());
        stmt.setString(4, usuario.getGrupo_usuario());
        stmt.setBoolean(5, Boolean.TRUE);
        stmt.setString(6, usuario.getCpf_usuario()); // Corrigido para 6, que é o número do placeholder

        stmt.executeUpdate();

    } catch (SQLException ex) {
        System.out.println("Erro ao criar usuário: " + ex.getMessage());
    } finally {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexão: " + ex.getMessage());
        }
    }
}

}
