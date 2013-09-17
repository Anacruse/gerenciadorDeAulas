/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeaulas;

import java.util.Date;

/**
 *
 * @author Gabriel
 */
class Evento {
    private String nomeDisciplina;
    private Date data;
    private String conteudo;
    private int prioridade = 1;

    public Evento(){
        
    }
    
    public Evento(String nomeDisciplina, Date data, String conteudo){
        this.nomeDisciplina = nomeDisciplina;
        this.data = data;
        this.conteudo = conteudo;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
