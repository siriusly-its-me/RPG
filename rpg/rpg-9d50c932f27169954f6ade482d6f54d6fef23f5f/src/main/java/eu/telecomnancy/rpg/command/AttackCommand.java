package eu.telecomnancy.rpg.command;

public class AttackCommand implements Command {
        private GameFacade game;
    
        public AttackCommand(GameFacade game) {
            this.game = game;
        }
    
        @Override
        public void execute() {
            game.attack();
        }
    
        @Override
        public void undo() {
            // Implémenter l'annulation de l'attaque si nécessaire
        }
    }

