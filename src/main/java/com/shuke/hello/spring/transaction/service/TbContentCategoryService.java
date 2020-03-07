package com.shuke.hello.spring.transaction.service;

import com.shuke.hello.spring.transaction.domain.TbContent;
import com.shuke.hello.spring.transaction.domain.TbContentCategory;

public interface TbContentCategoryService {
    public void save(TbContentCategory tbContentCategory, TbContent tbContent);
}
