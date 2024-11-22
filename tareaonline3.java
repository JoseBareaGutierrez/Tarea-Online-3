package com.mycompany.tareaonline3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tareaonline3 {

    public static void main(String[] args) {
    
        String nombre;
        String ubicacion;
        int anioConstruccion;
        boolean error =true;
        Scanner teclado=new Scanner(System.in);

        while(error){
            try {
                //todo el codigo que nosotros queneremos que se ejecute de manera inicial
                //el cual no sabemos si podra generar un error
                
                System.out.println("Escribe un nombre : ");
                nombre = teclado.nextLine();
                System.out.println("Escribe una ubicacion: ");
                ubicacion= teclado.nextLine();
                System.out.println("Escribe un año de contruccion: ");
                anioConstruccion = teclado.nextInt();
            
                System.out.println("El años de contruccion es: "+anioConstruccion);
    
                Monumento mon1 = new Monumento(nombre,ubicacion,anioConstruccion);//Estoy creando (new) un objeto (mon1) de la clase (Monumento)
                Monumento mon2 = new Monumento("Jose","Granada",2024);
                //He creado 2 objetos ( mon1 y mon2 ) 
                //en el objeto (mon2) le he creado ya unos valores predeterminador para poder compararlo
            
                System.out.println("La comparacion entre los 2 Objetos creados es: "+mon1.equals(mon2));
                //utilizando en metodo (.equals) para poder compararlos
       
                System.out.println(Monumento.mostrarHorarioVisita());
                //Metodo estatico para mostrar el horario
                
                System.out.println(mon1.Tiempo());
            
                error=false; // Salir del bucle si todo sale bien
   
            }catch (InputMismatchException e){
                // comportamiento de nuestro programa cuando se llega a generar 
                //un error que nosotros no tenemos previsto
                System.out.println("Introduce bien los datos no me seas CAZURRO !");
            }finally{
                //pase lo que pase siempre se ejecurata lo que este en finally
                teclado.nextLine(); //Limpio el buffer de entrada asi evitare problemas con el Scanner
            }
        }
        teclado.close(); // para no tener problema con el bucle con el teclado.
        System.out.println("Que tengas un buen dia :)");
    }
}
