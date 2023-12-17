package eu.telecomnancy.rpg.command;

public class Client {
    public static void main(String[] args) {
        GameFacade game = new GameFacade();
        GameInvoker invoker = new GameInvoker();

        // Exemple d'utilisation
        Command addFellowship = new AddFellowshipCommand(game);
        Command attack = new AttackCommand(game);
        Command heal = new HealCommand(game);
        Command buff = new BuffCommand(game);

        invoker.addCommand(addFellowship);
        invoker.addCommand(attack);
        invoker.addCommand(heal);
        invoker.addCommand(buff);

        // Exécution des commandes
        invoker.executeCommands();

        // Annulation des commandes
        invoker.undoCommands();
    }
}