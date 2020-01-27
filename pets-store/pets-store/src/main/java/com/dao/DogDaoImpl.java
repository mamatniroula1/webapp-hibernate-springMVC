package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DogDaoImpl implements  DogDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Spring jdbc
     * @param dog
     * @return
     */
    @Override
    public String save(PDog dog){
        String sql="insert into dogs_tbl(name,color,price,doe) values(?,?,?,?)";
        Object[] data=new Object[]{dog.getName(),dog.getColor(),dog.getPrice(),dog.getDoe()};
        jdbcTemplate.update(sql,data);
        return "success";
    }


    @Override
    public int findTotals(){
        String sql="select count(*) from dogs_tbl";
        int numOfCars = jdbcTemplate.queryForObject(sql, Integer.class);
        return numOfCars;
    }

    @Override
    public String update(PDog dog){
        String sql="update dogs_tbl set name=?,color=?,price=? where did=?";
        Object[] data=new Object[]{dog.getName(),dog.getColor(),dog.getPrice(),dog.getDid()};
        jdbcTemplate.update(sql,data);
        return "success";
    }

    @Override
    public List<PDog> findDogs() {
        String sql="select did,name,color,price,doe from dogs_tbl";
        List<PDog> dogsList=jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(PDog.class));
         return dogsList;
    }

    @Override
    public String deleteById(int did) {
        String sql="delete from dogs_tbl where did = "+did;
        int rows=jdbcTemplate.update(sql);
        return rows>0?"success":"fail";
    }

}
