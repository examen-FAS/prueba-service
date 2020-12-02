package pe.edu.upc.prueba.services;

import java.util.List;

import pe.edu.upc.prueba.entities.CondominiumRule;

public interface CondominiumRuleService extends CrudService<CondominiumRule, Long> {
    List<CondominiumRule> findAllByCoddominium(Long condominiumId);
}
