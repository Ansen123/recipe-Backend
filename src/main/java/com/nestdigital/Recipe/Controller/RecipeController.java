package com.nestdigital.Recipe.Controller;

import com.nestdigital.Recipe.Dao.RecipeDao;
import com.nestdigital.Recipe.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
@Autowired
    private RecipeDao dao;
@CrossOrigin(origins = "*")
    @PostMapping(path = "/addRecipe",consumes = "application/json",produces = "application/json")
public String recipe(@RequestBody RecipeModel recipe){
    dao.save(recipe);
    return "{status:'Success'}";
}
}

