package com.futamilktea.search.types;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @auther: wulusai
 * @PackageName: PACKAGE_NAME
 * @ClassName: com.futamilktea.search.types.Info
 * @Description:
 * @date: 2019/8/29 20:27
 */
@Document(indexName = "info", type = "docs")
public class Info {

    @Id
    private Long id;

    //标题名称
    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String name;

    //属性
    @Field(type = FieldType.Double)
    private String value;


    //get set


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
