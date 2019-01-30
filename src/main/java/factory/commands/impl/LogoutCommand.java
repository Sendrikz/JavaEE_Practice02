package factory.commands.impl;

import factory.commands.ActionCommand;
import utils.Constants;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().invalidate();
        return Constants.LOGIN_JSP;
    }
}
