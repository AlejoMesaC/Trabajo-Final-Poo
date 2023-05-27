package model;

public class Pagua extends Pokemon implements Agua {

    public Pagua() {
        vida = 50;
    }

    @Override
    public void borbuja() {
        System.out.println(nombre + " ha usado 'Borbuja' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void acuajet() {
        System.out.println(nombre + " ha usado 'Acuajet' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void hidrobomba() {
        System.out.println(nombre + " ha usado 'Hidrobomba' y ha inflingido " + danio);
        poder();
    }
}
