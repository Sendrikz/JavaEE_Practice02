package factory;

import factory.commands.ActionCommand;
import factory.enums.CommandEnum;
import utils.Constants;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {

    public ActionCommand getCommand(HttpServletRequest request) {
        String action = request.getParameter(Constants.COMMAND);
        CommandEnum commandEnum = CommandEnum.valueOf(action.toUpperCase());

        return commandEnum.getCurrentCommand();
    }

}
