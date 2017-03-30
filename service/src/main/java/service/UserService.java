package service;

import by.andreiblinets.database.dao.UserDAO;
import by.andreiblinets.database.dao.UserDAOImp;

public class UserService {

    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAOImp();
    }

    public boolean checkAutification(String login, String password)
    {
        return userDAO.checkAutification(login,password);
    }
}
