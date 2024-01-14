package testes.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import metodos.MetodosDeTestes;

public class Testes {

	MetodosDeTestes metodo = new MetodosDeTestes();

	By username = By.id("user-name");
	By password = By.id("password");
	By btnLogin = By.id("login-button");
	By mensagensError = By.xpath("//div[@class='error-message-container error']");
	By menuBurguer = By.id("react-burger-menu-btn");
	By btnLogout = By.id("logout_sidebar_link");
	
	@Before
	public void setup() {
		metodo.abrirNavegador();
	}

	@After
	public void tearDown() {
		metodo.fecharNavegador();

	}

	@Test
	public void LoginComSucesso() {

		metodo.escrever(username, "standard_user");
		metodo.escrever(password, "secret_sauce");
		metodo.clicar(btnLogin);
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");

	}

	@Test
	public void loginComSenhaErrada() {
		metodo.escrever(username, "standard_user");
		metodo.escrever(password, "senhaErrada");
		metodo.clicar(btnLogin);
		metodo.validarTexto(mensagensError, "Epic sadface: Username and password do not match any user in this service");
		

	}

	@Test
	public void loginComUsuarioErrado() {
		metodo.escrever(username, "usuarioErrado");
		metodo.escrever(password, "secret_sauce");
		metodo.clicar(btnLogin);
		metodo.validarTexto(mensagensError, "Epic sadface: Username and password do not match any user in this service");

	}

	@Test
	public void loginComDadosEmBranco() {
		metodo.clicar(btnLogin);
		metodo.validarTexto(mensagensError, "Epic sadface: Username is required");
	}

	@Test
	public void loginComUsuarioBloqueado() {
		metodo.escrever(username, "locked_out_user");
		metodo.escrever(password, "secret_sauce");
		metodo.clicar(btnLogin);
		metodo.validarTexto(mensagensError, "Epic sadface: Sorry, this user has been locked out.");
	}
}
