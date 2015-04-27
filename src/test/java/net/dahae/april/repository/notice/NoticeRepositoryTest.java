package net.dahae.april.repository.notice;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.repository.NoticeRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 
 * @author yongdae
 */
@ContextConfiguration(locations = {"classpath:spring/business-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ActiveProfiles("jpa")
public class NoticeRepositoryTest {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@PersistenceContext
	EntityManager em;
	
	Notice notice;
	
	SimpleDateFormat simpleFormet = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
	
	@Autowired
	NoticeRepository noticeRepository;
	
	@Before
	public void init() {
		notice = new Notice();
		
		notice.setTitle("Test NoticeTitle");
		notice.setContent("Test NoticeContent");
		notice.setRernm("Tester");
	}
	
	@Test
	public void testFindByTitle() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = null;
		
		/* use to all keyword */
		result = noticeRepository.findByTitle("Test NoticeTitle");
		
		assertThat(result.size(),is(1));
		
		/* use to part keyword */
		result = noticeRepository.findByTitle("Test Notice");
		
		assertThat(result.size(),is(1));
		
		/* use to upper keyword */
		result = noticeRepository.findByTitle("TEST NOTICE");
		
		assertThat(result.size(),is(1));
		
		/* use to lower keyword */
		result = noticeRepository.findByTitle("test notice");
		
		assertThat(result.size(),is(1));
	}
	
	@Test
	public void testFindByContent() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = null;
		
		/* use to all keyword */
		result = noticeRepository.findByContent("Test NoticeContent");
		
		assertThat(result.size(),is(1));
		
		/* use to part keyword */
		result = noticeRepository.findByContent("Test NoticeContent");
		
		assertThat(result.size(),is(1));
		
		/* use to upper keyword */
		result = noticeRepository.findByContent("TEST NOTICECONTENT");
		
		assertThat(result.size(),is(1));
		
		/* use to lower keyword */
		result = noticeRepository.findByContent("test noticecontent");
		
		assertThat(result.size(),is(1));
	}
	
	@Test
	public void testFindByRernm() throws Exception {
		
		noticeRepository.save(notice);
		
		List<Notice> result = null;
		
		/* use to all keyword */
		result = noticeRepository.findByRernm("Tester");
		
		assertThat(result.size(),is(1));
		
		/* use to part keyword */
		result = noticeRepository.findByRernm("Tes");
		
		assertThat(result.size(),is(1));
		
		/* use to upper keyword */
		result = noticeRepository.findByRernm("TESTER");
		
		assertThat(result.size(),is(0));
		
		/* use to lower keyword */
		result = noticeRepository.findByRernm("tester");
		
		assertThat(result.size(),is(0));
	}
	
	@Test
	public void testFindById() throws Exception {
		
		noticeRepository.save(notice);
		
		Notice result = noticeRepository.findById(notice.getId());
		
		assertEquals(result.getId(), notice.getId());
	}
	
	@Test
	public void testFindAll() throws Exception {
		
		List<Notice> initList = noticeRepository.findAll();
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findAll();
		
		assertEquals(initList.size() + 1, result.size());
	}
	
	@Test
	public void testSave() throws Exception {
		
		List<Notice> initList = noticeRepository.findAll();
		
		noticeRepository.save(notice);
		
		List<Notice> result = noticeRepository.findAll();
		
		assertEquals(initList.size() + 1, result.size());
		
		Notice nNotice = noticeRepository.findById(notice.getId());
		
		assertEquals(notice.getId(), nNotice.getId());
		assertNotNull(nNotice.getRdate());
		assertNotNull(nNotice.getMdate());
		assertSame(nNotice, notice);
	}
	
	@Test
	public void testUpdate() throws Exception {
		
		noticeRepository.save(notice);
		
		String title = "Test NoticeTitle Update";
		String content = "Test NoticeContent Update";
		String rdate = null;
		String mdate = null;
		
		Notice nNotice = noticeRepository.findById(notice.getId());
		
		nNotice.setTitle(title);
		nNotice.setContent(content);
		rdate = simpleFormet.format(nNotice.getRdate());
		mdate = simpleFormet.format(nNotice.getMdate());
		
		noticeRepository.save(nNotice);
		
		em.flush();
		
		nNotice = noticeRepository.findById(notice.getId());
		
		assertEquals(notice.getId(), nNotice.getId());
		assertEquals(title, nNotice.getTitle());
		assertEquals(content, nNotice.getContent());
//		assertEquals(rdate, simpleFormet.format(nNotice.getRdate()));
//		assertNotEquals(mdate, simpleFormet.format(nNotice.getMdate()));
//		assertNotSame(notice, nNotice);
	}
	
	@Test
	public void testDelete() throws Exception {
		
		noticeRepository.save(notice);
		
		Notice nNotice = noticeRepository.findById(notice.getId());
		
		assertNotNull(nNotice);
		
		noticeRepository.delete(notice);
		
		nNotice = noticeRepository.findById(notice.getId());
		
		assertNull(nNotice);
	}
}
