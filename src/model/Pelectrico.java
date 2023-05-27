package model;

public class Pelectrico extends Pokemon implements Electrico {

    public Pelectrico() {
        vida = 50;
    }

    @Override
    public void impactrueno() {
        System.out.println(nombre + " ha usado 'Impactrueno' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void latigo() {
        System.out.println(nombre + " ha usado 'Latigo' y ha inflingido " + danio);
        poder();
    }

    @Override
    public void ondaTrueno() {
        System.out.println(nombre + " ha usado 'Onda Trueno' y ha inflingido " + danio);
        poder();
    }
}