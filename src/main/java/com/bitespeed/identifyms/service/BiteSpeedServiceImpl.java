package com.bitespeed.identifyms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitespeed.identifyms.constant.Constant;
import com.bitespeed.identifyms.dao.ContactModelDao;
import com.bitespeed.identifyms.entity.Contact;
import com.bitespeed.identifyms.entity.ContactModel;
import com.bitespeed.identifyms.entity.Request;
import com.bitespeed.identifyms.entity.Response;

@Service
public class BiteSpeedServiceImpl implements IBiteSpeedService {

	@Autowired
	private ContactModelDao contactDao;

	@Override
	public Response getDetails(Request request) {

		List<ContactModel> contactPhoneNumberList = contactDao.findAllByPhoneNumber(request.getPhoneNumber());

		List<ContactModel> contactEmailList = contactDao.findAllByEmail(request.getEmail());

		Response res = new Response();

		Contact contact = new Contact();

		for (ContactModel model : contactPhoneNumberList) {

			if (model.getLinkPrecedence().equalsIgnoreCase("Primary")) {
				contact.setPrimaryContatctId(model.getId());
			}

			if (!contact.getPhoneNumbers().contains(model.getPhoneNumber())) {
				contact.setPhoneNumbers(model.getPhoneNumber());
			}

			if (!contact.getEmails().contains(model.getEmail())) {
				contact.setEmails(model.getEmail());
			}

			if (model.getLinkPrecedence().equalsIgnoreCase("Secondary")) {
				contact.setSecondaryContactIds(model.getId());
			}

		}

		for (ContactModel mailModel : contactEmailList) {
			if (mailModel.getLinkPrecedence().equalsIgnoreCase(Constant.PRIMARY)) {
				contact.setPrimaryContatctId(mailModel.getId());
			}

			if (!contact.getPhoneNumbers().contains(mailModel.getPhoneNumber())) {
				contact.setPhoneNumbers(mailModel.getPhoneNumber());
			}

			if (!contact.getEmails().contains(mailModel.getEmail())) {
				contact.setEmails(mailModel.getEmail());
			}

			if (mailModel.getLinkPrecedence().equalsIgnoreCase(Constant.SECONDARY)
					&& !contact.getSecondaryContactIds().contains(mailModel.getId())) {
				contact.getSecondaryContactIds().add(mailModel.getId());
			}
		}

		res.setContact(contact);

		return res;

	}

}
