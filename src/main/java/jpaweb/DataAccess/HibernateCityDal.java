package DataAccess;


import entity.City;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class HibernateCityDal implements ICityDal{
    private EntityManager entityManager;

    @Autowired
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<City> GetAll() {
        System.out.println("çalıştı");
        Session session=entityManager.unwrap(Session.class);
        List<City> cities= session.createQuery("select from City ",City.class).getResultList();
        return cities;
    }

    @Override
    public void add(City city) {

    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(City city) {

    }
}
