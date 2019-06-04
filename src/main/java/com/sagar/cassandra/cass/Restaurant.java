package com.sagar.cassandra.cass;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Data
@AllArgsConstructor
public class Restaurant {

    @PrimaryKey
    private UUID id;
    private String name;
    private String address;
    private int rank;
    private boolean isApproved;
}
