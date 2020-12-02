package pe.edu.upc.prueba.services;

import java.util.Optional;

import pe.edu.upc.prueba.entities.Resident;

public interface ResidentService extends CrudService<Resident, Long> {
    Optional<Resident> auth(String email, String password);
    Optional<Integer> authToken(String token);
}
