package com.shuke.hello.spring.transaction.dao;

import com.shuke.hello.spring.transaction.domain.TbContent;
import org.springframework.stereotype.Repository;

@Repository
public interface TbContentDao {
    public void insert(TbContent tbContent);
}
