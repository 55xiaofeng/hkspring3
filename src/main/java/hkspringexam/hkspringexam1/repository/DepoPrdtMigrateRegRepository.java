package hkspringexam.hkspringexam1.repository;

import hkspringexam.hkspringexam1.entity.DepoPrdtMigrateRegEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepoPrdtMigrateRegRepository extends JpaRepository<DepoPrdtMigrateRegEntity, Integer> {


}
