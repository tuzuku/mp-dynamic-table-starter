package me.tuzuku.mp.dynamic.table.test.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_demo")
public class Demo implements Serializable {

    private static final long serialVersionUID = -679346742743129464L;

    private Long id;

    private String name;

    private Integer type;


}
