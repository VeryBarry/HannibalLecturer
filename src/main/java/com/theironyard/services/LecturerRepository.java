package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by VeryBarry on 10/26/16.
 */
public interface LecturerRepository extends CrudRepository<Lecturer, Integer> {
}
