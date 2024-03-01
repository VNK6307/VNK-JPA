package wind.laguna.daohibernate.services;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wind.laguna.daohibernate.models.Persons;
import wind.laguna.daohibernate.repositories.PersonsRepository;

import java.util.List;

@Getter
@Service
public class PersonsService {
    private final PersonsRepository personsRepository;

    @Autowired
    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    String sql = "SELECT p FROM Persons p WHERE p.cityOfLiving = :city";

    public List<Persons> getPersonsByCity(String city) {
        return personsRepository.findByCity(city, sql);
    }
}
