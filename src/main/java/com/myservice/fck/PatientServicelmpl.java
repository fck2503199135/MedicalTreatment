package com.myservice.fck;


import com.beans.fck.Page;
import com.beans.fck.Patient;
import com.beans.fck.Registered;
import com.mapper.fck.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PatientServicelmpl implements PatientService {

    @Autowired
    PatientMapper patientMapper;

    @Override
    public List<Registered> getDept() {
        return patientMapper.getDept();
    }

    @Override
    public List<Registered> getDoctor() {
        return patientMapper.getDoctor();
    }

    @Override
    public List<Registered> getReg() {
        return patientMapper.getReg();
    }

    @Override
    public void addRegister(Registered registered) {
        patientMapper.addRegister(registered);
    }


    @Override
    public Map<String, Object> getPatientByReg(Page page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", patientMapper.getPatientByReg(page));
        map.put("total", patientMapper.getCount());
        return map;
    }

    @Override
    public Registered getRegPeoById(int rid) {
        return patientMapper.getRegPeoById(rid);
    }

    @Override
    public Map<String, Object> getPatPeo(Page page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", patientMapper.getPatPeo(page));
        map.put("total", patientMapper.getPatCount());
        return map;
    }

    @Override
    public Patient getPatById(int patid) {
        return patientMapper.getPatById(patid);
    }

    @Override
    public Map<String, Object> getRegisterByNo(Page page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", patientMapper.getRegisterByNo(page));
        map.put("total", patientMapper.getNoCount());
        return map;
    }

    @Override
    public void saveSetPat(Patient patient) {
        patientMapper.saveSetPat(patient);
        patientMapper.updateReg(patient);
    }

    @Override
    public Map<String, Object> getRegisterByGo(Page page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", patientMapper.getRegisterByGo(page));
        map.put("total", patientMapper.getGoCount());
        return map;
    }

    @Override
    public Map<String, Object> getHisReg(Page page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", patientMapper.getHisReg(page));
        map.put("total", patientMapper.getGoCount());
        return map;
    }

    @Override
    public Map<String, Object> getAllRegister(Page page) {
        Map<String, Object> map = new HashMap<>();
        map.put("rows", patientMapper.getAllRegister(page));
        map.put("total", patientMapper.getCount());
        return map;
    }

    @Override
    public void updatePat(Patient patient) {
        patientMapper.updatePat(patient);
    }

    @Override
    public void delpat(int patid) {
        patientMapper.delpat(patid);
    }
}
