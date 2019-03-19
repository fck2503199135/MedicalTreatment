package com.mapper.kz;

import com.beans.kz.Hospital;

import java.util.List;

public interface HospitalMapper {


    /**
     *
     * @return
     */
    Hospital getAllHospital();



    List<String> getAllDeptname();

    void  updateHospital(Hospital hospital);


}
