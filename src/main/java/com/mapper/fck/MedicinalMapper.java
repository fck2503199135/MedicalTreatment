package com.mapper.fck;

import com.beans.fck.Medicinal;
import com.beans.fck.Page;

import java.util.List;
import java.util.Map;

public interface MedicinalMapper {

    //查询所有药品
    List<Medicinal> getAllMedicinal();
    // 查询通过名称和类别
    List<Medicinal> getByNameAndTid(Page page);
    // 获得总数
    int getCount(Page page);
    // 修改是否在维护的药品
    void updateMedic(int mid);

    List<Medicinal> getMedicById(Page page);

    int getZeroCount();

    Medicinal addMedicinById(int mid);

}
