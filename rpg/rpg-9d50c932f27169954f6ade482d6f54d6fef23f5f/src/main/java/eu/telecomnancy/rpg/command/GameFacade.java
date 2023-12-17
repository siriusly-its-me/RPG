package eu.telecomnancy.rpg.command;

public class GameFacade {
    public void addFellowship() {
        System.out.println("Ajouter une compagnie (Fellowship)");
    }

    public void removeFellowship() {
        System.out.println("Supprimer une compagnie (Fellowship)");
    }

    public void attack() {
        System.out.println("Attaquer une compagnie (1v1)");
    }

    public void heal() {
        System.out.println("Soigner une compagnie (Heal)");
    }

    public void buff() {
        System.out.println("Améliorer une compagnie (Buff)");
    }
}
