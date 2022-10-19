package com.nestdigital.Recipe.Dao;

import com.nestdigital.Recipe.Model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
