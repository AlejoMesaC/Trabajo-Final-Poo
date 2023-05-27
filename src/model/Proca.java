package model;

public class Proca extends Pokemon implements Roca {

    public Proca() {
        vida = 50;
    }

    @Override
    public void lanzaroca() {
        System.out.println(nombre + " ha usado 'Lanzaroca' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void placaje() {
        System.out.println(nombre + " ha usado 'Placaje' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void terremoto() {
        System.out.println(nombre + " ha usado 'Terremoto' y ha inflingido " + danio);
        poder();
    }
}
