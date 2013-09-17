/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeaulas;

/**
 *
 * @author Gabriel
 */
class Anotacao {
    private String nomeDisciplina;
    private String conteudo;

    public Anotacao(){
        
    }
    
    public Anotacao(String nomeDisciplina, String conteudo){
        this.nomeDisciplina = nomeDisciplina;
        this.conteudo = conteudo;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    public String getConteudo() {
        return conteudo;
    }


    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
