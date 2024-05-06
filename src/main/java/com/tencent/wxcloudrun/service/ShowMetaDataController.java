package com.tencent.wxcloudrun.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class was generated by Ali-Generator
 * @author chengleiyi
 */
@RestController
@RequestMapping(value = "/ShowMetaData")
public class ShowMetaDataController {
    @Autowired
    private ShowMetaDataService showMetaDataService;

    /**
     * 根据参数查找
     */
    @ResponseBody
    @GetMapping("/find")
    public ShowMetaDataDTO find(@RequestParam(required = false) Long id, @RequestParam(required = false) String showCode, @RequestParam(required = false) String showName, @RequestParam(required = false) String mainPicture, @RequestParam(required = false) String channel, @RequestParam(required = false) java.util.Date lastShowTime, @RequestParam(required = false) Byte status, @RequestParam(required = false) Integer index) {
        ShowMetaDataParameter param = new ShowMetaDataParameter();
        param.setId(id);
        param.setShowCode(showCode);
        param.setShowName(showName);
        param.setMainPicture(mainPicture);
        param.setChannel(channel);
        param.setLastShowTime(lastShowTime);
        param.setStatus(status);
        param.setIndex(index);
        return showMetaDataService.find(param);
    }

    /**
     * 列表查询
     */
    @ResponseBody
    @GetMapping("/list")
    public List<ShowMetaDataDTO> list(@RequestParam(required = false) Long id, @RequestParam(required = false) String showCode, @RequestParam(required = false) String showName, @RequestParam(required = false) String mainPicture, @RequestParam(required = false) String channel, @RequestParam(required = false) java.util.Date lastShowTime, @RequestParam(required = false) Byte status, @RequestParam(required = false) Integer index) {
        ShowMetaDataParameter param = new ShowMetaDataParameter();
        param.setId(id);
        param.setShowCode(showCode);
        param.setShowName(showName);
        param.setMainPicture(mainPicture);
        param.setChannel(channel);
        param.setLastShowTime(lastShowTime);
        param.setStatus(status);
        param.setIndex(index);
        return showMetaDataService.list(param);
    }

    /**
     * 创建
     */
    @RequestMapping("/create")
    public void create(@RequestParam(required = false) Long id, @RequestParam(required = false) String showCode, @RequestParam(required = false) String showName, @RequestParam(required = false) String mainPicture, @RequestParam(required = false) String channel, @RequestParam(required = false) java.util.Date lastShowTime, @RequestParam(required = false) Byte status, @RequestParam(required = false) Integer index) {
        ShowMetaDataParameter param = new ShowMetaDataParameter();
        param.setId(id);
        param.setShowCode(showCode);
        param.setShowName(showName);
        param.setMainPicture(mainPicture);
        param.setChannel(channel);
        param.setLastShowTime(lastShowTime);
        param.setStatus(status);
        param.setIndex(index);
        showMetaDataService.create(param);
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public void updateSelective(@RequestParam(required = false) Long id, @RequestParam(required = false) String showCode, @RequestParam(required = false) String showName, @RequestParam(required = false) String mainPicture, @RequestParam(required = false) String channel, @RequestParam(required = false) java.util.Date lastShowTime, @RequestParam(required = false) Byte status, @RequestParam(required = false) Integer index) {
        ShowMetaDataDTO dto = new ShowMetaDataDTO();
        dto.setId(id);
        dto.setShowCode(showCode);
        dto.setShowName(showName);
        dto.setMainPicture(mainPicture);
        dto.setChannel(channel);
        dto.setLastShowTime(lastShowTime);
        dto.setStatus(status);
        dto.setIndex(index);
        ShowMetaDataParameter param = new ShowMetaDataParameter();
        param.setId(id);
        param.setShowCode(showCode);
        param.setShowName(showName);
        param.setMainPicture(mainPicture);
        param.setChannel(channel);
        param.setLastShowTime(lastShowTime);
        param.setStatus(status);
        param.setIndex(index);
        showMetaDataService.updateSelective(dto, param);
    }
}