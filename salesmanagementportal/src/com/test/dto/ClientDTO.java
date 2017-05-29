package com.test.dto;

public class ClientDTO {
	int clientId;
	String companyName;
	String companyDesc;
	String telephone;
	String fax;
	
	String address;
	String city;
	String state;
	String zip;
	String country;
	String division;
	String industry;
	String website;
	String source;
	
	OpportunityDTO opportunity;
	ProposalDTO proposal;
	Project project;
	int client_type_id;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDesc() {
		return companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public OpportunityDTO getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(OpportunityDTO opportunity) {
		this.opportunity = opportunity;
	}
	public ProposalDTO getProposal() {
		return proposal;
	}
	public void setProposal(ProposalDTO proposal) {
		this.proposal = proposal;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public int getClient_type_id() {
		return client_type_id;
	}
	public void setClient_type_id(int client_type_id) {
		this.client_type_id = client_type_id;
	}
	
	@Override
	public String toString() {
		return "ClientDTO [clientId=" + clientId + ", companyName="
				+ companyName + ", companyDesc=" + companyDesc + ", telephone="
				+ telephone + ", fax=" + fax + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + ", division=" + division
				+ ", industry=" + industry + ", website=" + website
				+ ", source=" + source + ", opportunity=" + opportunity
				+ ", proposal=" + proposal + ", project=" + project
				+ ", client_type_id=" + client_type_id + "]";
	}

}
