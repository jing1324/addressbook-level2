package seedu.addressbook.commands;

import seedu.addressbook.Main;



/**
 * Lists all previously entered commands.
 */
public class HistoryCommand extends Command {

    public static final String COMMAND_WORD = "history";


    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all previously entered commands as a list of commands.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        return new CommandResult(Main.History.toString());
    }
}
