/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BaseModel
 * Author:   guofei
 * Date:     2019/5/15 14:05
 * Description: model的基本属性。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cool.victory.wfe.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseModel implements Serializable {
    /**
     * 数据的唯一标识
     */
    private Long id;
    private String creater;
    private Date creatTime;
    private String updater;
    private Date updateTime;
    /**
     *  是否失效  0,否  1，失效
     */
    private Integer flag;
}
