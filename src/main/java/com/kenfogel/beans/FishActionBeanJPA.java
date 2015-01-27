package com.kenfogel.beans;

import com.kenfogel.entities.Fish;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
//import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

/**
 * A magic bean that returns a list of fish
 *
 * @author Ken
 *
 */
@Named
@RequestScoped
public class FishActionBeanJPA implements Serializable {

    @Resource
    private UserTransaction userTransaction;

    @PersistenceContext(unitName = "fishies")
    private EntityManager entityManager;

//    @PersistenceUnit(unitName = "fishies")
//    private EntityManagerFactory entityManagerFactory;    
    
    
    
    public List<Fish> getAll() throws SQLException {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
        // Criteria for Select all records
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Fish> cq = cb.createQuery(Fish.class);
        Root<Fish> fish = cq.from(Fish.class);
        cq.select(fish);
        TypedQuery<Fish> query = entityManager.createQuery(cq);
        List<Fish> fishies = query.getResultList();

        return fishies;
    }
}
