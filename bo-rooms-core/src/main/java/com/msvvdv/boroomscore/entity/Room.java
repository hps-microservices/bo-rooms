package com.msvvdv.boroomscore.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
@Document(collection = "movie")
public class Room {
    @Id
    @Field("_id")
    private String idMongo;
    @Setter
    private Long id;
    private String name;
    private String gender;

}
