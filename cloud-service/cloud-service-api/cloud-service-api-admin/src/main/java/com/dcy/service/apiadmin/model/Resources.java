package com.dcy.service.apiadmin.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

import com.dcy.basedb.model.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * <p>
 * 资源表
 * </p>
 *
 * @author dcy
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_resources")
public class Resources extends BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 父级id
     */
    private String parentId;

    /**
     * 父级ids
     */
    private String parentIds;

    /**
     * 资源名称
     */
    private String resName;

    /**
     * 资源code
     */
    private String resCode;

    /**
     * 资源path
     */
    private String resPath;

    /**
     * 请求方式
     */
    private String httpMethed;

    /**
     * 状态（0、正常；1、禁用）
     */
    private Boolean resStatus;

    /**
     * 类型（0、模块；1、链接）
     */
    private Boolean resType;

    /**
     * 排序
     */
    private BigDecimal resSort;

    public static final String ID = "id";

    public static final String PARENT_ID = "parent_id";

    public static final String PARENT_IDS = "parent_ids";

    public static final String RES_NAME = "res_name";

    public static final String RES_CODE = "res_code";

    public static final String RES_PATH = "res_path";

    public static final String HTTP_METHED = "http_methed";

    public static final String RES_STATUS = "res_status";

    public static final String RES_TYPE = "res_type";

    public static final String RES_SORT = "res_sort";

}
