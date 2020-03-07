package com.shuke.hello.spring.transaction.domain;

import lombok.Data;

import java.util.Date;


@Data
public class TbContent{
    private Long id;
    private Long categoryId;
    private String title;
    private String subTitle;
    private String titleDesc;
    private String url;
    private String pic;
    private String pic2;
    private String content;
    private Date created;
    private Date updated;
    private TbContentCategory tbContentCategory;
}
