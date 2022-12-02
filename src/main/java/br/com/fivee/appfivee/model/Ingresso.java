package br.com.fivee.appfivee.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_ingresso")
public class Ingresso {

    @Id
    @Column(name = "id_ingresso", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipo_ingresso", nullable = false)
    private String tipo;

    @Column(name = "valor_ingresso", nullable = false)
    private double valor;

    @ManyToOne
    @JoinColumn(name = "tbl_evento_id_evento")
    private Evento evento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
