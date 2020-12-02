package pe.edu.upc.prueba.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.prueba.entities.CondominiumRule;
import pe.edu.upc.prueba.repositories.CondominiumRuleRepository;
import pe.edu.upc.prueba.services.CondominiumRuleService;

import java.util.List;
import java.util.Optional;

@Service
public class CondominiumRuleServiceImpl implements CondominiumRuleService {

    @Autowired
    CondominiumRuleRepository condominiumRuleRepository;

    @Override
    public CondominiumRule save(CondominiumRule entity) throws Exception {
        return condominiumRuleRepository.save(entity);
    }

    @Override
    public List<CondominiumRule> findAll() throws Exception {
        return condominiumRuleRepository.findAll();
    }

    @Override
    public Optional<CondominiumRule> findById(Long aLong) throws Exception {
        return condominiumRuleRepository.findById(aLong);
    }

    @Override
    public CondominiumRule update(CondominiumRule entity) throws Exception {
        return condominiumRuleRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        condominiumRuleRepository.deleteById(aLong);
    }

    @Override
    public List<CondominiumRule> findAllByCoddominium(Long condominiumId) {
        return condominiumRuleRepository.getRulesByCondominium(condominiumId);
    }
}
