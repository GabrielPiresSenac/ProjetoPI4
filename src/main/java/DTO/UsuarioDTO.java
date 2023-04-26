/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author gabri
 */
public class UsuarioDTO {

    private int id_usuario;
    private String nome_usuario, senha_usuario, email_usuario, grupo_usuario, cpf_usuario;
    private boolean status_usuario;

    // Getters And Setters
    public void setStatus_usuario(boolean status_usuario) {
        this.status_usuario = status_usuario;
    }

    public boolean getStatus_usuario() {
        return status_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setGrupo_usuario(String grupo_usuario) {
        this.grupo_usuario = grupo_usuario;
    }

    public String getGrupo_usuario() {
        return grupo_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
    
        public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

}
