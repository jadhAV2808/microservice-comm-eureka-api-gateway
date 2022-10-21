package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.models.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	
	List<Contact>list=List.of(
			new Contact(1l,"amit@gmail.com","amit",1311l),
			new Contact(1l,"surbhi@gmail.com","surbhi",1312l),
			new Contact(1l,"pooja@gmail.com","pooja",1314l)
			
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream()
				.filter(contact->contact.getUserId().equals(userId))
				.collect(Collectors.toList());
	}

}
