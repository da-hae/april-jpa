package net.dahae.april.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import javax.transaction.Transactional;

import net.dahae.april.model.notice.Notice;
import net.dahae.april.service.notice.NoticeService;

import org.junit.Test;
import org.junit.runner.RunWith;
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
public class NoticeServiceTest {

	@Autowired
	NoticeService noticeService;
	
	@Test
	public void testFindAll() throws Exception {
		
		List<Notice> noticeList = noticeService.findAll();
		
		assertThat(noticeList.size(),is(0));
	}
	
}
