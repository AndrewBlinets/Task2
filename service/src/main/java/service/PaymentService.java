package service;

import by.andreiblinets.database.dao.PaymentDAO;
import by.andreiblinets.database.dao.PaymentDAOImp;
import by.andreiblinets.entity.Payment;

import java.util.List;

public class PaymentService {

    private PaymentDAO paymentDAO;

    public PaymentService() {
        paymentDAO = new PaymentDAOImp();
    }

    public List<Payment> getAllPayment() {
        return paymentDAO.getAllPayment();
    }
}
