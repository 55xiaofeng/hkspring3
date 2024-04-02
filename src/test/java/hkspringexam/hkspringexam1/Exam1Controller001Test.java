package hkspringexam.hkspringexam1;
import hkspringexam.hkspringexam1.controller.Exam1Controller001;
import hkspringexam.hkspringexam1.entity.DdAcctMastEntity;
import hkspringexam.hkspringexam1.entity.DepoPrdtMigrateRegEntity;
import hkspringexam.hkspringexam1.service.DdAcctMastService;
import hkspringexam.hkspringexam1.service.DepoPrdtMigrateRegService;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class Exam1Controller001Test {

    @Mock
    private DepoPrdtMigrateRegService depoPrdtMigrateRegService;

    @Mock
    private DdAcctMastService ddAcctMastService;

    @InjectMocks
    private Exam1Controller001 exam1Controller001;

    // 测试selectMigrateInfo方法
    @Test
    void testSelectMigrateInfo() {
        // 准备测试数据
        List<DepoPrdtMigrateRegEntity> expectedList = new ArrayList<>();
        when(depoPrdtMigrateRegService.findAll()).thenReturn(expectedList);

        // 执行方法
        List<DepoPrdtMigrateRegEntity> actualList = exam1Controller001.selectMigrateInfo();

        // 验证结果
        assertEquals(expectedList, actualList, "返回的列表应该与预期的列表相同");
    }

    // 测试selectDdAcctMast方法
    @Test
    void testSelectDdAcctMast() {
        // 准备测试数据
        List<DdAcctMastEntity> expectedList = new ArrayList<>();
        when(ddAcctMastService.findAll()).thenReturn(expectedList);

        // 执行方法
        List<DdAcctMastEntity> actualList = exam1Controller001.selectDdAcctMast();

        // 验证结果
        assertEquals(expectedList, actualList, "返回的列表应该与预期的列表相同");
    }

    // 测试selectddacctmastbyprdtno方法
    @Test
    void testSelectddacctmastbyprdtno() {
        // 准备测试数据
        String prdtNo = "121001";
        List<DdAcctMastEntity> expectedList = new ArrayList<>();
        when(ddAcctMastService.findListByPrdt(prdtNo)).thenReturn(expectedList);

        // 执行方法
        List<DdAcctMastEntity> actualList = exam1Controller001.selectddacctmastbyprdtno(prdtNo);

        // 验证结果
        assertEquals(expectedList, actualList, "返回的列表应该与预期的列表相同");
    }

    // 测试migrateAction方法
    @Test
    @Ignore("暂时忽略事务测试")
    void testMigrateAction() throws Exception {
        // 模拟dd_acct_mast中prdt_no='121001'的记录
        List<DdAcctMastEntity> ddAcctMastEntityList = new ArrayList<>();
        DdAcctMastEntity entity = new DdAcctMastEntity();
        entity.setPrdtNo("121001");
        ddAcctMastEntityList.add(entity);
        when(ddAcctMastService.findListByPrdt("121001")).thenReturn(ddAcctMastEntityList);

        // 模拟depo_prdt_migrate_reg维护记录
        DepoPrdtMigrateRegEntity depoPrdtMigrateRegEntity = new DepoPrdtMigrateRegEntity();
        when(depoPrdtMigrateRegService.addDepoPrdtMigrateReg(any(DepoPrdtMigrateRegEntity.class))).thenReturn(depoPrdtMigrateRegEntity);

        // 执行方法
        String result = exam1Controller001.migrateAction();

        // 验证结果
        assertEquals("migrate action ok", result, "方法返回值应该为'migrate action ok'");
        // 验证ddAcctMastService.updateDdAcctMast方法是否被调用
        verify(ddAcctMastService, times(1)).updateDdAcctMast(any(DdAcctMastEntity.class));
        // 验证depoPrdtMigrateRegService.addDepoPrdtMigrateReg方法是否被调用
        verify(depoPrdtMigrateRegService, times(1)).addDepoPrdtMigrateReg(any(DepoPrdtMigrateRegEntity.class));
    }
}
