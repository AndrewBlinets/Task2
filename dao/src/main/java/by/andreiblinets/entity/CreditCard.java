package by.andreiblinets.entity;

public class CreditCard {

    private int id;
    private int numberAccount;
    private int idUser;

    public CreditCard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (id != that.id) return false;
        if (numberAccount != that.numberAccount) return false;
        return idUser == that.idUser;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + numberAccount;
        result = 31 * result + idUser;
        return result;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", numberAccount=" + numberAccount +
                ", idUser=" + idUser +
                '}';
    }
}
