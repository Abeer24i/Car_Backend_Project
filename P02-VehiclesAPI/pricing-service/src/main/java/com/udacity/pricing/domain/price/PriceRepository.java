package com.udacity.pricing.domain.price;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(collectionResourceRel = "prices", path = "prices")
public interface PriceRepository extends CrudRepository<Price, Long> {
}