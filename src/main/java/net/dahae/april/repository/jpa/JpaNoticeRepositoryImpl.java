package net.dahae.april.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class JpaNoticeRepositoryImpl implements NoticeRepository {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Notice> findByTitle(String title) throws DataAccessException {
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.title= :title");
		query.setParameter("title", title);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Notice> findByContent(String content) throws DataAccessException {
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.content= :content");
		query.setParameter("content", content);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Notice> findByRernm(String rernm) throws DataAccessException {
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.rernm= :rernm");
		query.setParameter("rernm", rernm);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Notice> findAll() throws DataAccessException {
		return this.em.createQuery("SELECT n FROM Notice n ORDER BY n.id").getResultList();
	}

	public Notice findById(int id) throws DataAccessException {
		
		/**
		 * example 1
		 */
//		Query query = this.em.createQuery("SELECT n FROM Notice n where n.id= :id");
//		query.setParameter("id", id);
//		return (Notice)query.getSingleResult();
		
		/**
		 * example 2
		 */
		return this.em.find(Notice.class, id);
	}

	public void save(Notice notice) throws DataAccessException {
		if (notice.getId() == 0) {
    		this.em.persist(notice);     		
    	}
    	else {
    		this.em.merge(notice);    
    	}
	}

	public void delete(Notice notice) throws DataAccessException {
		this.em.remove(notice);
	}

}
