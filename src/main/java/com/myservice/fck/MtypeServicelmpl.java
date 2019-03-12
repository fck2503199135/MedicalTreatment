package com.myservice.fck;


import com.beans.fck.Mtype;
import com.mapper.fck.MtypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MtypeServicelmpl implements MtypeService{

    @Autowired
    MtypeMapper mtypeMapper;
    @Override
    public List<Mtype> getAllMtype() {
        return mtypeMapper.getAllMtype();
    }
}
