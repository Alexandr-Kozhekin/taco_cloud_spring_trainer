package sia.tacocloud.tacos.core.repository;

import org.springframework.data.repository.CrudRepository;

import sia.tacocloud.tacos.core.domain.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

//    Iterable<Ingredient> findAll();
//
//    Optional<Ingredient> findById(String id);
//
//    Ingredient save(Ingredient ingredient);

}
