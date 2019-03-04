package com.controller.fck;


import com.beans.fck.Medicinal;
import com.myservice.fck.MedicinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MedicinalController {

    @Autowired
    MedicinalService ms;


    @RequestMapping("/getAllMedicinal")
    @ResponseBody
    public List<Medicinal> getAllMedicinal(){
        System.out.println(ms.getAllMedicinal());
        return ms.getAllMedicinal();
    }


}
