# Atividade 1 — Engenharia de Requisitos

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

Atualmente, os serviços acadêmicos da universidade não estão concentrados em um único ambiente. Além disso, o sistema utilizado apresenta lentidão e dificuldades de navegação. Isso acaba prejudicando os alunos, que precisam acessar diferentes áreas para consultar notas e horários, e também os professores, que não possuem uma ferramenta prática para compartilhar materiais e comunicados.

Diante dessa situação, surgiu a proposta do **Conecta Campus**, uma plataforma que pretende centralizar os principais serviços acadêmicos. A ideia é desenvolver um sistema intuitivo, ágil e seguro, permitindo que alunos, professores e funcionários da secretaria tenham acesso às informações de acordo com suas funções.

### 2. Elicitação

**Stakeholders e seus interesses**

- **Alunos:** precisam consultar notas, horários de aulas e receber informações importantes de maneira simples.
- **Professores:** necessitam de um espaço para disponibilizar materiais didáticos e enviar comunicados às turmas.
- **Secretaria e coordenação:** desejam facilitar a divulgação de eventos, notícias e informações institucionais.
- **Direção:** busca melhorar a organização dos serviços acadêmicos e garantir a proteção das informações.
- **Equipe de TI:** ficará responsável pela infraestrutura, integração e manutenção da plataforma.
- **Desenvolvedores:** precisam organizar as funcionalidades para entregar o projeto dentro do prazo estabelecido.

**Técnicas de elicitação**

**Entrevistas:** seriam realizadas conversas com representantes de cada grupo envolvido. O objetivo seria compreender as dificuldades enfrentadas atualmente e identificar quais funcionalidades realmente precisam estar presentes no novo sistema.

**Questionários:** seria disponibilizado um formulário online para alunos e professores, permitindo coletar opiniões de uma quantidade maior de usuários. As respostas ajudariam a identificar os problemas mais frequentes e as funcionalidades consideradas prioritárias.

**Observação:** outra possibilidade seria acompanhar usuários utilizando o sistema atual. Dessa forma, seria possível identificar dificuldades de navegação, etapas desnecessárias e problemas que talvez não fossem mencionados durante as entrevistas.

### 3. Análise e modelagem

**Requisitos funcionais**

- **RF01:** permitir que alunos, professores e funcionários da secretaria acessem o sistema por meio de suas credenciais institucionais.
- **RF02:** disponibilizar aos alunos a consulta de notas, organizadas por disciplina e período letivo.
- **RF03:** apresentar os horários das aulas de cada aluno.
- **RF04:** permitir o envio e a visualização de avisos destinados aos estudantes.
- **RF05:** possibilitar que professores compartilhem arquivos e links relacionados às disciplinas.
- **RF06:** permitir que professores publiquem comunicados direcionados às suas turmas.
- **RF07:** disponibilizar à secretaria uma área para cadastrar e divulgar eventos e informações acadêmicas.

**Requisitos não funcionais**

- **RNF01 (desempenho):** as páginas de notas, horários e avisos deverão carregar em até 3 segundos em pelo menos 95% das requisições, suportando até 1.000 usuários simultâneos.
- **RNF02 (segurança):** o acesso às informações acadêmicas deverá ser restrito a usuários autenticados, utilizando conexão HTTPS e encerrando a sessão após 30 minutos de inatividade.
- **RNF03 (usabilidade):** o sistema deverá apresentar uma navegação simples, permitindo que um aluno consulte suas notas em até 3 cliques após realizar o login.

### 4. Negociação (MoSCoW)

**Must (obrigatório):** login, consulta de notas, visualização de horários, recebimento de avisos, segurança e desempenho.

**Should (importante):** compartilhamento de materiais, publicação de comunicados e divulgação de eventos, além das melhorias de usabilidade.

**Could (opcional):** envio de notificações por e-mail ou push e suporte aprimorado a navegadores mais antigos.

**Won't (fora desta versão):** implementação de um chat entre alunos e professores.

**Justificativa:**

A prioridade foi garantir que as necessidades mais importantes dos estudantes fossem atendidas. Por isso, funcionalidades como consulta de notas, horários e avisos foram consideradas indispensáveis. Os requisitos de segurança e desempenho também receberam prioridade, principalmente porque o sistema atual apresenta problemas de lentidão.

As funcionalidades voltadas aos professores e à secretaria são importantes para melhorar a comunicação, mas podem ser implementadas em uma etapa posterior, sem comprometer o funcionamento inicial da plataforma.

Já o chat foi deixado para uma versão futura porque exigiria mais tempo de desenvolvimento e recursos adicionais. Como os comunicados já permitem uma forma de comunicação entre professores e alunos, não seria necessário incluir essa funcionalidade imediatamente.

### 5. Especificação

Para que os requisitos não funcionais possam ser avaliados corretamente, é necessário substituir características genéricas, como rapidez, segurança e facilidade de uso, por critérios objetivos.

**RNF01 — Desempenho:** as páginas de consulta de notas, horários e avisos deverão apresentar resposta em até 3 segundos em 95% das requisições, considerando 1.000 usuários conectados simultaneamente.

*Verificação:* realizar testes de carga utilizando ferramentas como JMeter ou k6, simulando acessos simultâneos e verificando o tempo de resposta.

**RNF02 — Segurança:** todas as áreas que apresentem informações acadêmicas deverão exigir autenticação. A comunicação deverá utilizar HTTPS/TLS, as senhas deverão ser armazenadas com hash e as sessões deverão ser encerradas após 30 minutos sem atividade.

*Verificação:* tentar acessar páginas restritas sem realizar login, verificar a proteção das senhas e executar testes de vulnerabilidade com ferramentas como OWASP ZAP.

**RNF03 — Usabilidade:** pelo menos 90% de um grupo formado por 10 usuários iniciantes deverá conseguir consultar suas notas em até 3 cliques e 60 segundos, sem receber ajuda.

*Verificação:* realizar testes práticos com usuários, registrando o tempo necessário para concluir a atividade e aplicando o questionário SUS, com pontuação mínima de 75.

### 6. Validação

**Avaliação de protótipos:** seriam criados modelos das principais telas, incluindo login, notas, horários e avisos. Alguns alunos e professores testariam esses protótipos para identificar dificuldades e sugerir melhorias antes do início da programação.

**Reunião com os envolvidos:** os requisitos seriam apresentados aos representantes dos alunos, professores, secretaria e equipe de TI. Cada grupo poderia confirmar se as funcionalidades propostas realmente atendem às suas necessidades e apontar possíveis alterações.

**Implementação de uma versão piloto:** antes de disponibilizar o sistema para toda a universidade, seria feita uma liberação inicial para um grupo reduzido de usuários. As experiências e sugestões recebidas ajudariam a corrigir problemas e aperfeiçoar a plataforma.

---

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders

**Stakeholders e suas necessidades**

- **Tutores:** desejam realizar agendamentos pelo celular e receber notificações sobre as próximas vacinas de seus animais.
- **Veterinários:** precisam acessar o histórico dos pacientes e registrar consultas, diagnósticos e tratamentos digitalmente.
- **Recepcionistas:** necessitam organizar os horários, acompanhar os agendamentos e realizar confirmações ou cancelamentos.
- **Gerência:** precisa acompanhar a quantidade de atendimentos e obter informações para avaliar o funcionamento da clínica.
- **Proprietário:** espera uma plataforma segura, prática e de fácil utilização, desenvolvida dentro do prazo de quatro meses.
- **Equipe de desenvolvimento:** deve definir um conjunto de funcionalidades que seja viável considerando o tempo e os recursos disponíveis.

**Técnicas de elicitação**

**Entrevistas:** seriam feitas entrevistas individuais com tutores, veterinários, recepcionistas e responsáveis pela gerência. Cada participante poderia apresentar suas dificuldades e explicar quais recursos considera necessários. Essa abordagem ajudaria a compreender as diferentes expectativas dos envolvidos.

**Observação:** acompanharíamos a rotina da clínica, principalmente o atendimento da recepção e o trabalho dos veterinários. Isso permitiria identificar problemas relacionados à organização dos horários e à procura por informações em fichas físicas.

**Análise documental:** seriam examinados os documentos e registros utilizados atualmente, como fichas dos animais, históricos de consultas e controles de agendamento. Essas informações serviriam de referência para estruturar os cadastros e o prontuário digital.

### 2. Análise e concepção de requisitos

**Requisitos funcionais**

- **RF01:** permitir o cadastro e a autenticação dos tutores, possibilitando também o registro dos animais com informações como nome, espécie, raça e data de nascimento.
- **RF02:** disponibilizar aos tutores a opção de marcar, alterar ou cancelar consultas pelo celular, conforme os horários disponíveis.
- **RF03:** enviar lembretes aos tutores sobre as datas de vacinação, com antecedência configurável, como sete dias.
- **RF04:** permitir que os veterinários consultem o histórico dos animais, incluindo consultas anteriores, vacinas e medicamentos utilizados.
- **RF05:** disponibilizar uma área para registrar diagnósticos, prescrições e tratamentos realizados durante os atendimentos.
- **RF06:** permitir que a recepção organize a agenda, cadastre horários disponíveis e gerencie as consultas marcadas.
- **RF07:** possibilitar que a gerência consulte relatórios com a quantidade de atendimentos realizados em determinados períodos.

**Requisitos não funcionais**

- **RNF01 (desempenho):** as operações de agendamento e consulta ao prontuário deverão apresentar respostas em até 2 segundos em pelo menos 95% das requisições.
- **RNF02 (segurança):** o acesso às informações deverá depender de autenticação e respeitar as permissões de cada perfil, utilizando comunicação criptografada.
- **RNF03 (usabilidade):** o tutor deverá conseguir realizar o agendamento de uma consulta em até 5 etapas e menos de 2 minutos, sem precisar de auxílio.

### 3. Negociação com MoSCoW

**Must (essencial):** cadastro de tutores e animais, login, agendamento de consultas, histórico dos animais, registro de atendimentos, gerenciamento da agenda, lembretes de vacinação, segurança, desempenho e usabilidade.

**Should (desejável):** geração de relatórios para acompanhamento da clínica.

**Could (opcional):** possibilidade de adicionar uma foto de identificação para cada animal.

**Won't (não será implementado inicialmente):** pagamentos diretamente pelo aplicativo e chat entre tutores e veterinários.

**Justificativa:**

As funcionalidades obrigatórias foram escolhidas porque resolvem os principais problemas da clínica, principalmente a dependência de ligações e mensagens para marcar consultas e a utilização de fichas físicas para armazenar informações dos animais.

**Pagamento pelo aplicativo:** essa funcionalidade foi adiada porque exigiria integração com serviços financeiros, além de cuidados adicionais com segurança e controle das transações. Como o prazo de desenvolvimento é de quatro meses, seria melhor manter os pagamentos presenciais inicialmente.

**Chat com veterinários:** a implementação exigiria recursos de comunicação em tempo real e maior disponibilidade dos profissionais. Como a clínica já utiliza o WhatsApp, esse canal poderá continuar sendo utilizado até que exista uma necessidade real de integrar um chat ao sistema.

**Fotos dos animais:** embora sejam interessantes para identificação, não são fundamentais para o funcionamento da clínica. Por isso, podem ser adicionadas posteriormente, caso exista disponibilidade no cronograma.

**Relatórios:** são importantes para o acompanhamento administrativo, mas não impedem a realização dos atendimentos. A clínica poderá utilizar os dados registrados no sistema e receber essa funcionalidade em uma atualização futura.

### 4. Especificação de requisitos não funcionais

Os requisitos relacionados à qualidade do sistema precisam apresentar condições que permitam verificar se os objetivos foram realmente alcançados.

**RNF01 — Desempenho:** a consulta aos horários disponíveis e ao histórico dos animais deverá ser concluída em até 2 segundos em 95% das requisições, considerando até 100 usuários simultâneos.

*Verificação:* executar testes de carga com usuários simulados e analisar os tempos de resposta das operações.

**RNF02 — Segurança:** o sistema deverá utilizar HTTPS com TLS 1.2 ou superior, armazenar senhas de forma protegida por hash e limitar o acesso conforme o perfil cadastrado. O tutor, por exemplo, somente poderá visualizar os animais vinculados à sua conta. A sessão deverá ser encerrada após 15 minutos de inatividade.

*Verificação:* realizar testes de autenticação e autorização, tentando acessar informações pertencentes a outros usuários, além de verificar a configuração de segurança da aplicação.

**RNF03 — Usabilidade:** pelo menos 90% de um grupo de 8 tutores deverá conseguir agendar uma consulta em até 5 etapas e 2 minutos, sem ajuda de terceiros.

*Verificação:* realizar testes com tutores, acompanhando o tempo de execução da tarefa e utilizando o questionário SUS, com pontuação mínima de 75.

### 5. Validação dos requisitos

**Testes com protótipos:** seriam desenvolvidos protótipos navegáveis das telas de agendamento, prontuário e gerenciamento da agenda. Cada grupo de usuários testaria as funcionalidades relacionadas à sua rotina. Assim, seria possível perceber informações ausentes, dificuldades de utilização e diferenças entre aquilo que foi solicitado e o que realmente é necessário.

**Reunião para revisão:** os requisitos e suas prioridades seriam apresentados ao proprietário, aos veterinários, à recepção e à gerência. Durante a reunião, cada funcionalidade seria analisada para confirmar se está de acordo com as expectativas da clínica.

**Definição de critérios de aceitação:** cada requisito deverá possuir uma condição que permita verificar seu funcionamento. Também será importante identificar qual stakeholder solicitou cada funcionalidade, facilitando futuras alterações e evitando a inclusão de recursos sem necessidade comprovada.

### 6. Desafio — Priorização da primeira versão

Considerando o orçamento disponível para desenvolver somente cinco funcionalidades, foram selecionadas as seguintes:

### 1) Cadastro e autenticação de tutores e animais

- **Necessidade:** manter os dados dos responsáveis e de seus animais organizados em um único ambiente.
- **Beneficiados:** tutores, veterinários e recepcionistas.
- **Justificativa:** essa funcionalidade é a base do sistema, pois permite identificar os usuários e relacionar cada animal ao seu responsável.

### 2) Agendamento de consultas pelo celular

- **Necessidade:** permitir que os tutores marquem consultas sem precisar entrar em contato diretamente com a recepção.
- **Beneficiados:** principalmente os tutores e os funcionários da recepção.
- **Justificativa:** reduz a dependência de ligações e mensagens, tornando o processo mais rápido e acessível.

### 3) Gerenciamento da agenda pela recepção

- **Necessidade:** organizar os horários disponíveis, acompanhar consultas e realizar confirmações ou cancelamentos.
- **Beneficiados:** recepcionistas, veterinários e tutores.
- **Justificativa:** complementa o agendamento realizado pelos tutores e ajuda a evitar conflitos de horários.

### 4) Histórico e prontuário dos animais

- **Necessidade:** armazenar informações sobre consultas, vacinas, diagnósticos e tratamentos.
- **Beneficiados:** veterinários e tutores.
- **Justificativa:** substitui os registros em papel e facilita o acesso às informações importantes durante os atendimentos, contribuindo para um acompanhamento mais organizado.

### 5) Lembretes de vacinação

- **Necessidade:** avisar os tutores quando estiver próximo o período de vacinação dos animais.
- **Beneficiados:** tutores, animais e a própria clínica.
- **Justificativa:** ajuda a evitar atrasos nas vacinas, melhora o acompanhamento dos animais e incentiva o retorno dos clientes.

### Riscos de deixar outras funcionalidades para depois

- **Relatórios administrativos:** a gerência terá que continuar realizando parte do acompanhamento manualmente. Uma alternativa seria permitir a exportação dos registros para facilitar a consulta até que os relatórios completos sejam implementados.
- **Pagamento pelo aplicativo:** os clientes continuarão realizando os pagamentos presencialmente. Isso pode representar menos praticidade, mas não impede o funcionamento dos serviços principais.
- **Chat com veterinários:** os tutores continuarão utilizando canais externos, como o WhatsApp, para tirar dúvidas. As conversas não ficarão centralizadas na plataforma.
- **Fotos dos animais:** a identificação visual ficará limitada às informações textuais cadastradas. Apesar disso, o atendimento e o controle dos prontuários não serão prejudicados.

**Conclusão:** a primeira versão do PetCare deverá concentrar seus esforços nas funcionalidades que facilitam o atendimento e a organização da clínica. Com o cadastro, agendamento, controle de horários, prontuário e lembretes de vacinação, será possível resolver os principais problemas identificados. Os recursos adicionais poderão ser desenvolvidos posteriormente, conforme as necessidades dos usuários e a disponibilidade de recursos.
