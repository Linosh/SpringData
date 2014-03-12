package com.home.dy.repo;

import com.home.dy.entities.Dummy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Project: SpringData
 * Author: Yermiichuk Dmitrii
 * Date: 3/11/14
 */
public interface DummyDao extends CrudRepository <Dummy, String> {
	List<Dummy> findAllByNameIn(String... name);
}
