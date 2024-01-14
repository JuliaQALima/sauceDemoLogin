package testes.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class LogoutTeste {

	MetodosDeTestes metodo = new MetodosDeTestes();
	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	By menuBurguer = By.id("react-burger-menu-btn");
	By btnLogout = By.id("logout_sidebar_link");

	
	@Before
	public void setup() {
		metodo.abrirNavegador();
		metodo.escrever(username, "user-name");
		metodo.escrever(password,"password");
		metodo.clicar(btnLogin);
		

	}

	@After
	public void tearDown() {
		metodo.fecharNavegador();
	}

	@Test
	public void LogoutTest() {
		metodo.clicar(menuBurguer);
		metodo.clicar(btnLogout);
		metodo.validarUrl("https://www.saucedemo.com/");
	
	}
}
