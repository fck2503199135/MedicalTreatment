package com.controller.fck;


import com.beans.fck.Medicinal;
import com.beans.fck.Page;
import com.myservice.fck.MedicinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MedicinalController {

    @Autowired
    MedicinalService ms;


    @RequestMapping("/getAllMedicinal")
    @ResponseBody
    public List<Medicinal> getAllMedicinal(){
        return ms.getAllMedicinal();
    }

    @RequestMapping("/updateMedic")
    @ResponseBody
    public String updateMedic(int mid){
        ms.updateMedic(mid);
       return "1";
    }


    @RequestMapping("/getByNameAndTid")
    @ResponseBody
    public Map<String,Object> getByNameAndTid(@RequestBody Page page){
        return ms.getByNameAndTid(page);
    }

    @RequestMapping("/addMedicinal")
    @ResponseBody
    public Map<String,Object> addMedicinal(@RequestBody Page page){
        return ms.getByNameAndTid(page);
    }


    @RequestMapping("/getMedicById")
    @ResponseBody
    public Map<String,Object> getMedicById(@RequestBody Page page){
        return ms.getMedicById(page);
    }



    @RequestMapping("/addMedicinById")
    @ResponseBody
    public Medicinal addMedicinById(Integer mid){
        return ms.addMedicinById(mid);
    }



    @RequestMapping("/getAllmed")
    @ResponseBody
    public Map<String,Object> getAllmed(@RequestBody Page page){
        return ms.getByNameAndTid(page);
    }

    @RequestMapping("/editprice")
    @ResponseBody
    public String editprice(Medicinal medicinal){
        ms.editprice(medicinal);
        return "1";
    }


    @RequestMapping("/getAllMedPur")
    @ResponseBody
    public Map<String,Object> getAllMedPur(@RequestBody Page page){
        return ms.getAllMedPur(page);
    }


    @RequestMapping("/getMedData")
    @ResponseBody
    public List<Medicinal> getMedData(){
        return ms.getMedData();
    }








}
