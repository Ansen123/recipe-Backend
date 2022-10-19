package com.nestdigital.Recipe.Controller;

import com.nestdigital.Recipe.Dao.RecipeDao;
import com.nestdigital.Recipe.Model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@CrossOrigin(origins = "*")
    @GetMapping("/viewRecipe")
    public List<RecipeModel> viewRecipe(){
    return (List<RecipeModel>) dao.findAll();
}
}

