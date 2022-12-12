package com.springboot.reactive.asssignment3.repository;

import com.springboot.reactive.asssignment3.entity.Job;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface JobRepository extends ReactiveCassandraRepository<Job,Integer> {

    @AllowFiltering
    Mono<Boolean> existsByjobId(int jobId);
    @AllowFiltering
    Flux<Job> findByjobId(int jobId);

}
