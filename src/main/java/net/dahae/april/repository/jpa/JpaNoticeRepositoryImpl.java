package net.dahae.april.repository.jpa;

import java.util.Date;
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
	public List<Notice> findByTitle(String title) throws DataAccessException {
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.title like :title ORDER BY n.id DESC");
		query.setParameter("title", "%"+title+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByContent(String content) throws DataAccessException {
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.content like :content");
		query.setParameter("content", "%"+content+"%");
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByRernm(String rernm) throws DataAccessException {
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.rernm = :rernm");
		query.setParameter("rernm", rernm);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findAll() throws DataAccessException {
		return this.em.createQuery("SELECT n FROM Notice n ORDER BY n.id ASC").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Notice> findByPaging(String title, Integer page) throws DataAccessException {
		
		Query query = this.em.createQuery("SELECT n FROM Notice n where n.title like :title ORDER BY n.id DESC");
		query.setParameter("title", "%"+title+"%");
		query.setFirstResult(BoardPaging.getPageFirstResult(page)).setMaxResults(BoardPaging.PAGE_SIZE);
		
		return query.getResultList();
	}
	
	@Override
	public Notice findById(Long id) throws DataAccessException {
		return this.em.find(Notice.class, id);
	}
	
	@Override
	public void save(Notice notice) throws DataAccessException {
		if (notice.getId() == null) {
			notice.setRdate(new Date());
    		this.em.persist(notice);    		
    	}
    	else {
    		notice.setMdate(new Date());
    		this.em.merge(notice);    
    	}
	}
	
	@Override
	public void delete(Notice notice) throws DataAccessException {
		notice = this.em.merge(notice);
		this.em.remove(notice);
	}
}
