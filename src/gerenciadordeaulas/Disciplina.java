/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeaulas;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Disciplina {
    private String nome;
    private String turma;
    private String sala;
    private String professor;
    private ArrayList<DiaDeAula> diasDeAula = new ArrayList<>();
    private ArrayList<Evento> eventos = new ArrayList<>();
    private ArrayList<Anotacao> anotacoes = new ArrayList<>();

    public Disciplina(){
        
    }
    
    public Disciplina(String nome){
        this.nome = nome;
    }
    
    public Disciplina(String nome, String turma, String sala, String professor, ArrayList<DiaDeAula> diasDeAula){
        this.nome = nome;
        this.turma = turma;
        this.sala = sala;
        this.professor = professor;
        this.diasDeAula = diasDeAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }    

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(ArrayList<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }

    public ArrayList<DiaDeAula> getDiasDeAula() {
        return diasDeAula;
    }

    public void setDiasDeAula(ArrayList<DiaDeAula> diasDeAula) {
        this.diasDeAula = diasDeAula;
    }

       
}
