package pe.edu.upc.prueba.services;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.prueba.entities.ResidentDepartment;

public interface ResidentDepartmentService extends CrudService<ResidentDepartment, Long> {
    Optional<List<ResidentDepartment>> findAllByResidentId(Long residentId);

    void deleteAllByCondominiumId(Long condominiumId);

    List<ResidentDepartment> findAllByDepartment(Long departmentId);

    List<ResidentDepartment> findAllByCondominium(Long condominiumId);
}
