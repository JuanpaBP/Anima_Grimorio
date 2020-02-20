package springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import springboot.app.models.entity.Hechizo;

@Repository
public class HechizoDaoImpl implements IHechizoDao{

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Hechizo> findAll() {
		return em.createQuery("from Hechizos").getResultList();
	}
}
