package com.liujx.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: UserBean
 * @Auther: 刘金鑫
 * @Date: 2020/1/21 15:12
 * @Version: 1.0
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Slf4j
@TableName(value = "user")
public class UserBean extends BaseBean {

    private static final long serialVersionUID = -6618764234787362284L;

    @TableId(type = IdType.ASSIGN_UUID)
    private String userNo;
    @TableField(value = "user_name")
    private String userName;
    @TableField(value = "pass_word")
    private String passWord;

}
