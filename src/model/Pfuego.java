package model;

public class Pfuego extends Pokemon implements Fuego {

    public Pfuego() {
        vida = 50;
    }

    @Override
    public void lanzallamas() {
        System.out.println(nombre + " ha usado 'Lanzallamas' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void girofuego() {
        System.out.println(nombre + " ha usado 'Girofuego' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void bomba() {
        System.out.println(nombre + " ha usado 'Bomba' y ha inflingido " + danio);
        poder();
    }
}
