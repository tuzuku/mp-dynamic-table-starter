package me.tuzuku.mp.dynamic.table.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.tuzuku.mp.dynamic.table.test.entity.Demo;

public interface DemoService extends IService<Demo> {

    Demo getDemoById(Long id);
}
