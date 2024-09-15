package me.tuzuku.mp.dynamic.table.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.tuzuku.mp.dynamic.table.test.entity.Demo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
}
