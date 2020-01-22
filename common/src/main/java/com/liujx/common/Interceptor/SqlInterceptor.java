package com.liujx.common.Interceptor;


import com.baomidou.mybatisplus.extension.handlers.AbstractSqlParserHandler;
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
 * @Description: sql拦截器 这三个方法的执行顺序: setProperties--->plugin--->intercept
 */
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class SqlInterceptor extends AbstractSqlParserHandler implements Interceptor {

    /**
     * intercept方法是我们拦截到对象后所进行操作的位置
     * @param invocation  private Object target;//所拦截到的目标的代理
     *                    private Method method;//所拦截目标的具体方法
     *                    private Object[] args;//方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];

        // 获取 SQL 命令
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();

        // 获取参数
        Object parameter = invocation.getArgs()[1];

        // 获取私有成员变量
        Field[] declaredFields = parameter.getClass().getDeclaredFields();

//        for (Field field : declaredFields) {
//            // insert 语句插入 createTime
//            if (field.getAnnotation(Creator.class) != null) {
//                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
//                    field.setAccessible(true);
//                    field.set(parameter, "SYSTEM");
//                }
//            }
//            if (field.getAnnotation(CreationDate.class) != null) {
//                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
//                    field.setAccessible(true);
//                    field.set(parameter, DateUtil.date());
//                }
//            }
//            // insert 或 update 语句插入 updateTime
//            if (field.getAnnotation(Modifier.class) != null) {
//                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
//                    field.setAccessible(true);
//                    field.set(parameter, "SYSTEM");
//                }
//            }
//            // insert 或 update 语句插入 updateTime
//            if (field.getAnnotation(ModifyDate.class) != null) {
//                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
//                    field.setAccessible(true);
//                    field.set(parameter, DateUtil.date());
//                }
//            }
//        }

        return invocation.proceed();
    }

    /**
     * plugin方法，根据参数可以看出，该方法的作用是拦截我们需要拦截到的对象。
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
//        if (target instanceof Executor) {
//            return Plugin.wrap(target, this);
//        }
        //生成代理对象
        return Plugin.wrap(target, this);
    }

    /**
     * setProperties方法，我们可以通过配置文件中进行properties配置,然后在该方法中读取到配置。
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {

    }
}
