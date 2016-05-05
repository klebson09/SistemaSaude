
package com.model.ejb;

import model.Pessoa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
/**
 *
 * @author klebsonsantana
 */
public class PessoaDAO {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest: 
    public void persist(Pessoa pessoa) {
        em.persist(pessoa);
    }
 
    // Retrieves all the guests:
    public List<Pessoa> getAllGuests() {
        TypedQuery<Pessoa> query = em.createQuery(
            "SELECT g FROM Guest g ORDER BY g.id", Pessoa.class);
        return query.getResultList();
    }

    
    
    
}