
package modelo;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String rg;
    private String sexo;
    private String cidade;
    private Date datnasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDatnasc() {
        return datnasc;
    }

    public void setDatnasc(Date datnasc) {
        this.datnasc = datnasc;
    }
    
}
