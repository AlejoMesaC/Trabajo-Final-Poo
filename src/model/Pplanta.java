package model;

public class Pplanta extends Pokemon implements Planta {

    public Pplanta() {
        vida = 50;
    }

    @Override
    public void hojaAfilida() {
        System.out.println(nombre + " ha usado 'Hoja afilada' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void tormentaFloral() {
        System.out.println(nombre + " ha usado 'Tormenta floral' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void latigazo() {
        System.out.println(nombre + " ha usado 'Latigazo' y ha inflingido " + danio);
        poder();
    }

}
