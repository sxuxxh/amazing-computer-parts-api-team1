/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team2
  Class: ComputerPartServiceIMPL - service implementation
 */

package com.fseteam1.amazingcomputerparts.service;

import com.fseteam1.amazingcomputerparts.dao.IComputerPartDAO;
import com.fseteam1.amazingcomputerparts.entity.ComputerPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerPartServiceIMPL implements IComputerPartService{
    // Injecting the computer part dao layer
    private final IComputerPartDAO computerPartDAO;

    @Autowired
    public ComputerPartServiceIMPL(@Qualifier("computerPartDAOIMPL") IComputerPartDAO computerPartDAO) {
        this.computerPartDAO = computerPartDAO;
    }

    @Override
    public List<ComputerPart> findAll() {
        return computerPartDAO.findAll();
    }

    @Override
    public ComputerPart findById(int computerPartId) {
        return computerPartDAO.findById(computerPartId);
    }

    @Override
    public void saveOrUpdate(ComputerPart theComputerPart) {
        computerPartDAO.saveOrUpdate(theComputerPart);
    }

    @Override
    public void deleteById(int computerPartId) {
        computerPartDAO.deleteById(computerPartId);
    }
}
