package hkspringexam.hkspringexam1;

import hkspringexam.hkspringexam1.entity.DepoPrdtMigrateRegEntity;
import hkspringexam.hkspringexam1.service.DepoPrdtMigrateRegService;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
@Sql(scripts = "classpath:db-setup.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
public class DepoPrdtMigrateRegServiceTest {

    @Autowired
    private DepoPrdtMigrateRegService depoPrdtMigrateRegService;

    // 测试findAll方法
    @Test
//    @Sql(scripts = "classpath:insert-test-data.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    public void testFindAll() {
        // 插入测试数据
        // Test data is inserted before the test method is executed
        List<DepoPrdtMigrateRegEntity> resultList = depoPrdtMigrateRegService.findAll();
        assertNotNull(resultList, "查询结果不应为空");
        assertFalse(resultList.isEmpty(), "查询结果列表不应为空");
        // 测试数据的数量
        assertEquals(1, resultList.size(), "查询结果的数量应与预期相符");
    }

    // 测试addDepoPrdtMigrateReg方法
    @Test
    public void testAddDepoPrdtMigrateReg() {
        // 创建一个新的实体对象
        DepoPrdtMigrateRegEntity newEntity = new DepoPrdtMigrateRegEntity();
        // 设置实体对象的属性
        // Set the properties of the entity object
        // ... 设置属性 ...

        // 调用添加方法
        DepoPrdtMigrateRegEntity savedEntity = depoPrdtMigrateRegService.addDepoPrdtMigrateReg(newEntity);
        assertNotNull(savedEntity, "添加的实体不应为空");
//        assertNotNull(savedEntity.getId(), "添加的实体应有ID");
        // 检查实体是否正确保存到数据库
        // Check if the entity is correctly saved to the database
        // ... 进行数据库验证 ...
    }

    // 测试updateDepoPrdtMigrateReg方法
    @Test
    @Sql(scripts = "classpath:insert-test-data.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    public void testUpdateDepoPrdtMigrateReg() {
        // 获取一个已有的实体对象
        DepoPrdtMigrateRegEntity existingEntity = depoPrdtMigrateRegService.findAll().get(0);
        assertNotNull(existingEntity, "应该获取到一个已有的实体对象");

        // 修改实体对象的属性
        // Modify the properties of the entity object
        // ... 修改属性 ...

        // 调用更新方法
        DepoPrdtMigrateRegEntity updatedEntity = depoPrdtMigrateRegService.updateDepoPrdtMigrateReg(existingEntity);
        assertNotNull(updatedEntity, "更新后的实体不应为空");
        // 检查更新是否成功
        // Check if the update is successful
        // ... 进行数据库验证 ...
    }

    // 使用@Ignore注解来标记尚未实现的测试方法
    @Ignore("此测试方法尚未实现")
    @Test
    public void testSomeOtherMethod() {
        // 测试其他方法
    }
}
