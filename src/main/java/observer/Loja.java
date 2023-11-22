package observer;

import java.util.Observable;

public class Loja extends Observable {

    private String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    public void lançarPromoção() {
        // Lógica para identificar a promoção e notificar observadores
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return nome;
    }
}
