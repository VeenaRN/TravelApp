package com.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.model.Batch;
import com.util.DBConnection;

	public class BatchDAO {
	    private static final String INSERT_BATCH = "INSERT INTO batches (name) VALUES (?)";

	    public void addBatch(Batch batch) throws SQLException {
	        try (Connection connection = DBConnection.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BATCH)) {
	            preparedStatement.setString(1, batch.getName());
	            preparedStatement.executeUpdate();
	        }
	    }
	    // Implement Read, Update, and Delete operations similarly
	}



