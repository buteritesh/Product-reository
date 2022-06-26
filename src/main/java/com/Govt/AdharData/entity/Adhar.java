package com.Govt.AdharData.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="adhar")
public class Adhar {
	
	@Id
	@NotEmpty
	@Size(min=12,max=12,message="Adhar id should be 12 digit")
	private String uid;
	@NotEmpty(message="Please Enter the name")
	private String name;
	@Size(min=12,max=12,message="Mobno should be ten digits")
	private String mobno;
	@Email
	private String emailid;
	public Adhar() {
		super();
	}
	public Adhar( String uid, String name, String mobno, String emailid) {
		super();
		this.uid = uid;
		this.name = name;
		this.mobno = mobno;
		this.emailid = emailid;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "AdharDetails [ uid=" + uid + ", name=" + name + ", mobno=" + mobno + ", emailid="
				+ emailid + "]";
	}
	
	

}
