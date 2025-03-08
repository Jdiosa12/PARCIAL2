/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

public class biblioteca {
    protected Libro[] libros;
    protected int cantidadLibros;

 
    public biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        cantidadLibros = 0;
    }

    
    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
        } else {
            System.out.println("No hay espacio para más libros.");
        }
    }

  
    public boolean prestarLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                return libros[i].prestamo();
            }
        }
        return false;
    }


    public boolean devolverLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                return libros[i].devolucion();
            }
        }
        return false;
    }

 
    public void mostrarLibros() {
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libros[i].toString());
        }
    }
}
