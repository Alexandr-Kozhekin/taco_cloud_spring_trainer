package sia.tacocloud.tacos.core.domain;

import jakarta.validation.constraints.*;

import java.util.*;

import lombok.Data;

@Data
public class Taco {

    private Long id;

    private Date createdAt = new Date();
    @NotNull
    @Size(min = 5, message="Name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<IngredientRef> ingredients;

}
