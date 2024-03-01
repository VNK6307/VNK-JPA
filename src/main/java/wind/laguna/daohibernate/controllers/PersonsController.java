package wind.laguna.daohibernate.controllers;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wind.laguna.daohibernate.models.Persons;
import wind.laguna.daohibernate.services.PersonsService;

import java.util.List;

@RestController
@RequestMapping("/persons")
@Transactional
@AllArgsConstructor
public class PersonsController {
    private PersonsService personsService;

    @GetMapping("/by-city")
    public List<Persons> showPersonsByCity(@RequestParam String city) {
        return personsService.getPersonsByCity(city);
    }
}
