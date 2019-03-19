package com.myservice.fck;

import com.beans.fck.Medicinal;
import com.beans.fck.Page;

import java.util.List;
import java.util.Map;

public interface MedicinalService {

    //查询所有药品
    List<Medicinal> getAllMedicinal();
    // 查询通过名称和类别
    Map<String,Object> getByNameAndTid(Page page);
    // 修改是否在维护的药品
    void updateMedic(int mid);

    Map<String,Object> getMedicById(Page page);

    Medicinal addMedicinById(int mid);

    void editprice(Medicinal medicinal);

    Map<String,Object> getAllMedPur(Page page);

    List<Medicinal> getMedData();


}
