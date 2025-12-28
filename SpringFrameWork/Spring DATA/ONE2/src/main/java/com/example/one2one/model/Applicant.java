package com.example.one2one.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name="applicant_details")
public class Applicant {

    @Id
    @SequenceGenerator(name="seq",sequenceName = "applicant_sequence",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "applicant_id")
    private Integer applicantId;

    @Column(name="name")
    private String name;

    @Column(name="job_name")
    private String jobName;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference
    @JoinColumn(name = "resume_id")
    private Resume resume;

    public Integer getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Integer applicantId) {
        this.applicantId = applicantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
