package org.yaukie.demo.autocode.vo.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
* 列表实体类
* 根据需要删减无效参数
* @author: yuenbin
* @create: 2020/03/29 21/19/735
**/
@Data
public class TUserResponseVO {

    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer userId;

    @ApiModelProperty(value = "")
    private String userName;

    @ApiModelProperty(value = "")
    private String password;

    @ApiModelProperty(value = "")
    private Date createdTime;

    @ApiModelProperty(value = "")
    private Date updateTime;
}
