package com.myservice.kz;

import com.beans.kz.Dept;
import com.beans.kz.Pages;
import com.mapper.kz.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper mMapper;

    @Override
    public void updateDept(Dept dept) {
        mMapper.updateDept(dept);
    }

    //查询某个科室
    @Override
    public Dept getDeptByDeptid(int deptid) {
        return mMapper.getDeptByDeptid(deptid);
    }

    //删除科室
    @Override
    public void delDept(int deptid) {
        System.out.println(deptid);
        mMapper.delDept(deptid);
    }

    @Override
    public void addDept(Dept dept) {
        mMapper.addDept(dept);
    }

    /**
     * 查询所有科室
     * @return
     */
    @Override
    public List<Dept> getAllDepts() {
        return mMapper.getAllDepts();
    }

    @Override
    public Map<String, Object> getAllDept(Pages page) {
        return null;
    }

    @Override
    public Map<String, Object> getAllDeptByName(Pages page) {
        System.out.println("service----s--------------------");
        Map<String, Object> map = new HashMap<>();
        map.put("rows", mMapper.getAllDeptByName(page));
        map.put("total",mMapper.getdeptCount());
        return map;

    }

}
