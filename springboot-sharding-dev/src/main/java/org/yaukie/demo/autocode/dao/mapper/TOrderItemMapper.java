package org.yaukie.demo.autocode.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.yaukie.demo.autocode.model.TOrderItem;
import org.yaukie.demo.autocode.model.TOrderItemExample;

public interface TOrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    long countByExample(TOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int deleteByExample(TOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int insert(TOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int insertSelective(TOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    List<TOrderItem> selectByExample(TOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    TOrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int updateByExampleSelective(@Param("record") TOrderItem record, @Param("example") TOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int updateByExample(@Param("record") TOrderItem record, @Param("example") TOrderItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int updateByPrimaryKeySelective(TOrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_order_item
     *
     * @mbg.generated Sun Mar 29 21:19:03 CST 2020
     */
    int updateByPrimaryKey(TOrderItem record);
}