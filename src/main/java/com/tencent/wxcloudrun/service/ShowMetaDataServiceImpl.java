package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.base.BaseShowMetaDataDAO;
import com.tencent.wxcloudrun.model.ShowMetaDataDO;
import com.tencent.wxcloudrun.model.ShowMetaDataParam.Criteria;
import com.tencent.wxcloudrun.model.ShowMetaDataParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class was generated by Ali-Generator
 * @author chengleiyi
 */
@Service
public class ShowMetaDataServiceImpl implements ShowMetaDataService {
    @Autowired
    private BaseShowMetaDataDAO baseShowMetaDataDAO;

    @Autowired
    private ShowMetaDataConverter showMetaDataConverter;

    /**
     * 根据参数统计总数
     * @param param
     */
    @Override
    public long count(ShowMetaDataParameter param) {
        ShowMetaDataParam showMetaDataParam = new ShowMetaDataParam();
        Criteria criteria = showMetaDataParam.createCriteria();
        //TODO 注意：需要根据业务实际情况自行编写WHERE条件
        return baseShowMetaDataDAO.countByParam(showMetaDataParam);
    }

    /**
     * 根据参数查询
     * @param param
     */
    @Override
    public ShowMetaDataDTO find(ShowMetaDataParameter param) {
        ShowMetaDataParam showMetaDataParam = new ShowMetaDataParam();
        Criteria criteria = showMetaDataParam.createCriteria();
        //TODO 注意：需要根据业务实际情况自行编写WHERE条件
        List<ShowMetaDataDO> list = baseShowMetaDataDAO.selectByParam(showMetaDataParam);
        if (null == list || list.isEmpty()) {
                return null;
        }
        return showMetaDataConverter.convertFromDO(list.get(0));
    }

    /**
     * 列表查询
     * @param param
     */
    @Override
    public List<ShowMetaDataDTO> list(ShowMetaDataParameter param) {
        ShowMetaDataParam showMetaDataParam = new ShowMetaDataParam();
        Criteria criteria = showMetaDataParam.createCriteria();
        //TODO 注意：需要根据业务实际情况自行编写WHERE条件
        List<ShowMetaDataDO> list = baseShowMetaDataDAO.selectByParam(showMetaDataParam);
        if (null == list || list.isEmpty()) {
                return null;
        }
        List<ShowMetaDataDTO> result = new ArrayList<>();
        for (ShowMetaDataDO record : list) {
            ShowMetaDataDTO showMetaDataDTO = showMetaDataConverter.convertFromDO(record);
                result.add(showMetaDataDTO);
        }
        return result;
    }

    /**
     * 创建
     * @param param
     */
    @Override
    public void create(ShowMetaDataParameter param) {
        ShowMetaDataDO record = new ShowMetaDataDO();
        record.setId(param.getId());
        record.setGmtCreate(new Date());
        record.setGmtModified(new Date());
        record.setShowCode(param.getShowCode());
        record.setShowName(param.getShowName());
        record.setMainPicture(param.getMainPicture());
        record.setChannel(param.getChannel());
        record.setLastShowTime(param.getLastShowTime());
        record.setStatus(param.getStatus());
        record.setIndex(param.getIndex());
        baseShowMetaDataDAO.insert(record);
    }

    /**
     * 修改
     * @param dto
     * @param param
     */
    @Override
    public void updateSelective(ShowMetaDataDTO dto, ShowMetaDataParameter param) {
        ShowMetaDataDO record = showMetaDataConverter.convertFromDTO(dto);
        record.setGmtModified(new Date());
        ShowMetaDataParam showMetaDataParam = new ShowMetaDataParam();
        Criteria criteria = showMetaDataParam.createCriteria();
        //TODO 注意：需要根据业务实际情况自行编写WHERE条件
        baseShowMetaDataDAO.updateByParamSelective(record, showMetaDataParam);
    }
}