package com.nelioalves.workshopMongo.Domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection="user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private String id;
    private String name;
    private String email;
}
