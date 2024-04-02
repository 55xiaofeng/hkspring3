package hkspringexam.hkspringexam1.service;

import hkspringexam.hkspringexam1.entity.DepoPrdtMigrateRegEntity;
import hkspringexam.hkspringexam1.repository.DepoPrdtMigrateRegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

@Service
public class DepoPrdtMigrateRegService {

    @Autowired
    private DepoPrdtMigrateRegRepository depoPrdtMigrateRegRepository;

    @Resource
    private EntityManager entityManager;

    public List<DepoPrdtMigrateRegEntity> findAll() {

        return depoPrdtMigrateRegRepository.findAll();
    }
    public DepoPrdtMigrateRegEntity addDepoPrdtMigrateReg(DepoPrdtMigrateRegEntity depoPrdtMigrateRegEntity) {
        return depoPrdtMigrateRegRepository.save(depoPrdtMigrateRegEntity);
    }

    public DepoPrdtMigrateRegEntity updateDepoPrdtMigrateReg(DepoPrdtMigrateRegEntity depoPrdtMigrateRegEntity) {
        return depoPrdtMigrateRegRepository.save(depoPrdtMigrateRegEntity);
    }

}
