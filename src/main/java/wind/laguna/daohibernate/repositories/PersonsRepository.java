package wind.laguna.daohibernate.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import wind.laguna.daohibernate.models.Persons;

import java.util.List;

@Repository
public class PersonsRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> findByCity(String city, String sql) {
        return entityManager.createQuery(sql, Persons.class).setParameter("city", city).getResultList();
    }
}
