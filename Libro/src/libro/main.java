/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      
        Libro libro1 = new Libro("2025", "Elrubius", 10, 2);

  
        Scanner sc = new Scanner(System.in);
        Libro libro2 = new Libro();
        System.out.println("Ingrese el título del libro2:");
        libro2.setTitulo(sc.nextLine());
        System.out.println("Ingrese el autor del libro2:");
        libro2.setAutor(sc.nextLine());
        System.out.println("Ingrese el número de ejemplares del libro2:");
        libro2.setNumEjemplares(sc.nextInt());
        System.out.println("Ingrese el número de ejemplares prestados del libro2:");
        libro2.setNumPrestados(sc.nextInt());

       
        biblioteca biblioteca = new biblioteca(5);
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

      
        System.out.println("\nIntentando prestar '2025': " + biblioteca.prestarLibro("2025"));
        System.out.println("\nIntentando devolver '2025': " + biblioteca.devolverLibro("2025"));

       
        biblioteca.mostrarLibros();
    }
}
