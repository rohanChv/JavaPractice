package model;

import javax.persistence.*;

@Entity
@Table(name="hibernate_trial")
public class HibernateTrial {
    @Id
    @SequenceGenerator(name="seq",sequenceName = "hibernate_seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer Id;

    @Column(name="name")
    private String name;

    public HibernateTrial(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
