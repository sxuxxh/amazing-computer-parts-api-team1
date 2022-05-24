package com.fseteam1.amazingcomputerparts.dao;

import com.fseteam1.amazingcomputerparts.entity.ComputerPart;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ComputerPartDAOIMPL implements IComputerPartDAO{

    //Define field for entity manager
    /*The EntityManager API is used to create and remove persistent entity instances,
        to find entities by their primary key, and to query over entities. */
    private final EntityManager entityManager;

    // Setup Constructor Injection
    @Autowired
    public ComputerPartDAOIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional //Defines the scope of a single database transaction.
    public List<ComputerPart> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<ComputerPart> myQuery = currentSession.createQuery("from computer_parts");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public ComputerPart findById(int computerPartId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(ComputerPart.class, computerPartId);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void saveOrUpdate(ComputerPart thePart) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(thePart);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void deleteById(int computerPartId) {
        Session currentSession = entityManager.unwrap(Session.class);
        ComputerPart myPart = currentSession.get(ComputerPart.class, computerPartId);
        currentSession.delete(myPart);
    }
}
