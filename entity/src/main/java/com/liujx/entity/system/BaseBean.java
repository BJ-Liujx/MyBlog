package com.liujx.entity.system;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.liujx.common.annotation.CreationDate;
import com.liujx.common.annotation.Creator;
import com.liujx.common.annotation.Modifier;
import com.liujx.common.annotation.ModifyDate;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BaseBean
 * @Auther: 刘金鑫
 * @Date: 2020/1/21 09:08
 * @Version: 1.0
 * @Description:
 */
@Data
public class BaseBean implements Serializable {

    private static final long serialVersionUID = -8698509434590353145L;
    @Creator
    @TableField(value = "creator", fill = FieldFill.INSERT)
    private String creator;
    @CreationDate
    @TableField(value = "creation_date", fill = FieldFill.INSERT)
    private Date creationDate;
    @Modifier
    @TableField(value = "modifier", fill = FieldFill.INSERT_UPDATE)
    private String modifier;
    @ModifyDate
    @TableField(value = "modify_date", fill = FieldFill.INSERT_UPDATE)
    private Date modifyDate;

}
