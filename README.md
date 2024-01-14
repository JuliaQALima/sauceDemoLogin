Bem-vindo ao projeto de automação de login na SauceDemo! Este projeto utiliza as poderosas ferramentas Selenium, JUnit e WebDriver para automatizar o processo de login em uma aplicação web. O foco principal é testar diversas situações de login, proporcionando uma cobertura abrangente e garantindo a robustez do sistema.

Possibilidades Testadas:

Login com Sucesso:

Verificamos a capacidade do sistema de aceitar credenciais corretas e redirecionar o usuário para a área restrita após um login bem-sucedido.
Login com Senha Errada:

Testamos como o sistema lida com senhas incorretas, garantindo que uma mensagem de erro apropriada seja exibida e que o acesso seja negado.
Login com Usuário Errado:

Avaliamos a resposta do sistema a tentativas de login com nomes de usuário inválidos, assegurando que a aplicação trate essa situação de maneira adequada.
Login com Dados em Branco:

Testamos a capacidade do sistema de validar campos vazios, assegurando que mensagens de erro sejam exibidas e que o login não seja permitido sem dados válidos.
Login com Usuário Bloqueado:

Verificamos como o sistema responde a tentativas de login com contas bloqueadas, garantindo que usuários bloqueados não possam acessar a aplicação.
Características Adicionais:

Relatórios Detalhados: Utilizamos o JUnit para gerar relatórios detalhados, permitindo uma fácil identificação e resolução de problemas.

Ambiente de Teste Controlado: Configuramos ambientes de teste controlados para garantir a reprodutibilidade dos resultados.

Manutenibilidade: O código é estruturado de forma modular, facilitando a manutenção e a adição de novos casos de teste.

Integração Contínua: Integrado com sistemas de integração contínua para execução automática de testes sempre que há alterações no código-fonte.

Como Executar os Testes:

Clone o repositório em sua máquina local.
Configure o ambiente de teste com as dependências necessárias.
Execute os testes usando a suite do JUnit.
Este projeto visa garantir a qualidade e a confiabilidade do processo de login na SauceDemo, proporcionando uma automação eficiente e abrangente para diversas situações. Sinta-se à vontade para explorar, contribuir e expandir este projeto!
