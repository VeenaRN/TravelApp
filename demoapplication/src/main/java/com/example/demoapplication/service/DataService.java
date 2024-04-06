package com.example.demoapplication.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DataService {

    private static final Logger logger = LoggerFactory.getLogger(DataService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void printTableData() {
        String sql = "SELECT * FROM vehicles";
        try {
            jdbcTemplate.query(sql, (rs, rowNum) -> {
                System.out.println("vid: " + rs.getInt("vid"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Number: " + rs.getInt("number"));
                System.out.println("Owner name: " + rs.getString("ownname"));
                System.out.println("seating: " + rs.getInt("seating"));
                
                return null;
            });
        } catch (Exception e) {
            logger.error("Error printing table data", e);
        }
    }
}
