package pl.fantasypredictor.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepositoryImpl implements UserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    //custom methods

    @Override
    public void customMethod() {

    }

}
