package com.entity.model;

import com.entity.PaishexuantuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 拍摄选图
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PaishexuantuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 拍摄预定
     */
    private Integer paishexiangmuId;


    /**
     * 图片
     */
    private String paishexuantuPhoto;


    /**
     * 状态
     */
    private Integer paishexuantuTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：拍摄预定
	 */
    public Integer getPaishexiangmuId() {
        return paishexiangmuId;
    }


    /**
	 * 设置：拍摄预定
	 */
    public void setPaishexiangmuId(Integer paishexiangmuId) {
        this.paishexiangmuId = paishexiangmuId;
    }
    /**
	 * 获取：图片
	 */
    public String getPaishexuantuPhoto() {
        return paishexuantuPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setPaishexuantuPhoto(String paishexuantuPhoto) {
        this.paishexuantuPhoto = paishexuantuPhoto;
    }
    /**
	 * 获取：状态
	 */
    public Integer getPaishexuantuTypes() {
        return paishexuantuTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setPaishexuantuTypes(Integer paishexuantuTypes) {
        this.paishexuantuTypes = paishexuantuTypes;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
