package doa;

import java.util.List;

public interface IComputerPartDAO {
    List<ComputerPart> findAll();
    ComputerPart findById(int thePartId);
    void saveOrUpdate(ComputerPart thePart);
    void deleteById(int thePartId);
}
