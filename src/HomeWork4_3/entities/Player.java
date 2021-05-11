package HomeWork4_3.entities;

public class Player extends Product {


    private String eMail;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private int dateOfBirth;


    public Player() {
    }

    public Player(int id, String eMail, String userName, String password, String firstName, String lastName, String nationalityId, int dateOfBirth) {
        this.setId(id);
        this.eMail = eMail;
        this.userName = userName;
        this.password = password;
    }


    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
