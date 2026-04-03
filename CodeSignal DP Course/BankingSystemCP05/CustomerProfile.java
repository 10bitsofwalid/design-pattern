package BankingSystemCP05;

// TODO: Define the CustomerProfile class that extends Prototype.
// The class should have three fields: customerName, address, and accountNumber.
// TODO: Implement the constructor, getters, and toString method.

public class CustomerProfile extends Prototype {

    private String customerName;
    private String address;
    private String accountNumber;

    public CustomerProfile(String customerName, String address, String accountNumber) {
        this.customerName = customerName;
        this.address = address;
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public String getAccountNumber() { return accountNumber; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setAddress(String address) { this.address = address; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    @Override
    public Prototype clonePrototype() {
        return new CustomerProfile(customerName, address, accountNumber);
    }

    @Override
    public String toString() {
        return "CustomerProfile [customerName=" + customerName +
               ", address=" + address +
               ", accountNumber=" + accountNumber + "]";
    }
}
