package com.example.JPA_FINAL.repo;

import com.example.JPA_FINAL.model.Library;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Integer> {

    @Query("SELECT L FROM Library L JOIN FETCH L.books where L.id in(:id)")
    public List<Library> getListByIDList(@Param("id")List<Integer>id);

    @Query("SELECT new com.example.JPA_FINAL.DTO.LibraryDTO(name,location) FROM Library L")
    public Page<Library> getAllLibraries(Pageable page);

}
