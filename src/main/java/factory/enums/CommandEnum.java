package factory.enums;

import factory.commands.ActionCommand;
import factory.commands.impl.LoginCommand;
import factory.commands.impl.LogoutCommand;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };

    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
