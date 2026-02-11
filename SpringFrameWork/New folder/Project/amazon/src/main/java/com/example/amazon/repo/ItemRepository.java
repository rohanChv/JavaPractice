package com.example.amazon.repo;

import com.example.amazon.model.Item;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item,Long> {
    public List<Item> findByItemCategory(String category, Pageable page);
    public List<Item> findByItemNameLike(String item_name);
    @Query("select i.itemStock from Item i where i.id=:id")
    public Integer findStockByItemId(@Param("id")Long id);

    @Modifying
    @Query(value = "update  item set item_stock=:updatedStock where id=:id",nativeQuery = true)
    public void updateStockByCart(@Param("updatedStock")Integer updatedStock,@Param("id")Long id);

    @Modifying
    @Query(value = "update Item i set i.itemStock=:updatedStock where i.id=:id")
    public void updateStockByID(@Param("updatedStock")Integer updatedStock,@Param("id")Long id);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    public Optional<Item> findById(Long id);
}
