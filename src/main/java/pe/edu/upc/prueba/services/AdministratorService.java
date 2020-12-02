package pe.edu.upc.prueba.services;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.prueba.entities.Administrator;
import pe.edu.upc.prueba.entities.PlanMember;

public interface AdministratorService extends CrudService<Administrator, Long> {
    Optional<Administrator> auth(String email, String password) throws Exception;

    Optional<Integer> authToken(String token) throws Exception;
    Optional<List<PlanMember>> getPlanMemberByAdminId(Long id) throws Exception;
    Optional<PlanMember> getPlanMemberById(Long id) throws Exception;
}
