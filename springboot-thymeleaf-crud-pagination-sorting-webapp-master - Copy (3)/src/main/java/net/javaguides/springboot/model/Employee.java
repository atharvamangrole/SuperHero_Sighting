package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long Id;
	
	@Column(name = "supname")
	private String supname;
	
	@Column(name = "suporg")
	private String suporg;
	
	@Column(name = "suppower")
	private String suppower;
	
	@Column(name = "lastloc")
	private String lastloc;
	
	public long getId() {
		return Id;
	}
	public void setId(long Id) {
		this.Id = Id;
	}
	public String getSupname() {
		return supname;
	}
	public void setSupname(String supname) {
		this.supname = supname;
	}
	public String getSuporg() {
		return suporg;
	}
	public void setSuporg(String suporg) {
		this.suporg = suporg;
	}
	public String getSuppower() {
		return suppower;
	}
	public void setSuppower(String suppower) {
		this.suppower = suppower;
	}
	public String getLastloc() {
		return lastloc;
	}
	public void setLastloc(String lastloc) {
		this.lastloc = lastloc;
	}
}
