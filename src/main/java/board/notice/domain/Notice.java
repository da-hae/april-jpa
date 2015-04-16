package board.notice.domain;

import board.domain.BoardBaseEntity;

public class Notice extends BoardBaseEntity
{
	private static final long serialVersionUID = -5297636336544431765L;

	/**
	 * 제목 (title>
	 */
	private String title;
	
	/**
	 * 내용 (content)
	 */
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
