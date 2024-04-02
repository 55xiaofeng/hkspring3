package hkspringexam.hkspringexam1.controller;

import hkspringexam.hkspringexam1.entity.DdAcctMastEntity;
import hkspringexam.hkspringexam1.entity.DepoPrdtMigrateRegEntity;
import hkspringexam.hkspringexam1.service.DdAcctMastService;
import hkspringexam.hkspringexam1.service.DepoPrdtMigrateRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class Exam1Controller001 {

    @Autowired
    DepoPrdtMigrateRegService depoPrdtMigrateRegService;

    @Autowired
    DdAcctMastService ddAcctMastService;

    @GetMapping("/selectmigrateinfo")
    public List<DepoPrdtMigrateRegEntity> selectMigrateInfo(){

        return depoPrdtMigrateRegService.findAll();
    }
    @GetMapping("/selectddacctmast")
    public List<DdAcctMastEntity> selectDdAcctMast(){

        return ddAcctMastService.findAll();
    }

    @GetMapping("/selectddacctmastbyprdtno")
    public List<DdAcctMastEntity> selectddacctmastbyprdtno(@RequestParam(value = "prdtNo") String prdtNo){

        return ddAcctMastService.findListByPrdt(prdtNo);
    }
    @Transactional(rollbackFor = Exception.class)
    @GetMapping("/migrateaction")
    public String migrateAction() throws Exception {

        /***1、循环修改dd_acct_mast中prdt_no='121001'记录的opn_br_no*00001**/
        List<DdAcctMastEntity> ddAcctMastEntityList = ddAcctMastService.findListByPrdt("121001");
        for(DdAcctMastEntity item : ddAcctMastEntityList){
            item.setOpnBrNo("00001");
            ddAcctMastService.updateDdAcctMast(item);
        }

        /***2、添加depo_prdt_migrate_reg维护记录*00006**/
        DepoPrdtMigrateRegEntity depoPrdtMigrateRegEntity = new DepoPrdtMigrateRegEntity();
        depoPrdtMigrateRegEntity.setLegalEntity("001");
        depoPrdtMigrateRegEntity.setPrdtNo("121001");
        depoPrdtMigrateRegEntity.setPrdtModuleCode("pkg");
        depoPrdtMigrateRegEntity.setOutBrNo("00001");
        depoPrdtMigrateRegEntity.setInBrNo("00006");
        depoPrdtMigrateRegEntity.setIsEffective("Y");
        depoPrdtMigrateRegEntity.setTellerNo("FYB");
        depoPrdtMigrateRegEntity.setCheckerNo("FYB");
        depoPrdtMigrateRegEntity.setAutherNo("FYB");
        depoPrdtMigrateRegEntity.setUpdTime(new Timestamp((new Date()).getTime()));
        depoPrdtMigrateRegEntity.setMac("Mac");
        depoPrdtMigrateRegEntity.setVpdEntity(BigInteger.valueOf(1));
        depoPrdtMigrateRegService.addDepoPrdtMigrateReg(depoPrdtMigrateRegEntity);
//        if(true ){
//            throw new Exception("检测事务是否好用");
//        }

        return "migrate action ok";
    }

}
