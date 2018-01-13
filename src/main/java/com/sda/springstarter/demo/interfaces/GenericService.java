package com.sda.springstarter.demo.interfaces;

import java.util.List;

public interface GenericService<T extends ModelEntity> {

    List<T> getAll();
    void save(T entity);

}
