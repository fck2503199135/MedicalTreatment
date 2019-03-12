package com.myservice.fck;

import com.beans.fck.Page;
import com.beans.fck.Supplier;

import java.util.Map;

public interface SupplierService {

    Map<String, Object> getByNameAndName(Page page);

    void addSupplier(Supplier supplier);

    void delSupplier(int sid);

    void updateSupplier(Supplier supplier);

    Supplier getById(int sid);
}
