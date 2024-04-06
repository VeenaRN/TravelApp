package com.model;

import java.util.List;

public class Batch {
	
	 private int id;
	    private String name;
	    private List<Participant> participants;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Participant> getParticipants() {
			return participants;
		}
		public void setParticipants(List<Participant> participants) {
			this.participants = participants;
		}
		public Batch(int id, String name, List<Participant> participants) {
			super();
			this.id = id;
			this.name = name;
			this.participants = participants;
		}
		

}
