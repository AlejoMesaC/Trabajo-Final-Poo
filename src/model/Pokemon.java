package model;

import java.util.Random;

public class Pokemon {

    protected String tipo;
    protected String nombre;
    protected double vida;
    protected double danio;

    public static final Random rnd = new Random();

    protected double poderPokemon = rnd.nextDouble() * 90 + 10;
    protected double defensaPokemon = rnd.nextDouble() * 90 + 10;

    public Pokemon() {
        danio = poderPokemon - defensaPokemon;
    }

    protected void poder() {

        if (defensaPokemon < poderPokemon) {

            if (vida > danio) {
                vida = vida - danio;
            } else {
                vida = 0;
            }
        }
    }

    protected void defensa() {
        if (defensaPokemon < poderPokemon) {
            if (vida > danio) {
                vida = vida - danio;
            } else {
                vida = 0;
            }
        }
    }

    protected void embestida() {
        System.out.println(nombre + " ha usado 'Embestida' y ha inflingido " + danio);
        poder();
    }
}