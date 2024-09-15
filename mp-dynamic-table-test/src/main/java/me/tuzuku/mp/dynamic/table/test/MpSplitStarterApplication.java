package me.tuzuku.mp.dynamic.table.test;

import me.tuzuku.mp.dynamic.table.core.EnableDynamicTableName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamicTableName
public class MpSplitStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpSplitStarterApplication.class, args);

    }

}
