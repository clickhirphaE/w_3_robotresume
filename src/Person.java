
public class Person {
    private String name;
    private String email;
    private String telephone;
    public Person() {
        name = "";
        email = "";
        telephone = "";
    }
    public Person(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String toString() {
        return  "Name:      " + name + "\n" +
                "Telephone: " + telephone + "\n" +
                "Email:     " + email;
    }
}

