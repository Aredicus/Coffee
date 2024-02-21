package org.boots.coffee.Repository;

import org.boots.coffee.Entity.Coffeeshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CoffeeshopRepository extends JpaRepository<Coffeeshop, Long> {

    @Transactional
    @Modifying
    @Query(value = "insert into coffeeshop(personid, coffeeid) VALUES (?1, ?2)", nativeQuery = true)
    void insertNewTransaction(Long personId, Long coffeeId);
}
