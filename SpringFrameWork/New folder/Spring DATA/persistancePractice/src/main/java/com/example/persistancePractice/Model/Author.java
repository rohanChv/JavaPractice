package com.example.persistancePractice.Model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="author")
@NoArgsConstructor
public class Author {
    @Id

    @SequenceGenerator(
            name = "author_sequence",        // <-- must match 'generator' above
            sequenceName = "author_sequence",// <-- actual DB sequence name
            allocationSize = 1               // 1 is safest with PostgreSQL to avoid ID gaps
    )

    @GeneratedValue(generator = "author_sequence",strategy = GenerationType.SEQUENCE)
    @Column(name="Id")
    private Integer Id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="age")
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
