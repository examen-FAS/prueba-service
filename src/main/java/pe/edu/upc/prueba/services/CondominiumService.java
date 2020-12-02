package pe.edu.upc.prueba.services;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.prueba.entities.Condominium;

public interface CondominiumService extends CrudService<Condominium, Long> {
    Optional<List<Condominium>> getCondominiumByAdmin(Long adminId);
}
