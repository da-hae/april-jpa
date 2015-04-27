package net.dahae.april.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.dahae.april.model.BoardPaging;
import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/**
 * 
 * @author yongdae
 */
@Service
public class JpaNoticeRepositoryImpl implements NoticeRepository {
	
	

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByTitle(String param) throws DataAccessException {
		Query query = em.createQuery("SELECT n FROM Notice n where upper(n.title) like :title ORDER BY n.id DESC");
		
		param = param.toUpperCase();
		query.setParameter("title", "%" + param + "%");
		
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByContent(String param) throws DataAccessException {
		Query query = em.createQuery("SELECT n FROM Notice n where upper(n.content) like :content");
		
		param = param.toUpperCase();
		query.setParameter("content", "%" + param + "%");
		
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByRernm(String param) throws DataAccessException {
		Query query = em.createQuery("SELECT n FROM Notice n where n.rernm like :rernm");
		query.setParameter("rernm", "%" + param + "%");
		
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findAll() throws DataAccessException {
		return em.createQuery("SELECT n FROM Notice n ORDER BY n.id ASC").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByPaging(String param, Integer page) throws DataAccessException {
		Query query = em.createQuery("SELECT n FROM Notice n where n.title like :title ORDER BY n.id DESC");
		
		param = param.toUpperCase();
		query.setParameter("title", "%"+param+"%");
		
		query.setFirstResult(BoardPaging.getPageFirstResult(page)).setMaxResults(BoardPaging.PAGE_SIZE);
		
		return query.getResultList();
	}
	
	@Override
	public Notice findById(Long id) throws DataAccessException {
		return em.find(Notice.class, id);
	}
	
	@Override
	public void save(Notice notice) throws DataAccessException {
		if (notice.getId() == null){
			em.persist(notice);
		}
		else{
			em.merge(notice);
		}
	}
	
	@Override
	public void delete(Notice notice) throws DataAccessException {
		notice = findById(notice.getId());
		em.remove(notice);
	}
}
