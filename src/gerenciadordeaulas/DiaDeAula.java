/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordeaulas;

/**
 *
 * @author Gabriel
 */
public class DiaDeAula {
    private String dia;
    private String hora;

    public DiaDeAula(String dia, String hora){
        this.dia = dia;
        this.hora = hora;
    }

    public DiaDeAula() {
        
    }
    
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    @Override
    public String toString() {
        return this.dia + ": " + this.hora;
    }
}
