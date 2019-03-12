package com.myservice.fck;

import com.beans.fck.Medicinal;
import com.beans.fck.Page;
import com.mapper.fck.MedicinalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class MedicinalServicelmpl implements MedicinalService{

    @Autowired
    MedicinalMapper medicinalMapper;


    @Override
    public List<Medicinal> getAllMedicinal() {
        return medicinalMapper.getAllMedicinal();
    }

    @Override
    public Map<String, Object> getByNameAndTid(Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("rows",medicinalMapper.getByNameAndTid(page));
        map.put("total",medicinalMapper.getCount(page));
        return map;
    }

    @Override
    public void updateMedic(int mid) {
        medicinalMapper.updateMedic(mid);
    }

    @Override
    public Map<String, Object> getMedicById(Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("rows",medicinalMapper.getMedicById(page));
        map.put("total",medicinalMapper.getZeroCount());
        return map;
    }

    @Override
    public Medicinal addMedicinById(int mid) {
        return medicinalMapper.addMedicinById(mid);
    }
}
