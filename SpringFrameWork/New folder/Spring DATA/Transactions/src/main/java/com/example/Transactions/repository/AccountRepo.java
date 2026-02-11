package com.example.Transactions.repository;

import com.example.Transactions.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
    Account findByAccountId(Integer Id);

    @Modifying
    @Query("update Account set balance=:balance where account_id=:account_id")
    void updateDebitAccount(@Param("balance") Double balance,@Param("account_id") Integer account_id);

    @Query(value="update Account set balance=:balance where account_id=:account_id and is_blocked!='Y' returning user_name",nativeQuery = true)
    String updateCreditAccount(@Param("balance") Double balance,@Param("account_id") Integer account_id);
}
