package com.example.OnlinePizzaManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlinePizzaManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>
{

}
