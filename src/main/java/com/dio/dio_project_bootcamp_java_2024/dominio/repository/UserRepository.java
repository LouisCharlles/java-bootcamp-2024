package com.dio.dio_project_bootcamp_java_2024.dominio.repository;

import com.dio.dio_project_bootcamp_java_2024.dominio.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
