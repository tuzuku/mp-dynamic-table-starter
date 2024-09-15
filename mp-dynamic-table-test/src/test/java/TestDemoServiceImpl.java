import me.tuzuku.mp.dynamic.table.core.TableNameContext;
import me.tuzuku.mp.dynamic.table.test.MpSplitStarterApplication;
import me.tuzuku.mp.dynamic.table.test.entity.Demo;
import me.tuzuku.mp.dynamic.table.test.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = MpSplitStarterApplication.class)
public class TestDemoServiceImpl {

    @Autowired
    private DemoService demoService;

    @Test
    void testGetById() {

        TableNameContext.setContext("2024");
        Demo demoById = demoService.getDemoById(1L);
        System.out.println(demoById);
    }


}
