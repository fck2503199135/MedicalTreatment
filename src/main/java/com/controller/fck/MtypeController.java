package com.controller.fck;

import com.beans.fck.Mtype;
import com.myservice.fck.MtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MtypeController {
    @Autowired
    MtypeService ms;


    @RequestMapping("/getAllMtype")
    @ResponseBody
    public List<Mtype> getAllMtype() {

        return ms.getAllMtype();

    }


}
