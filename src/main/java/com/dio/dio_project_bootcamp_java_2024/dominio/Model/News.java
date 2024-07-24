package com.dio.dio_project_bootcamp_java_2024.dominio.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tb_news")
public class News extends BaseItem{

}
