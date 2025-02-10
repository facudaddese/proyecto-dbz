package interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Androide extends Guerrero {

    public Androide(String nombre, String raza, int nivelPoder) {
        super(nombre, raza, nivelPoder);
    }

    @Override
    public void atacar(Guerrero enemigo) {

        String nombreAndoride = nombre;

        if (nombreAndoride.equalsIgnoreCase("nro 17")) {
            try {
                System.out.println("\n" + nombre + " ataca a " + enemigo.nombre + " con una Onda de poder");
                enemigo.nivelPoder -= 10000;
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (nombreAndoride.equalsIgnoreCase("nro 18")) {
            try {
                System.out.println(nombre + " ataca a " + enemigo.nombre + " con rafagas de Ki");
                enemigo.nivelPoder -= 10000;
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                System.out.println(nombre + " ataca a " + enemigo.nombre + " con un Kamehameha");
                enemigo.nivelPoder -= 20000;
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (enemigo.nivelPoder > 0) {
            System.out.println("Nivel de poder de " + enemigo.nombre + ": " + enemigo.nivelPoder + "\n");
        } else {
            System.out.println("\n" + enemigo.nombre + " ha sido derrotado");
        }
    }

    @Override
    public void ganador(Guerrero enemigo) {
        if (enemigo.nivelPoder <= 0) {
            System.out.println("\nGanador: " + nombre);
        } else {
            System.out.println("\n" + enemigo.nombre + " todavia puede pelear!!!");
        }
    }

    public void absorbe(Androide androide) {

        String nombreAndroide = androide.nombre.toLowerCase();

        if (nombreAndroide.equals("nro 17") || nombreAndroide.equals("nro 18")) {
            System.out.println(nombre + " esta absorbiendo a " + nombreAndroide + "...");

            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Androide.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (nombreAndroide.equals("nro 17")) {
                try {
                    System.out.println(nombre + " ha alcanzado su forma semi-perfecta!!!");
                    nivelPoder += androide.nivelPoder;
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Androide.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (nombreAndroide.equals("nro 18")) {
                try {
                    System.out.println(nombre + " ha alcanzado su forma perfecta!!!");
                    nivelPoder += androide.nivelPoder + 90000;
                    Thread.sleep(4000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Androide.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Nivel de poder actual: " + nivelPoder + "\n");
        }
    }

}
