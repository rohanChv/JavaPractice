package com.example.JPA_FINAL.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="access_card")
@AllArgsConstructor
@NoArgsConstructor
public class AccessCard {
    @Id
    @SequenceGenerator(name = "seq",sequenceName = "acc_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    private Integer Id;

    @Column(name="access_level")
    private String accessLevel;

    @Column(name = "access_type")
    private String accessType;

    @OneToOne(mappedBy = "accessCard")
    @JsonBackReference
    private Employee employee;
}
