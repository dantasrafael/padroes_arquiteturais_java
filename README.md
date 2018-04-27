"# padroes_arquiteturais" 

----------------------------------------------------------------------------------------------------------------------------------
                                                        ABSTRACT FACTORY
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

Deve-se aplicá-lo quando:
* Um sistema for independente de como seus produtos são criados, compostos e representados.
* Um sistema for configurado com uma entre várias famílias de produtos.
* Uma família de produtos relacionados for projetada para uso conjunto e você for implementar essa restrição.
* Quiser fornecer uma biblioteca de classes e revelar sua interface e não sua implementação.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                            ADAPTER
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Converter a interface de uma classe em outra interface esperada pelos clientes. O Adapter permite que certas classes trabalhem em conjunto, pois de outra forma seria impossível, devido às suas interfaces incompatíveis.

Deve-se aplicá-lo quando:
* Quiser usar uma classe existente, mas sua interface não corresponde à interface de que necessita.
* Quiser criar uma classe reutilizável que coopere com classes não relacionadas ou não previstas, ou seja, classes que não necessariamente tenham interfaces compatíveis.
* (somente para adaptadores de objetos) Precisar usar várias subclasses existentes, porém, for impraticável adaptar essas interfaces criando subclasses para cada uma. Um Adaptor de objeto pode adaptar a interface da sua classe mãe. 
 
----------------------------------------------------------------------------------------------------------------------------------
                                                              BUILDER
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.

Deve-se aplicá-lo quando:
* O algoritmo para criação de um objeto complexo for independente das partes que compõem o objeto e dependendo de como elas são montadas.
* O processo de construção permitir diferentes representações para o objeto que for construído.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                        CHAIN OF RESPONSABILITY
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Evitar o acoplamento do remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a chance de tratar a solicitação, ou seja, encadeia os objetos receptores e passa a solicitação ao longo da cadeia até que um objeto a trate.

Deve-se aplicá-lo quando:
* Mais de um objeto pode tratar uma solicitação e o objeto que o tratará não é conhecido a priori. O objeto que trata a solicitação deve ser escolhido automaticamente.
* Quiser emitir uma solicitação para um dentre vários objetos, sem especificar explicitamente o receptor.
* O conjunto de objetos que pode tratar uma solicitação deverá ser especificado dinamicamente.

----------------------------------------------------------------------------------------------------------------------------------
                                                            COMMAND
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Encapsular uma solicitação como um objeto e, dessa forma, permitindo que você parametrize clientes com diferentes solicitações, enfileire ou registre solicitações e suporte operações que podem ser desfeitas.

Deve-se aplicá-lo quando:
* Parametrizar objetos por uma ação a ser executada.
* Especificar, enfileirar e executar solicitações em tempos diferentes.
* Suportar desfazer operações.
* Suportar o registro (logging) de mudanças de maneiras que possam ser reaplicadas no caso de uma queda de sistema.
* Estruturar um sistema em torno de operações de alto nível construídas sobre operações primitivas.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                              COMPOSITE
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Compor objetos em estrutura de árvore para representar hierarquias do tipo partes-todo. O Composite permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.

Deve-se aplicá-lo quando:
* Quiser representar hierarquias partes-todo de objetos.
* Quiser que os clientes sejam capazes de ignorar a diferença entre composições de objetos e objetos individuais.
* Os clientes tratarem todos os objetos na estrutura composta de maneira uniforme.

----------------------------------------------------------------------------------------------------------------------------------
                                                              DECORATE
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Atribuir responsabilidades adicionais a um objeto dinamicamente. Os decorators fornecem uma alternativa flexível a subclasses para extensão da funcionalidade.

Deve-se aplicá-lo quando:
* For para acrescentar responsabilidades a objetos individuais de forma dinâmica e transparente, ou seja, sem afetar outros objetos.
* For para responsabilidades que podem ser removidas.
* A extensão através do uso de subclasses não for prática.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                                FACADE
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Fornecer uma interface unificada para um conjunto de interfaces em um subsistema. O Facade define uma interface de nível mais alto que torna o subsistema mais fácil de usar.

Deve-se aplicá-lo quando:
* Se deseja fornecer uma interface mais simples para um subsistema complexo.
* Existirem muitas dependências entre clientes e classes de implementação de uma abstração.
* Se deseja estruturar os subsistemas em camadas.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                          FACTORY METHOD
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Definir uma interface para criar um objeto, embora deixe as subclasses decidirem qual classe instanciar. O padrão Factory Method permite a uma classe postergar a instanciação às subclasses.

Deve-se aplicá-lo quando:
* Uma classe não puder antecipar a classe de objetos que for criada.
* Uma classe quiser que suas subclasses especifiquem os objetos que ela cria.
* As classes delegarem responsabilidades para uma dentre várias subclasses auxiliares, e se deseja localizar o conhecimento de qual subclasse auxiliar implementa a delegação.

----------------------------------------------------------------------------------------------------------------------------------
                                                           FLYWEIGHT
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Usa compartilhamento para suportar grandes quantidades de objetos, de granularidade fina, de maneira eficiente.

Deve-se aplicá-lo quando:
* A aplicação utilizar um grande número de objetos.
* Os custos de armazenamento forem altos por causa da grande quantidade de objetos.
* A maioria dos estados de objetos se tornar extrínseca.
* Muitos grupos de objetos puderem ser substituídos por relativamente poucos objetos compartilhados, uma vez que estados extrínsecos são removidos.
* A aplicação não depender da identidade dos objetos, uma vez que objetos flyweights podem ser compartilhados, testes de identidade produzirão o valor verdadeiro para objetos conceitualmente distintos.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                       FRONT CONTROLLER
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Ser usado como o ponto inicial de contato para tratar todas as solicitações relacionadas. Ele centraliza a lógica de controle, a qual, de outro modo, poderia ser duplicada, e gerencia as atividades de tratamento de solicitações.

Deve-se aplicá-lo quando:
* Se deseja evitar que a lógica de controle seja duplicada.
* Se deseja aplicar uma lógica comum a diversas solicitações.
* Se deseja separar a lógica de processamento do sistema da visualização.
* Se deseja centralizar os pontos de acesso controlados no sistema.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                          INTERATOR
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Fornecer uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação subjacente.

Deve-se aplicá-lo quando:
* For acessar os conteúdos de um objeto agregado sem expor sua representação interna.
* For suportar múltiplos percursos de objetos agregados.
* For fornecer uma interface uniforme que percorra diferentes estruturas agregadas (ou seja, para suportar a iteração polimórfica).
 
----------------------------------------------------------------------------------------------------------------------------------
                                                          INTERPRETER
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Usa compartilhamento para suportar grandes quantidades de objetos, de granularidade fina, de maneira eficiente.

Deve-se aplicá-lo quando:
* A aplicação utilizar um grande número de objetos.
* Os custos de armazenamento forem altos por causa da grande quantidade de objetos.
* A maioria dos estados de objetos se tornar extrínseca.
* Muitos grupos de objetos puderem ser substituídos por relativamente poucos objetos compartilhados, uma vez que estados extrínsecos são removidos.
* A aplicação não depender da identidade dos objetos, uma vez que objetos flyweights podem ser compartilhados, testes de identidade produzirão o valor verdadeiro para objetos conceitualmente distintos.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                          MEDIATOR
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Definir um objeto que encapsula como um conjunto de objetos interage. O mediator promove o acoplamento fraco ao evitar que os objetos se refiram explicitamente uns aos outros, permitindo que se varie suas interações independentemente.

Deve-se aplicá-lo quando:
* Um conjunto de objetos se comunica de maneiras bem-definidas, porém complexas. As interdependências resultantes são desestruturadas e difíceis de entender.
* A reutilização de um objeto é difícil porque ele referencia e se comunica com muitos outros objetos.
* Um comportamento que está distribuído entre várias classes deveria ser customizável, ou adaptável, sem excessiva especialização em subclasses.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                            MEMENTO
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Sem violar a encapsulação, capturar e externalizar um estado interno de um objeto, de modo que o mesmo possa, posteriormente, ser restaurado para esse estado.

Deve-se aplicá-lo quando:
* Um instantâneo de (alguma porção do) estado de um objeto deve ser salvo de maneira que possa ser restaurado para esse estado mais tarde.
* Uma interface direta para obtenção do estado expõe detalhes de implementação e romperia o encapsulamento do objeto.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                            OBSERVER
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Definir uma dependência um-para-muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados.

Deve-se aplicá-lo quando:
* Uma abstração tem dois aspectos, um dependente do outro. Encapsulando esses aspectos em objetos separados, permite-se variá-los e reutilizá-los independentemente.
* Uma mudança em um objeto exige mudanças em outros, e você não sabe quantos objetos necessitam ser mudados.
* Um objeto deveria ser capaz de notificar outros objetos sem fazer hipóteses, ou usar informações,
sobre quem são esses objetos. Em outras palavras, quando não se deseja que esses objetos sejam fortemente acoplados.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                            PROTOTYPE
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Especificar os tipos de objetos a serem criados usando uma instância prototípica e criar novos objetos copiando este protótipo.

Deve-se aplicá-lo quando:
* As classes a instanciar forem especificadas em tempo de execução.
* Se deseja evitar a construção de uma hierarquia de classes de fábricas paralela à hierarquia de classes de produto.
* As instâncias de uma classe puderem ter uma dentre poucas combinações diferentes de estados. 

----------------------------------------------------------------------------------------------------------------------------------
                                                            PROXY
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Fornecer um objeto representante, ou um marcador de outro objeto, para controlar o acesso ao mesmo.

Deve-se aplicá-lo quando:
* A aplicação utilizar um grande número de objetos.
* Um remote proxy fornecer um representante local para um objeto num espaço de endereçamento diferente.
* Um virtual proxy criar objetos caros sob demanda.
* Um protection proxy controlar o acesso ao objeto original.
* Um smart reference for um substituto para um simples pointer que executa ações adicionais quando um objeto é acessado.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                          SINGLETON
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Garantir que uma classe tenha somente uma instância e fornecer um ponto global de acesso para ela.

Deve-se aplicá-lo quando:
* Houver apenas uma instância de uma classe, e essa instância tiver que dar acesso aos clientes através de um ponto bem conhecido.
* A única instância tiver que ser extensível através de subclasses, possibilitando aos clientes usar uma instância estendida sem alterar o seu código.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                            STATE
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Permitir que objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado sua classe.

Deve-se aplicá-lo quando:
* O comportamento do objeto depende do seu estado e ele pode mudar seu comportamento em tempo e execução, dependendo desse estado.
* As operações têm comandos condicionais grandes, de várias alternativas, que dependem do estado do objeto. Esse estado é, normalmente, representado por uma ou mais constantes enumeradas. Frequentemente, várias operações conterão essa mesma estrutura condicional. O padrão state coloca cada ramo do comando adicional em uma classe separada. Isso lhe permite tratar o estado do objeto como um objeto propriamente dito, que pode variar independentemente de outro objetos. 
 
----------------------------------------------------------------------------------------------------------------------------------
                                                            STRATEGY
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Definir uma família de algoritmos, encapsular cada um deles e fazê-los intercambiáveis. O strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.

Deve-se aplicá-lo quando:
* Muitas classes relacionadas diferem somente no seu comportamento. As estratégias fornecem uma maneira de configurar uma classe com um dentre muitos comportamentos.
* Você necessita de variantes de um algoritmo. Por exemplo, pode definir algoritmos que refletem diferentes soluções de compromisso entre espaço/tempo.
* As estratégias podem ser usadas quando essas variantes são implementadas como uma hierarquia de classes de algoritmos.
* Um algoritmo usa dados dos quais os clientes não deveriam ter conhecimento. Use o padrão strategy para evitar a exposição das estruturas de dados complexas, específicas do algoritmo.
* Uma classe define muitos comportamentos e aparecem em suas operações como múltiplos comandos condicionais da linguagem. Em vez de usar muitos comandos condicionais, mova os ramos condicionais relacionados para sua própria classe strategy.
 
----------------------------------------------------------------------------------------------------------------------------------
                                                        TEMPLATE METHOD
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Definir um esqueleto de um algoritmo em uma operação postergando a definição de alguns passos para subclasses. O template method permite que as sublcasses redefinam certos passos de um algoritmo sem mudar sua estrutura.

Deve-se aplicá-lo quando:
* For implementar as partes invariantes de um algoritmo uma só vez e deixar para as subclasses a implementação do comportamento que pode variar.
* O comportamento comum entre subclasses deve ser fatorado e concentrado numa classe comum para evitar duplicação de código.
* For controlar extensões de subclasses. Você definir um método template que chama operações “gancho” em pontos específicos, permitindo, dessa forma, extensões somente nesses pontos.

----------------------------------------------------------------------------------------------------------------------------------
                                                          VISITOR
----------------------------------------------------------------------------------------------------------------------------------
Objetivo: Representar uma operação a ser executada sobre os elementos da estrutura de um objeto. O visitor permite que você defina uma nova operação sem mudar as classes dos elementos sobre os quais opera.
           
Deve-se aplicá-lo quando:
* Uma estrutura de objetos contém muitas classes de objetos com interfaces que diferem, e quando deseja-se executar operações sobre esses objetos que dependem das suas classes concretas.
* Muitas operações distintas e não relacionadas necessitam ser executadas sobre objetos de uma estrutura de objetos,  e deseja-se evitar “a poluição” das suas classes com essas operações. O Visitor permite manter juntas operações relacionadas, definindo-as em uma única classe. Quando a estrutura do objeto for compartilhada por muitas aplicações, use visitor para pôr operações somente naquelas aplicações que as necessitam.
* As classes que definem a estrutura do objeto raramente mudam, porém, frequentemente deseja-se definir novas operações sobre a estrutura. A mudança das classes da estrutura do objeto requer a redefinição da interface para todos os visitantes, o que é potencialmente oneroso. Se as classes da estrutura do objeto mudam com frequência, provavelmente é melhor definir as operações nessas classes.
