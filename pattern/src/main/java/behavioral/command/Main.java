package behavioral.command;

/**
 *
 * Command Pattern -> we can encapsulate method invocation, it encapsulates a request
 * 			as an object ...
 *
 * 		Good -> the object invoking the computation know nothing about the implementation
 *
 * 			4 components: command, receiver, invoker and client
 *
 * 					Command: knows about receiver and invokes a method of the receiver
 * 						Values for parameters of the receiver method are stored in the command !!!
 *
 * 					Receiver: does the work itself
 *
 * 					Invoker: knows how to execute a command, and optionally does bookkeeping about the
 * 								 command execution
 * 		The invoker does not know anything about a concrete command, it knows only about command interface !!!
 *
 * 					Client:  The client decides which commands to execute at which points
 * 						 To execute a command, it passes the command object to the invoker object
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();

        Light light = new Light();

        Command onCommand = new TurnOnCommand(light);
        Command offCommand = new TurnOffCommand(light);

        switcher.addCommand(onCommand);
        switcher.addCommand(offCommand);

        switcher.executeCommands();
    }
}