package com.sda.springstarter.demo.interfaces;

import java.util.List;
import java.util.Set;

public interface GenericService<T extends ModelEntity> {

    T getBy(int id);
    List<T> getAll();
    void save(T entity);
    void saveAll(Set<T> entities);

}
