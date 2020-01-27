package com.dao;

import java.util.List;

public interface DogDao {
    String save(PDog dog);
    int findTotals();
    String update(PDog dog);
    List<PDog> findDogs();
    String deleteById(int did);
}
