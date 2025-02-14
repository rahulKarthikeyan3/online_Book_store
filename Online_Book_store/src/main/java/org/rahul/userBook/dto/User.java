package org.rahul.userBook.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false, unique = true)
	private long phone;
	@OneToMany(mappedBy = "user")
	private List<Book> book;

	public String toString() {
		return "User [User_id=" + user_id + ", User_Name=" + username + "," + " phone=" + phone + ", email=" + email
				+ ",address=" + address + ", password=" + password + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

}
