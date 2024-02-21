package org.boots.coffee.Repository;

import org.boots.coffee.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonsRepository extends CrudRepository<Person, Long> {
    Optional<Person> getPersonByName(String name);
}
