package com.service;

import com.dao.DogDao;
import com.dao.DogDaoImpl;
import com.dao.PDog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

//This annotation is used to create a bean of service layer
//Service layer access dao layer
@Service
@Scope("singleton")
public class DogServiceImpl implements  DogService {

    @Autowired
    private DogDao dogDao;


    @Override
    public String save(PDog dog) {
        String result=dogDao.save(dog);
        return result;
    }

    @Override
    public int findTotals() {
        return dogDao.findTotals();
    }

    @Override
    public String update(PDog dog) {
        return dogDao.update(dog);
    }

    @Override
    public List<PDog> findDogs() {
        return dogDao.findDogs();
    }

    @Override
    public String deleteById(int did) {
        return dogDao.deleteById(did);
    }
}
