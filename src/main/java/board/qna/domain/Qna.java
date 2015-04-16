package board.qna.domain;

import java.io.Serializable;
import java.util.Date;

public class Qna implements Serializable
{
	private static final long serialVersionUID = 6277759750586353968L;

	/**
	 * 번호
	 */
	private int seq;
	
	/**
	 * 질문 내용(question content)
	 */
	private String qcontent;
	
	/**
	 * 질문 일시(question date)
	 */
	private Date qdate;
	
	/**
	 * 질문자 ID(questioner id)
	 */
	private String qerid;

	/**
	 * 답변 내용(answer content)
	 */
	private String acontent;

	/**
	 * 답변 일시(answer date)
	 */
	private Date adate;
	
	/**
	 * 답변자 ID(answerer id)
	 */
	private String aerid;
	
	/**
	 * 응답 시간(response time)
	 */
	private int rtime;
	
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public Date getQdate() {
		return qdate;
	}

	public void setQdate(Date qdate) {
		this.qdate = qdate;
	}

	public String getAerid() {
		return aerid;
	}

	public void setAerid(String aid) {
		this.aerid = aid;
	}

	public String getQerid() {
		return qerid;
	}

	public void setQerid(String qerid) {
		this.qerid = qerid;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}
	
	public int getRtime() {
		return rtime;
	}

	public void setRtime(int turnaroundTime) {
		this.rtime = turnaroundTime;
	}

	public boolean isAnswer() {
		return String.valueOf(acontent).isEmpty() ? false : true;
	}
}
