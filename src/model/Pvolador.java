package model;

public class Pvolador extends Pokemon implements Volador {

    public Pvolador() {
        vida = 50;
    }

    @Override
    public void latigoDeAire() {
        System.out.println(nombre + " ha usado 'Latigo de aire' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void rafaga() {
        System.out.println(nombre + " ha usado 'Rafaga' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void torbellino() {
        System.out.println(nombre + " ha usado 'Torbellino' y ha inflingido " + danio);
        poder();
    }
}
