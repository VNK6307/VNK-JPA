package wind.laguna.daohibernate.services;

import jakarta.transaction.Transactional;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wind.laguna.daohibernate.models.Persons;
import wind.laguna.daohibernate.repositories.PersonsRepository;

import java.util.List;
import java.util.Optional;

@Getter
@Service
@Transactional
public class PersonsService {
    private final PersonsRepository personsRepository;

    @Autowired
    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> findAll() {
        return personsRepository.findAll();
    }

    public List<Persons> findByCity(String city) {
        return personsRepository.findAllByCityOfLiving(city);
    }

    public List<Persons> findByAge(int age) {
        return personsRepository.findAllByAgeBeforeOrderByAgeAsc(age);
    }

    public Persons findByFio(String name, String surname) {
        Optional<Persons> findPerson = Optional.ofNullable(personsRepository.findByNameAndSurname(name, surname));
        return findPerson.orElse(null);
    }
}
