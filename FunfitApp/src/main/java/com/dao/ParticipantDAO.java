package com.dao;


	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.model.Participant;
import com.util.DBConnection;

	public class ParticipantDAO {
	    private static final String INSERT_PARTICIPANT = "INSERT INTO participants (name, email) VALUES (?, ?)";

	    public void addParticipant(Participant participant) throws SQLException {
	        try (Connection connection = DBConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PARTICIPANT)) {
	            preparedStatement.setString(1, participant.getName());
	            preparedStatement.setString(2, participant.getEmail());
	            preparedStatement.executeUpdate();
	        }
	    }
	    // Implement Read, Update, and Delete operations similarly
	}



