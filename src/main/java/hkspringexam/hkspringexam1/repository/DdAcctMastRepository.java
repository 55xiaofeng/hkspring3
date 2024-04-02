package hkspringexam.hkspringexam1.repository;

import hkspringexam.hkspringexam1.entity.DdAcctMastEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DdAcctMastRepository extends JpaRepository<DdAcctMastEntity, Integer> {

    @Query("select b from dd_acct_mast b where b.prdtNo=?1")
    List<DdAcctMastEntity> findListByPrdt(String prdtNo);


}
