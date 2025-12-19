package com.example.JPAPartOne.repository;

import com.example.JPAPartOne.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByFirstName(String firstName);

    @Query(value = "select * from user_details where country =?1",nativeQuery = true)
    List<User> getUserDetailsByCountry(String country);

//    @Query(value="select * from user_details where country IN (:country)",nativeQuery = true)
//    List<User> getUserDetailsByCountryList(@Param("country") List<String> country);
@Query("select u from User u where u.country IN (:country)")
List<User> getUserDetailsByCountryList(@Param("country") List<String> country);
@Query("select u from User u where u.firstName like :inputString")
List<User> findByFirstNameLike(@Param("inputString") String inputString);
}
