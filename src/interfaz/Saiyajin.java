package interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Saiyajin extends Guerrero {

    public Saiyajin(String nombre, String raza, int nivelPoder) {
        super(nombre, raza, nivelPoder);
    }

    @Override
    public void atacar(Guerrero enemigo) {

        String nombreGuerrero = nombre;
        if (nombreGuerrero.equalsIgnoreCase("goku")) {
            try {
                System.out.println(nombre + " ataca a " + enemigo.nombre + " con un Kamehameha");
                enemigo.nivelPoder -= 20000;
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                System.out.println(nombre + " ataca a " + enemigo.nombre + " con un Resplandor final");
                enemigo.nivelPoder -= 20000;
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (enemigo.nivelPoder > 0) {
            System.out.println("Nivel de poder de " + enemigo.nombre + ": " + enemigo.nivelPoder + "\n");
        } else {
            System.out.println("\n" + enemigo.nombre + " ha sido derrotado\n");
        }
    }

    public void transformar() {
        try {
            System.out.println(nombre + " se esta transformando...");
            Thread.sleep(6000);
            System.out.println(nombre + " se ha transformado en " + raza + "!!!");
            nivelPoder += 95000;
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Nivel de poder actual: " + nivelPoder + "\n");
    }

    @Override
    public void ganador(Guerrero enemigo) {

        if (enemigo.nivelPoder <= 0) {
            System.out.println("Ganador: " + nombre);
        } else {
            System.out.println("\n" + enemigo.nombre + " todavia puede pelear!!!");
        }
    }

}
