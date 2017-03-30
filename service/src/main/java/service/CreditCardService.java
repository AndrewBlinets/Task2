package service;

import by.andreiblinets.database.dao.CreditCardDAO;
import by.andreiblinets.database.dao.CreditCardDAOImp;
import by.andreiblinets.entity.CreditCard;

import java.util.List;

public class CreditCardService {

    private CreditCardDAO creditCardDAO;

    public CreditCardService() {
        creditCardDAO = new CreditCardDAOImp();
    }

    public List<CreditCard> getUserCard(long idUser) {
        return creditCardDAO.getUserCard(idUser);
    }
}
