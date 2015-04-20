package net.dahae.april.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BoardBaseEntity extends BaseEntity implements Serializable {
	/**
	 * ID (I)
	 */
	@Id
	@GeneratedValue
	private int id;
	
	/**
	 * 등록 일시 (register date)
	 */
	private Date rdate;
	
	/**
	 * 등록자 아이디 (registerer id)
	 */
	private String rerid;
	
	/**
	 * 등록자 이름 (registerer name)
	 */
	private String rernm;
	
	/**
	 * 수정 일시 (modify date)
	 */
	private Date mdate;
	
	/**
	 * 수정자 아이디 (modifier id)
	 */
	private String merid;
	
	/**
	 * 수정자 이름(modifier name)
	 */
	private String mernm;
	
	public int getId() {
		return id;
	}

	public void setId(int seq) {
		this.id = seq;
	}

	public Date getRdate() {
		return rdate;
	}

	public void setRdate(Date wdate) {
		this.rdate = wdate;
	}

	public String getRerid() {
		return rerid;
	}

	public void setRerid(String wid) {
		this.rerid = wid;
	}

	public String getRernm() {
		return rernm;
	}

	public void setRernm(String wnm) {
		this.rernm = wnm;
	}

	public Date getMdate() {
		return mdate;
	}

	public void setMdate(Date edate) {
		this.mdate = edate;
	}

	public String getMerid() {
		return merid;
	}

	public void setMerid(String eid) {
		this.merid = eid;
	}

	public String getMernm() {
		return mernm;
	}

	public void setMernm(String enm) {
		this.mernm = enm;
	}
}
