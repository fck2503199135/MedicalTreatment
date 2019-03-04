package com.myservice.fck;

import com.beans.fck.Medicinal;
import com.mapper.fck.MedicinalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedicinalServicelmpl implements MedicinalService{

    @Autowired
    MedicinalMapper medicinalMapper;


    @Override
    public List<Medicinal> getAllMedicinal() {
        return medicinalMapper.getAllMedicinal();
    }
}
