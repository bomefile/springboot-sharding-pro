package org.yaukie.api.base.core;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaukie.api.base.bean.SpringContextUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @Author: yuenbin
 * @Date :2020/3/14
 * @Time :10:53
 * @Motto: It is better to be clear than to be clever !
 * @Destrib: 构造顶层service 实现dao层所有数据库请求操作
 **/
public abstract class BaseService<M, T,E> implements Service<T,E> {

    private static Logger log = LoggerFactory.getLogger(BaseService.class);

    public M m;

    public BaseService() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
   public long countByExample(E example){
       try {
           Method countByExample = this.m.getClass().getDeclaredMethod("countByExample", example.getClass());
           T  obj = null;
           obj = (T) countByExample.invoke(this.m, example);
           return Long.parseLong(String.valueOf(obj));
       } catch (IllegalAccessException e) {
           log.error("{}" + "countByExample.IllegalAccessException", e);
           throw new RuntimeException("SQL执行出错");
       } catch (InvocationTargetException e) {
           log.error("{}" + "countByExample.InvocationTargetException", e);
           throw new RuntimeException("SQL执行出错");
       } catch (NoSuchMethodException e) {
           log.error("{}" + "countByExample.NoSuchMethodException", e);
           throw new RuntimeException("SQL执行出错");
       }
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public int deleteByExample(E example){
        try {
            Method deleteByExample = this.m.getClass().getDeclaredMethod("deleteByExample", example.getClass());
            T  obj = null;
            obj = (T) deleteByExample.invoke(this.m, example);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "deleteByExample.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错"+e.getMessage());
        } catch (InvocationTargetException e) {
            log.error("{}" + "deleteByExample.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错"+e.getMessage());
        } catch (NoSuchMethodException e) {
            log.error("{}" + "deleteByExample.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错"+e.getMessage());
        }
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public int deleteByPrimaryKey(Integer id){
        try {
            Method deleteByPrimaryKey = this.m.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
            T  obj = null;
            obj = (T) deleteByPrimaryKey.invoke(this.m, id);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "deleteByPrimaryKey.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "deleteByPrimaryKey.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "deleteByPrimaryKey.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public int insert(T record){
        try {
            Method insert = this.m.getClass().getDeclaredMethod("insert", record.getClass());
            T  obj = null;
            obj = (T) insert.invoke(this.m, record);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "insert.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "insert.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "insert.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
     public int insertSelective(T record){
        try {
            Method insertSelective = this.m.getClass().getDeclaredMethod("insertSelective", record.getClass());
            T  obj = null;
            obj = (T) insertSelective.invoke(this.m, record);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "insertSelective.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错"+e.getMessage());
        } catch (InvocationTargetException e) {
            log.error("{}" + "insertSelective.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错"+e.getMessage());
        } catch (NoSuchMethodException e) {
            log.error("{}" + "insertSelective.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错"+e.getMessage());
        }
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public List<T> selectByExample(E example){
        try {
            Method selectByExample = this.m.getClass().getDeclaredMethod("selectByExample", example.getClass());
            List<T>  obj = null;
            obj = (List<T>) selectByExample.invoke(this.m, example);
            return obj;
        } catch (IllegalAccessException e) {
            log.error("{}" + "selectByExample.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "selectByExample.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "selectByExample.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public T selectByPrimaryKey(Integer id){
        try {
            Method selectByPrimaryKey = this.m.getClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
            T  obj = null;
            obj = (T) selectByPrimaryKey.invoke(this.m, id);
            return obj;
        } catch (IllegalAccessException e) {
            log.error("{}" + "selectByPrimaryKey.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "selectByPrimaryKey.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "selectByPrimaryKey.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public int updateByExampleSelective(@Param("record") T record, @Param("example") E example){
       try {
            Method updateByExampleSelective = this.m.getClass().getDeclaredMethod("updateByExampleSelective", record.getClass(),example.getClass());
            T  obj = null;
            obj = (T) updateByExampleSelective.invoke(this.m, record,example);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "updateByExampleSelective.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "updateByExampleSelective.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "updateByExampleSelective.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
    public int updateByExample(@Param("record") T record, @Param("example") E example){
        try {
            Method updateByExample = this.m.getClass().getDeclaredMethod("updateByExample", record.getClass(),example.getClass());
            T  obj = null;
            obj = (T) updateByExample.invoke(this.m, record,example);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "updateByExample.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "updateByExample.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "updateByExample.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
   public int updateByPrimaryKeySelective(T record){
        try {
            Method updateByPrimaryKeySelective = this.m.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
            T  obj = null;
            obj = (T) updateByPrimaryKeySelective.invoke(this.m, record);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "updateByPrimaryKeySelective.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "updateByPrimaryKeySelective.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "updateByPrimaryKeySelective.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Fri Mar 20 15:28:09 CST 2020
     */
    @Override
   public int updateByPrimaryKey(T record){
        try {
            Method updateByPrimaryKey = this.m.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
            T  obj = null;
            obj = (T) updateByPrimaryKey.invoke(this.m, record);
            return Integer.parseInt(String.valueOf(obj));
        } catch (IllegalAccessException e) {
            log.error("{}" + "updateByPrimaryKey.IllegalAccessException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (InvocationTargetException e) {
            log.error("{}" + "updateByPrimaryKey.InvocationTargetException", e);
            throw new RuntimeException("SQL执行出错");
        } catch (NoSuchMethodException e) {
            log.error("{}" + "updateByPrimaryKey.NoSuchMethodException", e);
            throw new RuntimeException("SQL执行出错");
        }
    }


    public void initMapper() {
        this.m = (M) SpringContextUtil.getBean(this.getMapperClass());
    }

    public Class<M> getMapperClass() {
        return (Class) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
