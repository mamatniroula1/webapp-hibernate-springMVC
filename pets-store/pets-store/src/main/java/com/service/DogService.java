package com.service;

import com.dao.PDog;

import java.util.List;

public interface DogService {
    String save(PDog dog);
    int findTotals();
    String update(PDog dog);
    List<PDog> findDogs();
    String deleteById(int did);
}
