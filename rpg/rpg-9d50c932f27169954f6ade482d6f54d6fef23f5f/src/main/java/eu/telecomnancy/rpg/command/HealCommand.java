package eu.telecomnancy.rpg.command;

public class HealCommand implements Command {
    private GameFacade game;

    public HealCommand(GameFacade game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.heal();
    }

    @Override
    public void undo() {
        // Implémenter l'annulation du soin si nécessaire
    }
}
