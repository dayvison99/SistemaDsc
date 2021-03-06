/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.sgubs.Aplicacao;

import java.util.Objects;
import javafx.scene.input.KeyCode;

/**
 *
 * @author dayvison
 */
public class Medico implements Entidade{
    private int id;
    private Especialidade Especialidade;
    private String nome;
    private String crm;
    private String rua;
    private String bairro;
    private String cidade;
    private int telefone;
    private int celular;
    private String observacoes;

    public Medico() {
    }

    public Medico(int id, String nome, String crm, String rua, String bairro, String cidade, int telefone, int celular, Especialidade Especialidade, String observacoes) {
        this.id = id;
        this.Especialidade = Especialidade;
        this.nome = nome;
        this.crm = crm;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.observacoes = observacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Especialidade getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(Especialidade Especialidade) {
        this.Especialidade = Especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.id;
        hash = 73 * hash + Objects.hashCode(this.Especialidade);
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.crm);
        hash = 73 * hash + Objects.hashCode(this.rua);
        hash = 73 * hash + Objects.hashCode(this.bairro);
        hash = 73 * hash + Objects.hashCode(this.cidade);
        hash = 73 * hash + this.telefone;
        hash = 73 * hash + this.celular;
        hash = 73 * hash + Objects.hashCode(this.observacoes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medico other = (Medico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (this.celular != other.celular) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.crm, other.crm)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.observacoes, other.observacoes)) {
            return false;
        }
        if (!Objects.equals(this.Especialidade, other.Especialidade)) {
            return false;
        }
        return true;
    }

    


     
  

    @Override
    public String toString() {
        return  nome ;
    }
    
    
    
    
}
