package com.mapper.fck;

import com.beans.fck.Page;
import com.beans.fck.Supplier;

import java.util.List;

public interface SupplierMapper {

    List<Supplier> getByNameAndName(Page page);

    int getCount();

    void addSupplier(Supplier supplier);

    void delSupplier(int sid);

    void updateSupplier(Supplier supplier);

    Supplier getById(int sid);
}
