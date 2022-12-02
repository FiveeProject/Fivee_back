package br.com.fivee.appfivee.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_perfil")
public class Perfil {

    @Id
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "distanciaRec")
    private Integer distanciaRec;

    @Column(name = "interesses")
    private String interesses;

    @Column(name = "gostoMusical")
    private String gostoMusical;

    @Column(name = "tiposEventos")
    private String tiposEventos;

    @OneToOne
    @JoinColumn(name = "tbl_usuario_id_usuario")
    private Usuario usuario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getDistanciaRec() {
        return distanciaRec;
    }

    public void setDistanciaRec(Integer distanciaRec) {
        this.distanciaRec = distanciaRec;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getGostoMusical() {
        return gostoMusical;
    }

    public void setGostoMusical(String gostoMusical) {
        this.gostoMusical = gostoMusical;
    }

    public String getTiposEventos() {
        return tiposEventos;
    }

    public void setTiposEventos(String tiposEventos) {
        this.tiposEventos = tiposEventos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
