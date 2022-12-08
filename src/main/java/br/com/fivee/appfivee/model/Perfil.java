package br.com.fivee.appfivee.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_perfil")
public class Perfil {

    @Id
    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "nome", nullable = false, length = 60)
    private String nome;

    @Column(name = "cidade", length = 45)
    private String cidade;

    @Column(name = "distancia")
    private double distanciaRec;

    @Column(name = "interesses", length = 45)
    private String interesses;

    @Column(name = "gosto_musical", length = 45)
    private String gostoMusical;

    @Column(name = "tipos_eventos", length = 45)
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

    public double getDistanciaRec() {
        return distanciaRec;
    }

    public void setDistanciaRec(double distancia) {
        this.distanciaRec = distancia;
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
