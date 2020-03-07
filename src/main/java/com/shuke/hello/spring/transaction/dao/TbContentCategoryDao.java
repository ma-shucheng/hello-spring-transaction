package com.shuke.hello.spring.transaction.dao;

import com.shuke.hello.spring.transaction.domain.TbContentCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface TbContentCategoryDao {
    public void insert(TbContentCategory tbContentCategory);
}
