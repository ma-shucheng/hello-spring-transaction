package com.shuke.hello.spring.transaction.domain;

import lombok.Data;

import java.util.Date;

/**
 * <p>
 * 分类管理
 * </p>
 *
 * @author shuke
 * @version v1.0.0
 * @see com.shuke.hello.spring.transaction.domain
 * @since 2020-03-04 11:21:02
 */
@Data
public class TbContentCategory{
    private Long id;
    private Long parentId;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Boolean isParent;
    private Date created;
    private Date updated;
    private TbContentCategory parent;
}
