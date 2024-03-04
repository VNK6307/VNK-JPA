package wind.laguna.daohibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wind.laguna.daohibernate.models.Persons;
import wind.laguna.daohibernate.models.PersonsKey;

import java.util.List;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, PersonsKey> {

    List<Persons> findAllByCityOfLiving(String city);

    List<Persons> findAllByAgeBeforeOrderByAgeAsc(int age);

    Persons findByNameAndSurname(String name, String surname);
}
