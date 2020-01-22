package com.liujx.web.handler;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName: MyMetaObjectHandler
 * @Auther: 刘金鑫
 * @Date: 2020/1/21 16:26
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        String currentUserId = "SYSTEM";
        Date now = DateUtil.date();
        log.info("start insert fill ....");
        setFieldValByName("creator", currentUserId, metaObject);
        setFieldValByName("creationDate", now, metaObject);
        setFieldValByName("modifier", currentUserId, metaObject);
        setFieldValByName("modifyDate", now, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        String currentUserId = "SYSTEM";
        Date now = DateUtil.date();
        log.info("start update fill ....");
        setFieldValByName("modifier", currentUserId, metaObject);
        setFieldValByName("modifyDate", now, metaObject);
    }
}
