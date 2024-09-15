package me.tuzuku.mp.dynamic.table.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import me.tuzuku.mp.dynamic.table.core.TableNameContext;
import me.tuzuku.mp.dynamic.table.test.entity.Demo;
import me.tuzuku.mp.dynamic.table.test.mapper.DemoMapper;
import me.tuzuku.mp.dynamic.table.test.service.DemoService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {


    @Override
    public Demo getDemoById(Long id) {
        System.out.println(TableNameContext.getContext());
        return lambdaQuery().eq(Demo::getId, id).one();
    }
}
