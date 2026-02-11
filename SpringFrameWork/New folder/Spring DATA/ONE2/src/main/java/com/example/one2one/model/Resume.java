package com.example.one2one.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="resume_details")
public class Resume {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "resume_sequence",allocationSize = 1)
    @GeneratedValue(generator="seq", strategy = GenerationType.SEQUENCE)
    @Column(name="resume_id")
    private Integer resumeId;

    @Column(name="resume_url")
    private String resumeUrl;

    @OneToOne(mappedBy = "resume")
    @JsonBackReference
    private Applicant applicant;

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getResumeUrl() {
        return resumeUrl;
    }

    public void setResumeUrl(String resumeUrl) {
        this.resumeUrl = resumeUrl;
    }
}
