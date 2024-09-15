package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {

    private String nombre;
    private LocalDate fechaInscripcion;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getCedula())) {
            miembros.add(miembro);
        }
    }

    public boolean verificarMiembro(String cedula) {
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenadores.add(entrenador);
        }
    }

    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void eliminarMiembro(String cedula) {
        for (Miembro miembro : miembros) {
            if (miembro.getCedula().equals(cedula)) {
                miembros.remove(miembro);
                break;
            }
        }
    }

    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

     /**
     * Metodo que muestra los nombres de los miembros de la lista en orden inverso
     */

    public void listaNombresInverso() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            mostrarMensaje(miembro.getNombre());
        }
    }

    /**
     * Metodo que crea una lista de miembros que son menores de 18 años.
     * 
     * @return Una lista de objetos cuya edad es menor de 18 años.
     */

    public LinkedList<Miembro> miembrosMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }

    /**
     * Metodo para calcular la edad promedio
     */

    public int calcularPromedioEdad() {
        int sumatoria = 0;
        for (Miembro miembro : miembros) {
            sumatoria += miembro.getEdad();
        }
        sumatoria /= miembros.size();
        return sumatoria;
    }

    /**
     * Metodo para determinar cuando es una vocal
     */

    private int determinarVocal(String nombre) {
        int contador = 0;
        char[] vocales = nombre.toLowerCase().toCharArray();
        for (char vocal : vocales) {
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                contador += 1;
            }
        }
        return contador;
    }

    /**
     * Metodo para eliminar nombre por vocales
     */

    public void eliminarNombreVocales2() {
        for (Miembro miembro : miembros) {
            if (determinarVocal(miembro.getNombre()) >= 3) {
                miembros.remove(miembro);
            }
        }
    }

    /**
     * Metodo para determinar la moda de las edades
     */

    public int modaEdades() {
        int moda = -1;
        int maxFrecuencia = 0;

        for (int i = 0; i < miembros.size(); i++) {
            int edadActual = miembros.get(i).getEdad();
            int frecuencia = 0;

            // Contar cuántas veces aparece la edad actual
            for (int j = 0; j < miembros.size(); j++) {
                if (miembros.get(j).getEdad() == edadActual) {
                    frecuencia++;
                }
            }

            // Actualizar la moda si la frecuencia actual es mayor que la anterior
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                moda = edadActual;
            }
        }

        return moda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", fechaInscripcion=" + fechaInscripcion + ", miembros=" + miembros
                + ", entrenadores=" + entrenadores + "]";
    }

}
