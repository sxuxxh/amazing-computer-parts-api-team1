package doa;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

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
        Query<ComputerPart> myQuery = currentSession.createQuery("from ComputerPart");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public ComputerPart findById(int thePartId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(ComputerPart.class, theId);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void saveOrUpdate(ComputerPart thePart) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(thePart);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void deleteById(int thePartId) {
        Session currentSession = entityManager.unwrap(Session.class);
        ComputerPart myPart = currentSession.get(ComputerPart.class, thePartId);
        currentSession.delete(myPart);
    }
}
