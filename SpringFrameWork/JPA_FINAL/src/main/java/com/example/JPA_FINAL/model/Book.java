package com.example.JPA_FINAL.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @SequenceGenerator(name = "seq",sequenceName = "book_seq",allocationSize = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    private Integer Id;

    @Column(name="isbn")
    private String isbn;

    @Column(name="book_name")
    private String bookName;

    @Column(name="author")
    private String author;

    @Column(name="publication_year")
    private String publicationYear;

    @Column(name = "total_copies")
    private Integer totalCopies;

    @Column(name="rented_copies")
    private Integer rentedCopies;

    @Column(name="available_copies")
    private Integer availableCopies;

    @ManyToOne
    @JoinColumn(name="library_id")
    @JsonBackReference
    private Library library;

}
