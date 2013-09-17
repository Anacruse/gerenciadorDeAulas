/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeaulas;

/**
 *
 * @author Gabriel
 */
import java.util.ArrayList;

public class ControleDisciplina {

    private ArrayList<Disciplina> listaDisciplinas;

    public ControleDisciplina() {
        this.listaDisciplinas = new ArrayList<Disciplina>();
    }
    
    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    
    public void adicionar(Disciplina umDisciplina) {
        listaDisciplinas.add(umDisciplina);
    }
    
    public void remover(Disciplina umDisciplina) {
        listaDisciplinas.remove(umDisciplina);
    }
    
    public Disciplina pesquisar(String nome) {
        for (Disciplina b: listaDisciplinas) {
            if (b.getNome().equalsIgnoreCase(nome)) return b;
        }
        return null;
    }
}
