package com.bitespeed.identifyms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitespeed.identifyms.entity.ContactModel;

@Repository
public interface ContactModelDao extends JpaRepository<ContactModel, Integer> {

	List<ContactModel> findAllByPhoneNumber(String phoneNumber);

	List<ContactModel> findAllByEmail(String email);

}
