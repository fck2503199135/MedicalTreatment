package com.myservice.kz;

import com.beans.kz.Inspectionfee;
import com.beans.kz.Pages;
import com.mapper.kz.InspectionfeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class InspectionServiceImpl implements InspectionService {

    @Autowired
    InspectionfeeMapper mMapper;

//    @Override
//    public Map<String, Object> getAllInspection(Page page) {
//        return null;
//    }



    //查询检查项目费
    @Override
    public Map<String, Object> getAllInspection(Pages page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", mMapper.getAllInspection(page));
        map.put("total",mMapper.getinsCount());
        return map;
    }

    @Override
    public void addInspection(Inspectionfee inspectionfee) {
        mMapper.addInspection(inspectionfee);
    }


    @Override
    public void updateInspection(Inspectionfee inspectionfee) {
        mMapper.updateInspection(inspectionfee);
    }

    @Override
    public Inspectionfee getInspectionById(int insid) {
        return mMapper.getInspectionById(insid);
    }

    @Override
    public void delInspection(int insid) {
        mMapper.delInspection(insid);
    }
}
