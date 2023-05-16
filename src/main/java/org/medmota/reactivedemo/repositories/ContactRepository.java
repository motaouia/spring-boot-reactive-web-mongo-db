package org.medmota.reactivedemo.repositories;

import org.medmota.reactivedemo.entities.Contact;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

@Repository
public interface ContactRepository extends ReactiveMongoRepository<Contact, String> {

	Mono<Contact> findFirstByEmail(String email);

	Mono<Contact> findAllByPhoneOrName(String phoneOrName);
}
