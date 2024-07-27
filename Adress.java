package sample.sample_project;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="student_address")
public class Adress {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="adress_id")
	public int addId;
    
    @Column(length=50,name="Street")
	public String street;
	public String city;
	
	private double x;
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date added;
	@Column(name="img", columnDefinition="LONGBLOB")
	private byte [] img;
	public Adress() {
		super();
	}
	public Adress(int addId, String street, String city, double x, Date added, byte[] img) {
		super();
		this.addId = addId;
		this.street = street;
		this.city = city;
		this.x = x;
		this.added = added;
		this.img = img;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAdded() {
		return added;
	}
	public void setAdded(Date added) {
		this.added = added;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	
}
