package com.jirafik.cats.repository;

import com.jirafik.cats.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, String> {

}
