package Model;

public class User {
    private int userId;
    private String email;
    private String password;
    private String customerName;

    public User() {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.customerName = customerName;
        }

        public void setUserId ( int userId){
            this.userId = userId;
        }


        public void setPassword (String password){
            this.password = password;
        }

        public void setCustomerName (String customerName){
            this.customerName = customerName;
        }

        public void setEmail (String email){
            this.email = email;
        }
}
