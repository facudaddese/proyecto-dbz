package interfaz;

public abstract class Guerrero implements IAtacable {

    String nombre, raza;
    int nivelPoder;

    public Guerrero(String nombre, String raza, int nivelPoder) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
    }
    
    public abstract void ganador(Guerrero enemigo);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }
}
