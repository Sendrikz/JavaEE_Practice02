package factory.commands.impl;

import enteties.LoginedUsers;
import factory.commands.ActionCommand;
import utils.Constants;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

public class LoginCommand implements ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String login = request.getParameter(Constants.LOGIN);
        String password = request.getParameter(Constants.PASSWORD);

        List<LoginedUsers> loginedUsersList = Arrays.asList(LoginedUsers.values());

        for (LoginedUsers logIn : loginedUsersList) {
            if (logIn.getLogin().equals(login) &&
                    logIn.getPassword().equals(password)) {
                request.setAttribute(Constants.USER, logIn.getName());
                return Constants.MAIN_JSP;
            }
        }

        request.setAttribute(Constants.ERROR_LOGIN_MESSAGE, Constants.INVALID_LOGIN_OR_PASSWORD);
        return Constants.LOGIN_JSP;
    }
}
