package com.mapper.fck;

import com.beans.fck.Page;
import com.beans.fck.Patient;
import com.beans.fck.Registered;

import java.util.List;

public interface PatientMapper {
    List<Registered> getDept();

    List<Registered> getDoctor();

    List<Registered> getReg();

    void addRegister(Registered registered);

    List<Registered> getPatientByReg(Page page);

    int getCount();

    int getNoCount();

    int getGoCount();

    Registered getRegPeoById(int rid);

    List<Patient> getPatPeo(Page page);

    int getPatCount();

    Patient getPatById(int patid);

    List<Registered> getRegisterByNo(Page page);

    void saveSetPat(Patient patient);

    void updateReg(Patient patient);

    List<Registered> getRegisterByGo(Page page);

    List<Registered> getHisReg(Page page);

    List<Registered> getAllRegister(Page page);

    void updatePat(Patient patient);

    void delpat(int patid);

    List<Patient> getPatDid();

}
