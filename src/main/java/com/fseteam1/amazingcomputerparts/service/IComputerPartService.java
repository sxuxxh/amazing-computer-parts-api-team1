/*
  FSE Cohort - Team Project2
  Amazing Computer Parts Inventory System -Team2
  Class: IComputerPartService - service interface
 */
package com.fseteam1.amazingcomputerparts.service;

import com.fseteam1.amazingcomputerparts.entity.ComputerPart;

import java.util.List;

public interface IComputerPartService {
    List<ComputerPart> findAll();
    ComputerPart findById(int computerPartId);
    void saveOrUpdate(ComputerPart theComputerPart);
    void deleteById(int computerPartId);
}
