package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Provider;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, String> {

	List<Provider> findByfirstName(String firstName);

	List<Provider> findBylastName(String lastName);

}
