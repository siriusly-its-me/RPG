package eu.telecomnancy.rpg.command;

public class AddFellowshipCommand implements Command{
    private GameFacade game;

    public AddFellowshipCommand(GameFacade game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.addFellowship();
    }

    @Override
    public void undo() {
        game.removeFellowship();
    }
}



