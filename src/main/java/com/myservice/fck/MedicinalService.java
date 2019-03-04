package com.myservice.fck;

import com.beans.fck.Medicinal;

import java.util.List;

public interface MedicinalService {

    //查询所有药品
    List<Medicinal> getAllMedicinal();
}
