package com.tencent.wxcloudrun.service;

import java.util.List;

/**
 * This class was generated by Ali-Generator
 * @author chengleiyi
 */
public interface ShowMetaDataService {
    /**
     * 根据参数统计总数
     * @param param
     */
    long count(ShowMetaDataParameter param);

    /**
     * 根据参数查询
     * @param param
     */
    ShowMetaDataDTO find(ShowMetaDataParameter param);

    /**
     * 列表查询
     * @param param
     */
    List<ShowMetaDataDTO> list(ShowMetaDataParameter param);

    /**
     * 创建
     * @param param
     */
    void create(ShowMetaDataParameter param);

    /**
     * 选择性修改
     * @param dto
     * @param param
     */
    void updateSelective(ShowMetaDataDTO dto, ShowMetaDataParameter param);
}