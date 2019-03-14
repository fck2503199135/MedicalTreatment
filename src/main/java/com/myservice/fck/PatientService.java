package com.myservice.fck;

import com.beans.fck.Page;
import com.beans.fck.Patient;
import com.beans.fck.Registered;


import java.util.List;
import java.util.Map;

public interface PatientService {

    List<Registered> getDept();

    List<Registered> getDoctor();

    List<Registered> getReg();

    void addRegister(Registered registered);

    Map<String, Object> getPatientByReg(Page page);

    Registered getRegPeoById(int rid);

    Map<String, Object> getPatPeo(Page page);

    Patient getPatById(int patid);

    Map<String, Object> getRegisterByNo(Page page);

    Map<String, Object> getRegisterByGo(Page page);

    void saveSetPat(Patient patient);

    Map<String, Object> getHisReg(Page page);

    Map<String, Object> getAllRegister(Page page);

    void updatePat(Patient patient);

    void delpat(int patid);

}
