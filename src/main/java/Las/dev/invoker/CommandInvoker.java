package Las.dev.invoker;

import Las.dev.command.Command;

public class CommandInvoker {
    public void executeCommand(Command command){
        command.execute();
    }
}
