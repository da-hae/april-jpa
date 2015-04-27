package net.dahae.april.model.notice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import net.dahae.april.model.BoardBaseEntity;

@Entity
public class Notice extends BoardBaseEntity {
	
	private static final long serialVersionUID = -5297636336544431765L;
	
	/**
	 * 제목 (title)
	 */
	@NotEmpty
	@Length(max = 125)
	@Column(length = 125)
	private String title;
	
	/**
	 * 내용 (content)
	 */
	@NotEmpty
	@Lob
	private String content;
	
	/**
	 * 조회수 (hits)
	 */
	private int hits;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}
}
