package eu.telecomnancy.rpg.command;

import java.util.ArrayList;
import java.util.List;


// Invoker
class GameInvoker {
    private List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            command.execute();
        }
        commandQueue.clear();
    }

    public void undoCommands() {
        for (int i = commandQueue.size() - 1; i >= 0; i--) {
            commandQueue.get(i).undo();
        }
        commandQueue.clear();
    }
}




// public class GameInvoker implements Command {
//     private Command command;
//     private List<Command> commands = new ArrayList<Command>();

//     public GameInvoker(Command command) {
//         this.command = command;
//     }

//     public void addCommand(Command command) {
//         commands.add(command);
//     }

//     public void removeCommand(Command command) {
//         commands.remove(command);
//     }

//     public void execute() {
//         commands.add(this);
//         for (Command command : commands) {
//             if (command == this) {
//                 command.execute();
//                 commands.remove(command);
//                 break;
//             }
//             else {
//                 command.execute();
//                 commands.remove(command);
//             }
//         }
//     }

//     public void undo() {
//         command.undo();
//     }
    
// }
