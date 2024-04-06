package com.example.demoapplication.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoapplication.service.DataService;

@RestController
public class DataController {
   // private final DataService dataService;

    @Autowired
   // public DataController(DataService dataService) {
        DataService dataService;
    //}

    @GetMapping("/printData")
    public String printData() {
        dataService.printTableData();
        return "Data printed to console.";
    }
}



