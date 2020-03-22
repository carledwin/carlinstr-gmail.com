package com.wordpress.carledwinti.tarefas.elasticsearch.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "tarefas", type = "tarefas", shards = 1)
public class Tarefas {

    private String descricao;
    private String status;
    private Long id;
    private Long duracao;
    private String responsavel;

    public Tarefas() { }

    public Tarefas(String descricao, String status, Long id, Long duracao, String responsavel) {
        this.descricao = descricao;
        this.status = status;
        this.id = id;
        this.duracao = duracao;
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", id=" + id +
                ", duracao=" + duracao +
                ", responsavel='" + responsavel + '\'' +
                '}';
    }
}
