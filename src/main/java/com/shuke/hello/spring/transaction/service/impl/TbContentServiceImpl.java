package com.shuke.hello.spring.transaction.service.impl;

import com.shuke.hello.spring.transaction.dao.TbContentDao;
import com.shuke.hello.spring.transaction.domain.TbContent;
import com.shuke.hello.spring.transaction.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentDao tbContentDao;

    @Override
    public void save(TbContent tbContent) {
        tbContentDao.insert(tbContent);
    }
}
