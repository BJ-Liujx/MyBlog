package com.liujx.entity.system;

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
    private String creator;
    @CreationDate
    private Date creationDate;
    @Modifier
    private String modifier;
    @ModifyDate
    private Date modifyDate;

}
