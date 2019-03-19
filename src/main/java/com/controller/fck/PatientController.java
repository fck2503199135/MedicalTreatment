package com.controller.fck;


import com.beans.fck.Page;
import com.beans.fck.Patient;
import com.beans.fck.Registered;
import com.myservice.fck.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class PatientController {

    @Autowired
    PatientService ps;

    @RequestMapping("/getDept")
    @ResponseBody
    public List<Registered> getDept() {
        return ps.getDept();
    }

    @RequestMapping("/getDoctor")
    @ResponseBody
    public List<Registered> getDoctor() {
        return ps.getDoctor();
    }


    @RequestMapping("/getReg")
    @ResponseBody
    public List<Registered> getReg() {
        return ps.getReg();
    }

    @RequestMapping("/addRegister")
    @ResponseBody
    public String addRegister(Registered registered) {
        ps.addRegister(registered);
        return "1";
    }

    @RequestMapping("/getPatientByReg")
    @ResponseBody
    public Map<String,Object> getPatientByReg(@RequestBody Page page) {
        return ps.getPatientByReg(page);

    }


    @RequestMapping("/getRegPeo")
    @ResponseBody
    public Map<String,Object> getRegPeo(@RequestBody Page page) {
        return ps.getPatientByReg(page);

    }


    @RequestMapping("/getPatPeo")
    @ResponseBody
    public Map<String,Object> getPatPeo(@RequestBody Page page) {
        return ps.getPatPeo(page);
    }


    @RequestMapping("/getRegPeoById")
    @ResponseBody
    public Registered getRegPeoById(Integer rid) {
        return ps.getRegPeoById(rid);

    }


    @RequestMapping("/addPatPeoById")
    @ResponseBody
    public Patient addPatPeoById(Integer patid) {
        return ps.getPatById(patid);

    }


    @RequestMapping("/getRegisterByNo")
    @ResponseBody
    public Map<String,Object> getRegisterByNo(@RequestBody Page page) {
        return ps.getRegisterByNo(page);

    }

    @RequestMapping("/getRegisterByGo")
    @ResponseBody
    public Map<String,Object> getRegisterByGo(@RequestBody Page page) {
        return ps.getRegisterByGo(page);

    }

    @RequestMapping("/getHisReg")
    @ResponseBody
    public Map<String,Object> getHisReg(@RequestBody Page page) {
        return ps.getHisReg(page);

    }



    @RequestMapping("/saveSetPat")
    @ResponseBody
    public String saveSetPat(Patient patient) {
        ps.saveSetPat(patient);
        return "1";
    }

    @RequestMapping("/getAllRegister")
    @ResponseBody
    public Map<String,Object> getAllRegister(@RequestBody Page page) {
        return ps.getAllRegister(page);

    }


    @RequestMapping("/getAllPatient")
    @ResponseBody
    public Map<String,Object> getAllPatient(@RequestBody Page page) {
        return ps.getPatPeo(page);

    }

    @RequestMapping("/getPatById")
    @ResponseBody
    public Patient getPatById(Integer patid) {
        return ps.getPatById(patid);
    }

    @RequestMapping("/updatePat")
    @ResponseBody
    public String updatePat(Patient patient) {
        ps.updatePat(patient);
        return "1";
    }

    @RequestMapping("/delPat")
    @ResponseBody
    public String delPat(Integer patid) {
        ps.delpat(patid);
        return "1";
    }



    @RequestMapping("/getPdid")
    @ResponseBody
    public List<Patient> getPatDid() {
        return ps.getPatDid();
    }







}
