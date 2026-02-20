package com.example.JPA_FINAL.repo;

import com.example.JPA_FINAL.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
    @Query(value = "select * from books where library_id in ?1",nativeQuery = true)
    public List<Book> findByLibraryId(List<Integer>id);
}
