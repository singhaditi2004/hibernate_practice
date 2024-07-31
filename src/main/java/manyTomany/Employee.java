package manyTomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eId;
	private String name;
	private String tech;
	@ManyToMany
	@JoinTable(name =
	"emplearn",joinColumns = {@JoinColumn(name="eid")},inverseJoinColumns= {@JoinColumn
	(name="pid")})
	private List<Project> proList;
	public Employee(int eId, String name, String tech, List<Project> proList) {
		super();
		this.eId = eId;
		this.name = name;
		this.tech = tech;
		this.proList = proList;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public List<Project> getProList() {
		return proList;
	}
	public void setProList(List<Project> proList) {
		this.proList = proList;
	}

}
