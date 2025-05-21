package Las.dev.concreteCommand;

import Las.dev.command.Command;
import Las.dev.receiver.ReceiverApkTool;

public class ConcreteCommand implements Command {
    private ReceiverApkTool receiver;
    private String input, output;

    public ConcreteCommand(ReceiverApkTool receiver, String input, String output) {
        this.receiver = receiver;
        this.input = input;
        this.output = output;
    }

    @Override
    public void execute() {
        receiver.alignApk();
    }
}
