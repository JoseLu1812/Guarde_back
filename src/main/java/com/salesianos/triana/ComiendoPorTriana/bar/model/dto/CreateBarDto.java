package com.salesianos.triana.ComiendoPorTriana.bar.model.dto;

import com.salesianos.triana.ComiendoPorTriana.bar.model.Bar;
import com.salesianos.triana.ComiendoPorTriana.user.model.User;
import lombok.*;

import javax.persistence.Column;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CreateBarDto {


    private String name;

    private String description;

    private User owner;

    private String direction;

    private List<String> images;


    public static Bar toBar(CreateBarDto dto) {

        return Bar.builder()
                .name(dto.getName())
                .description(dto.getDescription())
                .owner(dto.getOwner())
                .direction(dto.getDirection())
                .images(dto.getImages())
                .build();
    }





}
