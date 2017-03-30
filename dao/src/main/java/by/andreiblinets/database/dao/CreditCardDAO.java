package by.andreiblinets.database.dao;

import by.andreiblinets.entity.CreditCard;

import java.util.List;

public interface CreditCardDAO {
    List<CreditCard> getUserCard(long idUser);
}
