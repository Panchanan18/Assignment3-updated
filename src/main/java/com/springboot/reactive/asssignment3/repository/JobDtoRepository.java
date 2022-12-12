package com.springboot.reactive.asssignment3.repository;

import com.springboot.reactive.asssignment3.entity.Job;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface JobDtoRepository extends ReactiveCassandraRepository<Job,Integer> {


    @AllowFiltering
    Mono<Job> findByjobId(int jobId);
}
