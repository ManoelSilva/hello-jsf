package br.edu.uni7.tecnicas.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LogonBean {

	private String userName;
	private String password;
	private Integer attempt = 0;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAttempt() {
		return attempt;
	}

	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}

	public String authenticate() {
		String next = "logon";

		if (attempt < 2) {
			if ("admin".equals(userName) && "123".equals(password)) {
				next = "home";
			} else {
				attempt++;
			}
		} else {
			next = "proibido";
		}

		return next;
	}

}
