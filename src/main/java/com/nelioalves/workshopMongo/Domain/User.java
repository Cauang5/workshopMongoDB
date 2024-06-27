package com.nelioalves.workshopMongo.Domain;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    @EqualsAndHashCode.Include
    private String id;
    private String name;
    private String email;
}
