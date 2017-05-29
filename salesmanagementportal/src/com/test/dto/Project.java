package com.test.dto;

public class Project {
	int projectId;
	int clientId;
	String projectName;
	String projectMgr;
	String addedDate;
	double projectAmount;
	double totalRevenue;
	String projectDuration;
	String projectStatus;
	String launchDate;
	String contactName;
	String contactTel;
	String projectDesc;
	String projectNotes;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectMgr() {
		return projectMgr;
	}
	public void setProjectMgr(String projectMgr) {
		this.projectMgr = projectMgr;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	public double getProjectAmount() {
		return projectAmount;
	}
	public void setProjectAmount(double projectAmount) {
		this.projectAmount = projectAmount;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	public String getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(String projectDuration) {
		this.projectDuration = projectDuration;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public String getProjectNotes() {
		return projectNotes;
	}
	public void setProjectNotes(String projectNotes) {
		this.projectNotes = projectNotes;
	}
}
