package com.tencent.wxcloudrun.dao.base;

import com.tencent.wxcloudrun.model.ShowMetaDataDO;
import com.tencent.wxcloudrun.model.ShowMetaDataParam;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * This class was generated by Ali-Generator
 * @author chengleiyi
 */
@Mapper
public interface BaseShowMetaDataDAO {
    /**
     * 根据WHERE条件COUNT
     * @param showMetaDataParam
     * @return
     *
     * @mbg.generated
     */
    long countByParam(ShowMetaDataParam showMetaDataParam);

    /**
     * 根据WHERE条件删除
     * @param showMetaDataParam
     * @return
     *
     * @mbg.generated
     */
    int deleteByParam(ShowMetaDataParam showMetaDataParam);

    /**
     * 根据主键删除
     * @param id
     * @return
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入单条记录
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int insert(ShowMetaDataDO record);

    /**
     * 根据字段选择性插入单条记录
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int insertSelective(ShowMetaDataDO record);

    /**
     * 根据WHERE条件查询，返回不包含长文本字段
     * @param showMetaDataParam
     * @return
     *
     * @mbg.generated
     */
    List<ShowMetaDataDO> selectByParam(ShowMetaDataParam showMetaDataParam);

    /**
     * 根据主键查询
     * @param id
     * @return
     *
     * @mbg.generated
     */
    ShowMetaDataDO selectByPrimaryKey(Long id);

    /**
     * 根据WHERE条件选择性更新
     * @param record
     * @param showMetaDataParam
     * @return
     *
     * @mbg.generated
     */
    int updateByParamSelective(@Param("record") ShowMetaDataDO record, @Param("showMetaDataParam") ShowMetaDataParam showMetaDataParam);

    /**
     * 根据WHERE条件更新，不更新长文本字段
     * @param record
     * @param showMetaDataParam
     * @return
     *
     * @mbg.generated
     */
    int updateByParam(@Param("record") ShowMetaDataDO record, @Param("showMetaDataParam") ShowMetaDataParam showMetaDataParam);

    /**
     * 根据主键选择性更新
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShowMetaDataDO record);

    /**
     * 根据主键更新，不更新长文本字段
     * @param record
     * @return
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShowMetaDataDO record);

    /**
     * 批量插入
     * @param records
     * @return
     *
     * @mbg.generated
     */
    int batchInsert(List<ShowMetaDataDO> records);
}