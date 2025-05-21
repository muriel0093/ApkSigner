package Las.dev;

import Las.dev.command.Command;
import Las.dev.concreteCommand.ConcreteCommand;
import Las.dev.invoker.CommandInvoker;
import Las.dev.receiver.ReceiverApkTool;

public class Main {
    public static void main(String[] args) {
        ReceiverApkTool receiver = new ReceiverApkTool();
        ConcreteCommand command = new ConcreteCommand(receiver, "apk", "outfile");

        CommandInvoker invoker = new CommandInvoker();
        invoker.executeCommand(command);
    }
}