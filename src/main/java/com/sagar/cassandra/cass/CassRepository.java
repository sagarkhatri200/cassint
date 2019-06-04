package com.sagar.cassandra.cass;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CassRepository extends CassandraRepository<Restaurant, UUID> {
}
