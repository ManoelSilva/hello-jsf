package br.edu.uni7.tecnicas.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {

	private String name;
	private String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void execute() {
		if (name.equals("Júlia"))
			message = "Olá " + name + " eu te amo!!!";
		else
			message = "Olá " + name + "!!!";
	}

}
