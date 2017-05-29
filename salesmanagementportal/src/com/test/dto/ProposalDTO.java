package com.test.dto;

public class ProposalDTO {
	int proposalId;
	String proposalName;
	String accountMgr;
	String addedDate;
	String chanceToClose;
	double estimatedBudget;
	String proposalDuration;
	double proposalAmount;
	double totalRevenue;
	String proposalStatus;
	String rejectionReason;
	String contactName;
	String contactTel;
	String proposalDesc;
	String proposalNotes;
	int clientId;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getProposalId() {
		return proposalId;
	}
	public void setProposalId(int proposalId) {
		this.proposalId = proposalId;
	}
	public String getProposalName() {
		return proposalName;
	}
	public void setProposalName(String proposalName) {
		this.proposalName = proposalName;
	}
	public String getAccountMgr() {
		return accountMgr;
	}
	public void setAccountMgr(String accountMgr) {
		this.accountMgr = accountMgr;
	}
	public String getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}
	public String getChanceToClose() {
		return chanceToClose;
	}
	public void setChanceToClose(String chanceToClose) {
		this.chanceToClose = chanceToClose;
	}
	public double getEstimatedBudget() {
		return estimatedBudget;
	}
	public void setEstimatedBudget(double estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}
	public String getProposalDuration() {
		return proposalDuration;
	}
	public void setProposalDuration(String proposalDuration) {
		this.proposalDuration = proposalDuration;
	}
	public double getProposalAmount() {
		return proposalAmount;
	}
	public void setProposalAmount(double proposalAmount) {
		this.proposalAmount = proposalAmount;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	public String getProposalStatus() {
		return proposalStatus;
	}
	public void setProposalStatus(String proposalStatus) {
		this.proposalStatus = proposalStatus;
	}
	public String getRejectionReason() {
		return rejectionReason;
	}
	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
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
	public String getProposalDesc() {
		return proposalDesc;
	}
	public void setProposalDesc(String proposalDesc) {
		this.proposalDesc = proposalDesc;
	}
	public String getProposalNotes() {
		return proposalNotes;
	}
	public void setProposalNotes(String proposalNotes) {
		this.proposalNotes = proposalNotes;
	}
}
