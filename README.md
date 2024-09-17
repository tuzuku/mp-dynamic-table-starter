# Mybatis Plus Dynamic Table Name Starter
## Introduction

This starter provides dynamic table name functionality for MyBatis Plus in Spring Boot applications.

- Compatible with JDK 17+
- Built for Spring Boot 3.3+
- Uses MyBatis Plus 3.5.7

## Usage
**1. Enable the configuration**

Add `@EnableDynamicTableName` to your main spring boot application  class.
```java
@SpringBootApplication
@EnableDynamicTableName
public class MpSplitStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpSplitStarterApplication.class, args);

    }

}
```

**2. Configure dynamic tables**
   
Specify the tables you want to have dynamic names:
```sh
mybatis.plus.dynamic.tables=t_demo
```


**3. Set the table suffix at  runtime**
   
Use `TableNameContext` to set the table suffix
```java

TableNameContext.setContext("table_suffix")
```



