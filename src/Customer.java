public class Customer {
    private String EngName;
    private String ARName;
    private String Phone;
    private String Email;

    public String getARName() {
        return ARName;
    }

    public String getEmail() {
        return Email;
    }

    public String getEngName() {
        return EngName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setARName(String ARName) {
        this.ARName = ARName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setEngName(String engName) {
        EngName = engName;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

//    public Customer(String EngName, String ARName, String Phone, String Email){
//        this.ARName=ARName;
//        this.EngName=EngName;
//        this.Email=Email;
//        this.Phone=Phone;
//    }
    public Customer(){

    }
}
