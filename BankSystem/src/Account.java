public class Account {

    private String Customer_Name;
    private String Customer_Address;
    private int Customer_Balance;
    private int Customer_Acc_No;

    public static  int accno = 1001;

    public Account(String customer_Name, String customer_Address, int customer_Balance) {
        Customer_Name = customer_Name;
        Customer_Address = customer_Address;
        Customer_Balance = customer_Balance;
        int Customer_Acc_No = accno++;
    }

    public String getCustomer_Name() {

        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {

        Customer_Name = customer_Name;
    }

    public String getCustomer_Address() {

        return Customer_Address;
    }

    public void setCustomer_Address(String customer_Address) {

        Customer_Address = customer_Address;
    }

    public int getCustomer_Balance() {

        return Customer_Balance;
    }

    public void setCustomer_Balance(int customer_Balance) {

        Customer_Balance = customer_Balance;
    }

    public int getCustomer_Acc_No() {

        return Customer_Acc_No;
    }

    public void setCustomer_Acc_No(int customer_Acc_No) {

        Customer_Acc_No = customer_Acc_No;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Customer_Name='" + Customer_Name + '\'' +
                ", Customer_Address='" + Customer_Address + '\'' +
                ", Customer_Balance=" + Customer_Balance +
                ", Customer_Acc_No=" + Customer_Acc_No +
                '}';
    }
}


// final variable and Static - capital