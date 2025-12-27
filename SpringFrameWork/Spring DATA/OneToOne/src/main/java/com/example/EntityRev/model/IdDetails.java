package com.example.EntityRev.model;

import javax.persistence.*;

@Entity
@Table(name="id_details")
public class IdDetails {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "id_sequence",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name="id_no")
    private Integer idNo;

    @Column(name="id_name")
    private String idName;

    @Column(name="id_number")
    private String idNumber;

    @OneToOne(mappedBy = "idDetails",fetch = FetchType.LAZY)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getIdNo() {
        return idNo;
    }

    public void setIdNo(Integer idNo) {
        this.idNo = idNo;
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
