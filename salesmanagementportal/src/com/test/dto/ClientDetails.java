package com.test.dto;

import java.util.ArrayList;

public class ClientDetails {
	ClientDTO client;
	ArrayList<AnnouncementDTO> announcements;
	
	public ClientDTO getClient() {
		return client;
	}
	public void setClient(ClientDTO client) {
		this.client = client;
	}
	public ArrayList<AnnouncementDTO> getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(ArrayList<AnnouncementDTO> announcements) {
		this.announcements = announcements;
	}
	
}
