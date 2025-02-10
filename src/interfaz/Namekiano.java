package interfaz;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Namekiano extends Guerrero {

    public int poderInicial;

    public Namekiano(String nombre, String raza, int nivelPoder) {
        super(nombre, raza, nivelPoder);
        this.poderInicial = nivelPoder;
    }

    @Override
    public void atacar(Guerrero enemigo) {
        try {
            System.out.println(nombre + " ataca a " + enemigo.nombre + " con un Makankosappo");
            enemigo.nivelPoder -= 12000;
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Saiyajin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (enemigo.nivelPoder > 0) {
            System.out.println("Nivel de poder de " + enemigo.nombre + ": " + enemigo.nivelPoder);
        } else {
            System.out.println("\n" + enemigo.nombre + " ha sido derrotado");
        }
    }

    @Override
    public void ganador(Guerrero enemigo) {
        if (enemigo.nivelPoder == 0) {
            System.out.println("Ganador: " + nombre);
        }
    }

    public void regenerarse() {
        try {
            System.out.println("\n" + nombre + " esta regenerando su poder...");
            Thread.sleep(6000);
            poderInicial += nivelPoder;
        } catch (InterruptedException ex) {
            Logger.getLogger(Namekiano.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(nombre + " se regenero y ahora su nivel es de: " + poderInicial);
    }

}
