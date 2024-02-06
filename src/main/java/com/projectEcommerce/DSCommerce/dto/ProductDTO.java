package com.projectEcommerce.DSCommerce.dto;

import com.projectEcommerce.DSCommerce.entities.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDTO {

        private Long id;

        @Size(min = 3, max = 50, message = "Nome de 3 a 80 caracteres")
        @NotBlank(message = "Campo requerido")
        private String name;

        @Size(max = 50, message = "Maximo 50 caracteres")
        @NotBlank(message = "Campo requerido")
        private String description;
        private Double price;
        private String imgUrl;

//        public ProductDTO() {}

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
