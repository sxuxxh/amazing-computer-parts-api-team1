/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: ComputerPartController - controller for HTTP end points
 */
package com.fseteam1.amazingcomputerparts.controller;


import com.fseteam1.amazingcomputerparts.entity.ComputerPart;
import com.fseteam1.amazingcomputerparts.service.IComputerPartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/amazingcomputerparts/api/v1")
public class ComputerPartController {

    private final IComputerPartService computerPartService;

    //Constructor Injection
    @Autowired
    public ComputerPartController(@Qualifier("computerPartServiceIMPL")IComputerPartService computerPartService) {
        this.computerPartService = computerPartService;
    }

    //Get read all request
    //http://localhost:8080/amazingcomputerparts/api/v1/retrieveAllComputerParts
    @GetMapping("retrieveAllComputerParts")
    public List<ComputerPart> findAll() {
        return computerPartService.findAll();
    }

    //read a computer part request
    //http://localhost:8080/amazingcomputerparts/api/v1/retrieveAComputerPart/1
    @GetMapping("retrieveAComputerPart/{computerPartId}")
    public ComputerPart findById(@PathVariable int computerPartId){
        return computerPartService.findById(computerPartId);
    }

    //This is a POST request to add a computer part
    //http://localhost:8080/amazingcomputerparts/api/v1/addAComputerPart
    @PostMapping("/addAComputerPart")
    public ComputerPart addAComputerPart(@RequestBody ComputerPart theComputerPart) {
        theComputerPart.setComputerPartId(0);
        computerPartService.saveOrUpdate(theComputerPart);
        return theComputerPart;
    }

    //This is a PUT request to update a existing computer part
    //http://localhost:8080/amazingcomputerparts/api/v1/updateAComputerPart
    @PutMapping("/updateAComputerPart")
    public ComputerPart updateAComputerPart(@RequestBody ComputerPart updateAComputerPart){
        computerPartService.saveOrUpdate(updateAComputerPart);
        return updateAComputerPart;
    }

    //This is a DELETE request to delete a computer part
    //http://localhost:8080/amazingcomputerparts/api/v1/deleteAComputerPart/1
    @DeleteMapping("/deleteAComputerPart/{computerPartId}")
    public String deleteAComputerPart(@PathVariable int computerPartId) {
        computerPartService.deleteById(computerPartId);
        return "Deleted Computer Part ID: " + computerPartId;
    }
}
