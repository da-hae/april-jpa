package net.dahae.april.model.notice;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
//@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ActiveProfiles("jpa")
public class NoticeTest {

	@PersistenceContext
	EntityManager em;
	
	Notice notice;
	
	@Before
	public void init() {
		notice = new Notice();
		
		notice.setTitle("제목");
		notice.setContent("내용");
	}

//	@Test
//	@Rollback(value = false)
//	public void testPersist() throws Exception {
//		em.persist(notice);
//		
//		Query query = em.createQuery("select n from Notice n");
//		List<Notice> Notices = (List<Notice>)query.getResultList();
//		
//		assertThat(Notices.size(), is(1));
//	}
	
//	@Test
	@Rollback(value = false)
	public void testPersistEquals() throws Exception {
		
		em.persist(notice);
		
		Query query = em.createQuery("select n from Notice n");
		Notice iNotice = (Notice) query.getSingleResult();
		
		assertSame(notice , iNotice);
	}
	
}
