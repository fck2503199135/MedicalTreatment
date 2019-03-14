package com.myservice.fck;

import com.beans.fck.Page;
import com.beans.fck.Supplier;
import com.mapper.fck.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SupplierServicelmpl implements SupplierService{

    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public Map<String, Object> getByNameAndName(Page page) {
        Map<String,Object> map = new HashMap<>();
        map.put("rows",supplierMapper.getByNameAndName(page));
        map.put("total",supplierMapper.getCount());
        return map;
    }

    @Override
    public void addSupplier(Supplier supplier) {
        supplierMapper.addSupplier(supplier);
    }

    @Override
    public void delSupplier(int sid) {
        supplierMapper.delSupplier(sid);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        supplierMapper.updateSupplier(supplier);
    }

    @Override
    public Supplier getById(int sid) {
        return supplierMapper.getById(sid);
    }
}
