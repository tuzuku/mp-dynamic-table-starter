package me.tuzuku.mp.dynamic.table.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Set;

@Data
@Configuration
@ConfigurationProperties("mybatis.plus.dynamic")
public class MybatisPlusDynamicTableProperties {

    private Set<String> tables;
}
