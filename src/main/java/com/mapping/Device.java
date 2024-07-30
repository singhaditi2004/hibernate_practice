package com.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Device {
	@Id
	@Column (name="device_id")
	private int deviceId;

    @Column(name = "deviceName")
	private String deviceName;
	@ManyToOne
	 @JoinColumn(name = "owner_id")
	private Owner owner;
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Device(int deviceId, String deviceName, Owner owner) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.owner = owner;
	}
	
}
