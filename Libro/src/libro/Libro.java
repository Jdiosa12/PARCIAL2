/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

public class Libro {
    protected String titulo;
    protected String autor;
    protected int Ejemplares;
    protected int Prestados;

  
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.Ejemplares = 0;
        this.Prestados = 0;
    }

   
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.Ejemplares = numEjemplares;
        this.Prestados = numPrestados;
    }

   
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return Ejemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.Ejemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return Prestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.Prestados = numPrestados;
    }

   
    public boolean prestamo() {
        if (Ejemplares - Prestados > 0) {
            Prestados++;
            return true;
        }
        return false;
    }

 
    public boolean devolucion() {
        if (Prestados > 0) {
            Prestados--;
            return true;
        }
        return false;
    }

    
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ejemplares: " + Ejemplares + ", Prestados: " + Prestados;
    }
}
