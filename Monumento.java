package com.mycompany.tareaonline3;

import java.time.LocalTime;
import java.time.Duration;
import java.util.Objects;

public class Monumento {
    // Atributos
    String nombre;
    String ubicacion;
    int anioConstruccion;

    // Constructor parametrizado
    public Monumento(String nombre, String ubicacion, int anioConstruccion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.anioConstruccion = anioConstruccion;
    }

    // Método estático
    public static String mostrarHorarioVisita() {
        LocalTime horaActual = LocalTime.now();
        if (horaActual.isBefore(LocalTime.of(9, 0))) {
            return "El monumento aún no está abierto. Abre a las 9:00.";
        } else if (horaActual.isAfter(LocalTime.of(17, 0))) {
            return "El monumento ya está cerrado. Cierra a las 17:00.";
        } else {
            return "El monumento está abierto.";
        }
    }

    // Método equals
    public boolean equals(Monumento m) {
        if(m.nombre.equals(this.nombre) && m.ubicacion.equals(this.ubicacion) 
                && m.anioConstruccion == this.anioConstruccion)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ubicacion, anioConstruccion);
    }

    // Método toString
    @Override
    public String toString() {
        return "Monumento{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", anioConstruccion=" + anioConstruccion +
                '}';
    }
    // Metodo
    public String Tiempo() {
        LocalTime horaActual = LocalTime.now();  // Hora actual
        LocalTime horaCierre = LocalTime.of(17,00);  // Hora de cierre
        LocalTime horaApertura = LocalTime.of(9,00);  // Hora de apertura
        // Caso cuando aún está cerrado, pero antes de la apertura
        if (horaActual.isBefore(horaApertura)) {
            Duration tiempo=Duration.between(horaActual,horaApertura);
            long horas=tiempo.toHours();
            long minutos=tiempo.toMinutes()%60;
            return "Aun esta cerrado el monumento, abre en: "+horas+" H y "+minutos+" M";
        }
        // Caso cuando está cerrado y tenemos que esperar hasta la siguiente apertura
        else if (horaActual.isAfter(horaCierre)) {
            Duration tiempo=Duration.between(horaApertura,horaActual);
            long horas=-(tiempo.toHours()-23);
            long minutos=-((tiempo.toMinutes()%60)-60);
            return "El monumento esta cerrado, abre en: "+horas+" H y "+minutos+" M";
        } 
        // Caso cuando el negocio está abierto
        else {// Caso cuando el negocio está abierto
            Duration tiempo=Duration.between(horaActual,horaCierre);
            long horas=tiempo.toHours();
            long minutos=tiempo.toMinutes()%60;
            // Calcular tiempo restante hasta el cierre
            return "El monumento esta abierto y cierra en: "+horas+" H y "+minutos+" M";
        }//duration no llamar como hora puedo llamarlo duration o tiempo o algo mas generico
    }
}
