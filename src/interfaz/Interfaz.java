package interfaz;

import java.util.ArrayList;

public class Interfaz {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("--- DRAGON BALL Z ---");
        System.out.println("----------------------\n");

        Saiyajin goku = new Saiyajin("Goku", "Saiyajin", 27000);
        Saiyajin vegeta = new Saiyajin("Vegeta", "Saiyajin", 25000);
        Namekiano piccolo = new Namekiano("Piccolo", "Namekiano", 22000);
        Androide androide17 = new Androide("Nro 17", "Androide", 30000);
        Androide androide18 = new Androide("Nro 18", "Androide", 30000);
        Androide cell = new Androide("Cell", "Androide", 25000);

        System.out.println("GUERREROS\n");

        ArrayList<Guerrero> guerreros = new ArrayList<>();
        guerreros.add(new Saiyajin("Goku", "Saiyajin", 27000));
        guerreros.add(new Saiyajin("Vegeta", "Saiyajin", 25000));
        guerreros.add(new Namekiano("Piccolo", "Namekiano", 22000));
        guerreros.add(new Androide("17", "Androide", 30000));
        guerreros.add(new Androide("18", "Androide", 30000));
        guerreros.add(new Androide("Cell", "Androide", 25000));

        for (Guerrero guerrero : guerreros) {
            System.out.println("Nombre: " + guerrero.nombre + " || " + "Raza: " + guerrero.raza + " || " + "Nivel de poder: " + guerrero.nivelPoder);
            System.out.println("\n-----------------------\n");
        }

        try {
            System.out.println("Esperando unos segundos hasta que empiecen los combates...\n");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        System.out.println("--- PRIMER COMBATE ---");
        System.out.println("--- " + vegeta.nombre + " VS " + androide18.nombre + " --");
        System.out.println("-----------------------\n");
        vegeta.atacar(androide18);
        for (int i = 0; i < 3; i++) {
            androide18.atacar(vegeta);
        }
        androide18.ganador(vegeta);

        System.out.println("\n---- SEGUNDO COMBATE ----");
        System.out.println("--- " + piccolo.nombre + " VS " + androide17.nombre + " --");
        System.out.println("------------------------\n");
        piccolo.atacar(androide17);
        androide17.atacar(piccolo);
        piccolo.regenerarse();
        for (int i = 0; i < 2; i++) {
            androide17.atacar(piccolo);
        }
        androide17.ganador(piccolo);

        System.out.println("\n--- TERCER COMBATE ---");
        System.out.println("---- " + goku.nombre + " VS " + cell.nombre + " ----");
        System.out.println("----------------------\n");
        goku.atacar(cell);
        cell.absorbe(androide17);
        goku.transformar();
        goku.atacar(cell);
        cell.absorbe(androide18);
        for (int i = 0; i < 2; i++) {
            cell.atacar(goku);
        }
        for (int i = 0; i < 6; i++) {
            goku.atacar(cell);
        }
        goku.ganador(cell);

        System.out.println("\n");

    }
}
