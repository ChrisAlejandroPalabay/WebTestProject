package com.Chris.WebTestProject.dao;

import com.Chris.WebTestProject.model.Car;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    List<T> list();

    void create(Car t);

    Optional<T> get(int id);

    void update(T t,int id);

    void delete(int id);

}
