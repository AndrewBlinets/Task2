package by.andreiblinets.entity;

public class CreditCard {

    private long id;
    private String nameCheck;
    private double balance;
    private long idOwner;

    public CreditCard() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCheck() {
        return nameCheck;
    }

    public void setNameCheck(String nameCheck) {
        this.nameCheck = nameCheck;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(long idOwner) {
        this.idOwner = idOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreditCard that = (CreditCard) o;

        if (id != that.id) return false;
        if (Double.compare(that.balance, balance) != 0) return false;
        if (idOwner != that.idOwner) return false;
        return nameCheck != null ? nameCheck.equals(that.nameCheck) : that.nameCheck == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (nameCheck != null ? nameCheck.hashCode() : 0);
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (idOwner ^ (idOwner >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id=" + id +
                ", nameCheck='" + nameCheck + '\'' +
                ", balance=" + balance +
                ", idOwner=" + idOwner +
                '}';
    }
}
