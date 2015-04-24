package net.dahae.april.model;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(value = {RegisterAndModifyEntityListener.class})
public class BoardBaseEntity extends BaseEntity implements RegisterAndModifyEntity{
	/**
	 * ID (I)
	 */
	@Id
	@GeneratedValue
	private Long id;

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
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public Date getRdate() {
		return rdate;
	}
	
	@Override
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
	
	@Override
	public Date getMdate() {
		return mdate;
	}
	
	@Override
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
