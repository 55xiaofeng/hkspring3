package hkspringexam.hkspringexam1.service;

import hkspringexam.hkspringexam1.entity.DdAcctMastEntity;
import hkspringexam.hkspringexam1.repository.DdAcctMastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import java.util.List;

@Service
public class DdAcctMastService {

    @Autowired
    private DdAcctMastRepository ddAcctMastRepository;

    @Resource
    private EntityManager entityManager;

    public List<DdAcctMastEntity> findAll() {
        return ddAcctMastRepository.findAll();
    }
    public DdAcctMastEntity addDdAcctMast(DdAcctMastEntity ddAcctMastEntity) {
        return ddAcctMastRepository.save(ddAcctMastEntity);
    }
    public DdAcctMastEntity updateDdAcctMast(DdAcctMastEntity ddAcctMastEntity) {
        return ddAcctMastRepository.save(ddAcctMastEntity);
    }

    public List<DdAcctMastEntity> findListByPrdt(String prdtNo) {
        return ddAcctMastRepository.findListByPrdt(prdtNo);
    }

}
