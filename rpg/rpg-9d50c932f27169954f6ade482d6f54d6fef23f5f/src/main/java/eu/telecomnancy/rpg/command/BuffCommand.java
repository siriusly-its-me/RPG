package eu.telecomnancy.rpg.command;

public class BuffCommand implements Command {
    private GameFacade game;

    public BuffCommand(GameFacade game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.buff();
    }

    @Override
    public void undo() {
        
    }
}
