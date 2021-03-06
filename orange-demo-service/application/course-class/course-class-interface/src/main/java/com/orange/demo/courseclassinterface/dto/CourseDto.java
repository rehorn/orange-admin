package com.orange.demo.courseclassinterface.dto;

import com.orange.demo.common.core.validator.UpdateGroup;
import com.orange.demo.common.core.validator.ConstDictRef;
import com.orange.demo.courseclassinterface.constant.CourseDifficult;
import com.orange.demo.application.common.constant.Subject;

import lombok.Data;

import javax.validation.constraints.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * CourseDto对象。
 *
 * @author Orange Team
 * @date 2020-08-08
 */
@Data
public class CourseDto {

    /**
     * 主键Id。
     */
    @NotNull(message = "数据验证失败，主键Id不能为空！", groups = {UpdateGroup.class})
    private Long courseId;

    /**
     * 课程名称。
     */
    @NotBlank(message = "数据验证失败，课程名称不能为空！")
    private String courseName;

    /**
     * 课程价格。
     */
    @NotNull(message = "数据验证失败，课程价格不能为空！")
    private BigDecimal price;

    /**
     * 课程描述。
     */
    private String description;

    /**
     * 课程难度(0: 容易 1: 普通 2: 很难)。
     */
    @NotNull(message = "数据验证失败，课程难度不能为空！")
    @ConstDictRef(constDictClass = CourseDifficult.class, message = "数据验证失败，课程难度为无效值！")
    private Integer difficulty;

    /**
     * 年级Id。
     */
    @NotNull(message = "数据验证失败，所属年级不能为空！")
    private Integer gradeId;

    /**
     * 学科Id。
     */
    @NotNull(message = "数据验证失败，所属学科不能为空！")
    @ConstDictRef(constDictClass = Subject.class, message = "数据验证失败，所属学科为无效值！")
    private Integer subjectId;

    /**
     * 课时数量。
     */
    @NotNull(message = "数据验证失败，课时数量不能为空！")
    private Integer classHour;

    /**
     * 多张课程图片地址。
     */
    @NotBlank(message = "数据验证失败，课程图片不能为空！")
    private String pictureUrl;

    /**
     * 创建用户Id。
     */
    private Long createUserId;

    /**
     * 创建时间。
     */
    private Date createTime;

    /**
     * 最后修改时间。
     */
    private Date updateTime;

    /**
     * price 范围过滤起始值(>=)。
     */
    private BigDecimal priceStart;

    /**
     * price 范围过滤结束值(<=)。
     */
    private BigDecimal priceEnd;

    /**
     * classHour 范围过滤起始值(>=)。
     */
    private Integer classHourStart;

    /**
     * classHour 范围过滤结束值(<=)。
     */
    private Integer classHourEnd;

    /**
     * updateTime 范围过滤起始值(>=)。
     */
    private String updateTimeStart;

    /**
     * updateTime 范围过滤结束值(<=)。
     */
    private String updateTimeEnd;

    /**
     * gradeId 字典关联数据。
     */
    private Map<String, Object> gradeIdDictMap;

    /**
     * difficulty 常量字典关联数据。
     */
    private Map<String, Object> difficultyDictMap;

    /**
     * subjectId 常量字典关联数据。
     */
    private Map<String, Object> subjectIdDictMap;
}
