package me.tuzuku.mp.dynamic.table.config;


import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import me.tuzuku.mp.dynamic.table.core.EnableDynamicTableName;
import me.tuzuku.mp.dynamic.table.core.MybatisPlusDynamicTableProperties;
import me.tuzuku.mp.dynamic.table.core.TableNameContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.CollectionUtils;

import java.util.Map;
import java.util.Set;

@Configuration
@EnableConfigurationProperties(MybatisPlusDynamicTableProperties.class)
public class DynamicTableNameConfig implements ImportAware {

    @Autowired
    private MybatisPlusDynamicTableProperties dynamicTableProperties;

    private boolean enableDynamicTableName;


    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        Map<String, Object> attributeMap = importMetadata.getAnnotationAttributes(EnableDynamicTableName.class.getName());
        this.enableDynamicTableName = attributeMap != null && (Boolean) attributeMap.get("value");
    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        if (enableDynamicTableName) {
            DynamicTableNameInnerInterceptor dynamicTableNameInnerInterceptor = new DynamicTableNameInnerInterceptor();
            dynamicTableNameInnerInterceptor.setTableNameHandler((sql, tableName) -> {
                Set<String> tables = dynamicTableProperties.getTables();
                if (CollectionUtils.isEmpty(tables)) {
                    return tableName;
                }
                if (!tables.contains(tableName)) {
                    return tableName;
                }
                String suffix = TableNameContext.getContext();
                if (suffix == null || suffix.isEmpty()) {
                    return tableName;
                }
                return tableName + "_" + suffix;
            });
            interceptor.addInnerInterceptor(dynamicTableNameInnerInterceptor);
        }
        return interceptor;
    }

}