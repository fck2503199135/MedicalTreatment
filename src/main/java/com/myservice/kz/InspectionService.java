package com.myservice.kz;

import com.beans.kz.Inspectionfee;
import com.beans.kz.Pages;

import java.util.Map;

public interface InspectionService {


    /**
     * 查询项目检查费
     * @param page
     * @return
     */
    Map<String,Object> getAllInspection(Pages page);

    /**
     * 添加项目
     * @param inspectionfee
     */
    void addInspection(Inspectionfee inspectionfee);


    /**
     * 删除项目
     * @param insid
     */
    void delInspection(int insid);


    Inspectionfee getInspectionById(int insid);

    /**
     * 修改
     * @param inspectionfee
     */
    void updateInspection(Inspectionfee inspectionfee);
}
