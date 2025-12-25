package model;

import javax.persistence.*;

@Entity
@Table(name = "user_details")
public class User {

    @Id
    @SequenceGenerator(name = "seq",sequenceName = "user_seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    public Integer Id;

    @Column(name="first_name")
    public String firstName;

    @Column(name="last_name")
    public String lastName;

    @Column(name="email")
    public String email;

    @Column(name="country")
    public String country;

    public User(String firstName,String lastName, String email, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
