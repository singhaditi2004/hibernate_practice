package manyTomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Column (name="project_name")
	private String pName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	@ManyToMany
	@JoinTable (name="emp_pro")
	private List<Employee> empList;
	public Project(String pName, int pId, List<Employee> empList) {
		super();
		this.pName = pName;
		this.pId = pId;
		this.empList = empList;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
}
