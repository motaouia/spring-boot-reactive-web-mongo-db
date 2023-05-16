package org.medmota.reactivedemo.entities;

import java.util.Objects;
import java.util.StringJoiner;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {

	@Id
	private String id;
	private String name;
	private String email;
	private String phone;

	public Contact() {
		super();
	}

	public Contact(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Contact contact = (Contact) o;
		return Objects.equals(id, contact.id) && Objects.equals(name, contact.name)
				&& Objects.equals(email, contact.email) && Objects.equals(phone, contact.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Contact.class.getSimpleName() + "[", "]").add("id='" + id + "'")
				.add("name='" + name + "'").add("email='" + email + "'").add("phone=" + phone).toString();
	}

}
