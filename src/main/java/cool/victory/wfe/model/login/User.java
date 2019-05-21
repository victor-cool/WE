/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   guofei
 * Date:     2019/5/15 14:18
 * Description: 用户基本表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cool.victory.wfe.model.login;

import cool.victory.wfe.model.BaseModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User extends BaseModel {
    /**
     * 用户在本系统的唯一编号（以姓名，身份标识，身份编号为唯一值）
     */
    private String userCode;
    /**
     * 用户可以有多个昵称，取最新的 对userCode为1对多
     */
    private String nickName;

    private String realName;

    @ApiModelProperty(name = "身份类型：0:身份证,1:港澳台通行证,2:护照,3:军人身份证,4:武装警察身份证件",allowableValues = "range[0,1,2,3,4]" )
    private int idType;

    private Long idNum;

    private String password;

    private String moible;

    /**
     * 是否静默注册 0 否，1，是（静默注册需要实名认证）
     */
    @ApiModelProperty(name = "是否静默注册: 0:否,1:是")
    private int ifRegister;

    private String emailAddress;


}
