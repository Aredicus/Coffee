package org.boots.coffee.Repository;

import org.boots.coffee.Entity.Coffeeshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeshopRepository extends JpaRepository<Coffeeshop, Long> {
}
