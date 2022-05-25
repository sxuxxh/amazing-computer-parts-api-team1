/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team1
  Class: IComputerPartDAO - data layer interface
 */
package com.fseteam1.amazingcomputerparts.dao;

import com.fseteam1.amazingcomputerparts.entity.ComputerPart;

import java.util.List;

public interface IComputerPartDAO {
    List<ComputerPart> findAll();
    ComputerPart findById(int thePartId);
    void saveOrUpdate(ComputerPart thePart);
    void deleteById(int thePartId);
}
