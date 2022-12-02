package br.com.fivee.appfivee.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_evento")
public class Evento {

    @Id
    @Column(name = "id_evento", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_evento", nullable = false)
    private String nome;

    @Column(name = "desc_evento", nullable = false)
    private String desc;

    @Column(name = "local_evento", nullable = false)
    private String local;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
