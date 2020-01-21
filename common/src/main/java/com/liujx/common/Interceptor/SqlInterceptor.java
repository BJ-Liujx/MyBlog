package com.liujx.common.Interceptor;


import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.handlers.AbstractSqlParserHandler;
import com.liujx.common.annotation.CreationDate;
import com.liujx.common.annotation.Creator;
import com.liujx.common.annotation.Modifier;
import com.liujx.common.annotation.ModifyDate;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @ClassName: SqlInterceptor
 * @Auther: 刘金鑫
 * @Date: 2020/1/20 13:42
 * @Version: 1.0
 * @Description: 添加创建时间和修改时间的拦截器
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class SqlInterceptor extends AbstractSqlParserHandler implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];

        // 获取 SQL 命令
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();

        // 获取参数
        Object parameter = invocation.getArgs()[1];

        // 获取私有成员变量
        Field[] declaredFields = parameter.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            // insert 语句插入 createTime
            if (field.getAnnotation(Creator.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, "SYSTEM");
                }
            }
            if (field.getAnnotation(CreationDate.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, DateUtil.date());
                }
            }
            // insert 或 update 语句插入 updateTime
            if (field.getAnnotation(Modifier.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, "SYSTEM");
                }
            }
            // insert 或 update 语句插入 updateTime
            if (field.getAnnotation(ModifyDate.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, DateUtil.date());
                }
            }
        }

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if (target instanceof Executor) {
            return Plugin.wrap(target, this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
