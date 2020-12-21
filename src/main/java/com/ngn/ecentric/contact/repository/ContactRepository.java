package com.ngn.ecentric.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngn.ecentric.contact.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
