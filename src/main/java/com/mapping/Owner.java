package com.mapping;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	@Column (name="owner_id")
   private int ownerId;
   private String ownerName;
   @OneToMany(mappedBy="owner",cascade = CascadeType.ALL)
   private List<Device> devices;
public int getOwnerId() {
	return ownerId;
}
public void setOwnerId(int ownerId) {
	this.ownerId = ownerId;
}
public String getOwnerName() {
	return ownerName;
}
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
public List<Device> getDevices() {
	return devices;
}
public void setDevices(List<Device> devices) {
	this.devices = devices;
}
public Owner(int ownerId, String ownerName, List<Device> devices) {
	super();
	this.ownerId = ownerId;
	this.ownerName = ownerName;
	this.devices = devices;
}
public Owner() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
}
