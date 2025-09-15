import java.util.Scanner;

public class desafiogolpe {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Se previna dos Golpes!");
        System.out.println("1. Atuação do Banco Central na prevenção de golpes e fraudes\n" +
                "2. Dicas gerais para evitar golpes\n" +
                "3. Vítima fez um Pix e caiu em um golpe\n" +
                "4. Vítima do golpe do \"presente\"\n" +
                "5. Vítima fez uma TED e caiu em um golpe\n" +
                "6. Vítima fez compra com cartão e caiu em golpe\n" +
                "7. Vítima pagou um boleto e caiu em um golpe\n" +
                "8. Banco do golpista detecta que não há dinheiro na conta dele\n" +
                "9. Vítima não reconhece uma compra com seu cartão\n" +
                "10. Vítima não reconhece uma compra em maquininha de cartão\n" +
                "11. Vítima caiu no golpe do falso entregador/motoboy\n" +
                "12. Cuidado com ligações de falsas centrais de atendimento\n" +
                "13. Golpes envolvendo Valores a Receber\n" +
                "14. Medidas para evitar golpes envolvendo empréstimo\n" +
                "15. Golpes envolvendo o nome do Banco Central\n" +
                "16. Golpes envolvendo mensagem Swift ou títulos do Tesouro\n" +
                "17. Golpes contra prefeituras\n" +
                "18. Golpes envolvendo o Meu BC\n");
        while (true) {
        System.out.println("digite o numero correspondente para ver mais\n");
        int opcao = leitor.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O Conselho Monetário Nacional (CMN) e o Banco Central (BC), em geral, não disciplinam procedimentos específicos de segurança relativos a golpes e fraudes, inclusive alertas emitidos pelas instituições autorizadas, levando em consideração as peculiaridades delas.\n" +
                        "\n" +
                        "Mas, o BC segue fomentando e as instituições autorizadas trabalham para implementar mecanismos adicionais de segurança aos produtos e serviços financeiros oferecidos à população, que dificultem e reduzam o incentivo ao cometimento de golpes e fraudes. Como, por exemplo:\n" +
                        "\n" +
                        "Garantir que, ao abrir uma conta, haja procedimentos e controles para verificar a identidade do cliente e a autenticidade das suas informações;\n" +
                        "Buscar a integridade, a confiabilidade, a segurança e o sigilo das transações realizadas na contratação de operações e na prestação de serviços; e\n" +
                        "Implementar a política de segurança cibernética para o processamento e armazenamento de dados dos clientes.\n" +
                        "Além disso, outras normas do BC foram feitas para que houvesse mais procedimentos e controles para prevenção de fraudes em casos específicos, como no serviço de pagamentos (Resolução BCB nº 142, de 2021). Também a Resolução Conjunta nº 6 e a Resolução BCB nº 343, de 2023, foram criadas para que as instituições pudessem compartilhar entre si as informações sobre indícios de ocorrência ou de tentativa de fraudes por elas identificados, por meio de sistema eletrônico, facilitando esse intercâmbio para a identificação e resolução desses casos. A Resolução BCB nº 457, de 2025, exigiu que os participantes do Pix não cadastrem chaves de pessoas e de empresas cuja situação não esteja regular na Receita Federal e excluem as já cadastradas. \u200B");
                break;
            case 2:
                System.out.println("Não transferir dinheiro a pedido de conhecidos enviado por aplicativos de mensagens (WhatsApp ou Telegram, por exemplo), principalmente para a conta de outra pessoa que não é conhecida. É indicado telefonar antes ou encontrar a pessoa, confirmando se ela realmente fez o pedido, pois também há vídeos e áudios feitos com uso de inteligência artificial que simulam a voz e imagem de pessoas;\n" +
                        "\n" +
                        "Não aceitar ajuda de estranhos para pagar contas, sacar dinheiro ou fazer outra operação em caixa eletrônico. Pedir ajuda somente a funcionários do banco, que devem estar identificados com crachá e uniforme com o nome do banco;\n" +
                        "\n" +
                        "Desconfiar de promessas de herança, doação ou prêmios em moeda estrangeira (dólar, por exemplo) e não transferir dinheiro para o exterior para receber um valor prometido;\n" +
                        "\n" +
                        "Não fornecer o cartão ou senha a outras pessoas, mesmo que conhecidas;\n" +
                        "\n" +
                        "Se ainda tiver dúvidas, consultar os canais oficiais do seu banco.");
                break;
            case 3:
                System.out.println("\n" +
                        "\u200BCaso tenha sido vítima de um golpe, o primeiro passo é entrar em contato com seu banco para relatar o caso e solicitar a devolução dos valores transferidos para o suposto golpista. Em paralelo, é recomendável registrar um Boletim de Ocorrência na autoridade policial.\n" +
                        "\n" +
                        "Com base no relato:\n" +
                        "\n" +
                        "O banco da vítima registra imediatamente a notificação de infração e instaura o Mecanismo Especial de Devolução (MED) do Pix;\n" +
                        "\n" +
                        "O banco do suposto golpista bloqueia os valores;\n" +
                        "\n" +
                        "As duas instituições avaliam o caso em até 7 dias corridos e verificam se há indícios de fraude ou golpe; e\n" +
                        "\n" +
                        "Comprovada a fraude, o banco do suposto golpista devolve os recursos para a vítima em até 96 horas, a contar do término da avaliação.\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "\n" +
                        "Registrar uma reclamação no BC: o banco para onde os recursos foram transferidos será notificado e fará o monitoramento da conta a fim de identificar transações suspeitas.\n" +
                        "\n" +
                        "A devolução de valores, via MED, não pode ser acionada em casos de desacordo comercial, por exemplo, quando o vendedor de boa-fé envia o produto errado. Esse tipo de situação não é considerado como \"suspeita de fraude\", diferentemente, por exemplo, dos casos em que o produto sequer é enviado.\n" +
                        "\n" +
                        "Atenção! Caso alguém entre em contato com você, falando que fez um Pix por engano na sua conta, mostrando um comprovante de pagamento (inclusive se for verdadeiro, mas podendo também ser falso) e pedindo a devolução, verifique primeiro seu extrato bancário. Caso exista de fato um depósito feito na sua conta, utilize a funcionalidade de devolução do Pix porque o dinheiro retornará à mesma conta do pagador. Não aceite sugestões do suposto pagador para devolver o dinheiro numa conta diferente da que fez o depósito. Isso pode ser um golpe, pois ele tentará utilizar o MED para conseguir dinheiro dobrado - o seu e o devolvido pelo banco.");
                break;
            case 4:
                System.out.println("\u200BVítima recebeu uma oferta de um produto como, por exemplo, uma cesta básica, uma renda extra de INSS ou um brinde ou um presente. O golpista pede dados pessoais ou foto do seu rosto (selfie), alegando que a informação serve para finalizar a entrega ou confirmar um cadastro. Com esses dados, o golpista abre conta ou contrata empréstimo por meio de reconhecimento facial.\n" +
                        "\n" +
                        "A vítima desse golpe deve entrar em contato imediatamente com o banco no qual a conta foi aberta ou o empréstimo foi realizado para pedir o cancelamento.\n" +
                        "\n" +
                        "Caso você desconheça o banco que foi utilizado para o golpe, você pode solicitar a emissão do Relatório de Contas e Relacionamentos em bancos (CCS), pelo Sistema Registrato.\n" +
                        "\n" +
                        " Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "Registrar uma reclamação no BC.\n" +
                        "Em paralelo, é recomendável registrar um Boletim de Ocorrência.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "\n" +
                        "Desconfiar ao receber ligação com ofertas de produtos;\n" +
                        "Não receber presentes desconhecidos de entregadores em casa;\n" +
                        "Não permitir que tirem fotos ou façam vídeos; ");
                break;
            case 5:
                System.out.println("\u200BCaso tenha sido vítima de um golpe, o primeiro passo é a vítima imediatamente entrar em contato com seu banco para relatar o caso e solicitar a devolução dos valores transferidos para o suposto golpista.\n" +
                        "\n" +
                        "Em paralelo, é recomendável registrar um Boletim de Ocorrência, informando os dados do comprovante da transação: ID da transação, valor, data/hora da liquidação, descrição (caso preenchida), nome do banco do recebedor, nome do recebedor, CPF ou CNPJ;\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "\n" +
                        "Registrar uma reclamação no BC.");
                break;
            case 6:
                System.out.println("\u200BO primeiro passo é a vítima imediatamente entrar em contato com seu banco para relatar o caso e contestar a compra realizada com cartão. Em paralelo, é recomendável registrar um Boletim de Ocorrência.\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "\n" +
                        "Registrar uma reclamação no BC.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "\n" +
                        "Sempre que possível, é importante verificar o extrato de cartão, garantindo que nada fora do habitual será cobrado indevidamente na fatura;\n" +
                        "\n" +
                        "Ativar as notificações do aplicativo do cartão para ser avisado sempre que uma nova compra é realizada;\n" +
                        "\n" +
                        "Nas compras pela internet, ter cuidado com sites e aplicativos falsos, para fazer o pagamento em um estabelecimento confiável;\n" +
                        "\n" +
                        "Desconfiar de preços muito abaixo do mercado;\n" +
                        "\n" +
                        "Pesquisar se a loja ou a empresa de leilão realmente existe;\n" +
                        "\n" +
                        "Consultar se essas empresas possuem reclamações em sites especializados ou no consumidor.gov.br.");
                break;
            case 7:
                System.out.println("\u200BAtualmente, todos os boletos emitidos por bancos são registrados conforme convenção. Isso significa que os dados dos beneficiários dos boletos sempre aparecem quando a pessoa vai pagar o boleto e que os boletos podem ser pagos em qualquer banco.\n" +
                        "\n" +
                        "Por isso, é importante:\n" +
                        "\n" +
                        "ao pagar o boleto, que a pessoa verifique se o nome do beneficiário do pagamento é uma pessoa física ou a empresa contratada, e se o banco destinatário é o mesmo que consta no boleto. Se tiver alguma informação diferente, é melhor não fazer o pagamento;\n" +
                        "desconfiar de código de barras com falhas e evitar ligar no telefone inscrito no boleto, porque pode ser do próprio golpista, esperando para passar instruções para pagar diretamente na conta dele;\n" +
                        "entrar em contato direto com a prestadora de serviços que deveria gerar o boleto, encontrando seu contato em meios oficiais, como sites, por exemplo;\n" +
                        "não imprimir o boleto fora do site ou e-mail oficial do serviço que contratou.\n" +
                        "Se a vítima pagou um boleto indevidamente, o primeiro passo é entrar em contato com seu banco para relatar o caso e contestar a compra realizada com cartão. Em paralelo, é recomendável registrar um Boletim de Ocorrência.\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "Registrar uma reclamação no BC.\n" +
                        "Atenção! Caso o documento apresente um QR Code, esse código é o QR de Pix e o pagamento por meio dele é instantâneo na conta destinatária, sem janelas de compensação de boletos (que ocorrem em dias úteis). Na prática, pagar documento com QR Code é o mesmo que fazer um Pix.");
                break;
            case 8:
                System.out.println("\u200BApós relatar o golpe sofrido, o banco da vítima instaura o Mecanismo Especial de Devolução (MED) do Pix. Comprovada a fraude, o banco do suposto golpista devolve os recursos para a vítima em até 96 horas, a contar do término da avaliação.\n" +
                        "\n" +
                        "Se não houver saldo suficiente na conta do suposto golpista para efetuar a devolução total dos valores, a instituição dele deve monitorar a conta e, surgindo recursos na conta, efetuar devoluções parciais (em até 90 dias). O banco da vítima não é obrigado a utilizar recursos próprios para devolver o montante transferido na transação original.\n" +
                        "\n" +
                        "Após o prazo de 90 dias sem que haja recursos na conta do suposto golpista, não há devolução de recursos à vítima por meio do MED.\n" +
                        "\n" +
                        "Nessas situações, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "\n" +
                        "Registrar uma reclamação no BC.");
                break;
            case 9:
                System.out.println("\u200BO primeiro passo é a vítima imediatamente entrar em contato com seu banco para relatar o caso e contestar a compra realizada com cartão. Em paralelo, é recomendável registrar um Boletim de Ocorrência. Em alguns casos, os bancos permitem a contestação da compra diretamente no extrato da fatura do cartão no internet banking.\n" +
                        "\n" +
                        "Pode ocorrer também de o próprio banco ligar para os clientes para verificar se eles reconhecem determinadas compras. Caso o cliente informe que não reconhece a compra, o banco não processa o pagamento.\n" +
                        "\n" +
                        "Atenção! Em nenhuma hipótese, o banco pede para o cliente realizar alguma ação no internet banking ou no caixa eletrônico para sustar ou impedir uma compra. Esse tipo de pedido é comum em golpe da falsa central de atendimento.\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "\n" +
                        "Registrar uma reclamação no BC.\n" +
                        "\n");
                break;
            case 10:
                System.out.println("\u200BCaso não reconheça determinada compra feita em maquininha de cartão, recomenda-se conversar com o lojista ou entrar em contato com o banco.\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "\n" +
                        "Registrar uma reclamação no BC.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "\n" +
                        "Antes de digitar a senha ou de aproximar o cartão para pagar, conferir sempre se o visor da maquininha de cartão está funcionando corretamente e se o valor digitado está correto;\n" +
                        "\n" +
                        "Desabilitar a função de pagamento por aproximação se não estiver segura com essa funcionalidade. ");
                break;
            case 11:
                System.out.println("\u200BVítima recebeu ligação falsa do banco dizendo que seu cartão foi clonado e que um motoboy, supostamente autorizado pelo banco, irá buscá-lo. O motoboy finge que destrói o cartão, mas mantem seu chip intacto. Também há casos de vítimas que são informadas de que receberão um presente em casa e que devem pagar uma taxa ao entregador. Em algumas situações, o suposto entregador pede para tirar fotos ou fazer vídeos com a vítima, utilizando esses dados para abertura de contas digitais ou contratação de empréstimo por reconhecimento facial.\n" +
                        "\n" +
                        "A vítima desse golpe deve entrar em contato imediatamente com seu banco para pedir o cancelamento do cartão. Além disso, se pagou alguma taxa, deve pedir ao banco para solicitar o dinheiro de volta.\n" +
                        "\n" +
                        "Se a situação não for resolvida, a vítima pode:\n" +
                        "\n" +
                        "Procurar o Procon de seu estado ou o Poder Judiciário; ou \n" +
                        "Registrar uma reclamação no BC.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "Desconfiar ao receber ligação do banco, dizendo que o cartão foi clonado e que um motoboy, supostamente autorizado pelo banco, irá buscá-lo. Mesmo se for em outros casos, inclusive com o cartão bloqueado;\n" +
                        "Não receber presentes desconhecidos de entregadores em casa;\n" +
                        "Não efetuar pagamento de taxas de entregas de algo que é desconhecido;\n" +
                        "Não permitir que tirem fotos ou façam vídeos, pois eles podem ser utilizados para abertura de contas digitais ou contratação de empréstimo por reconhecimento facial;\n" +
                        "Em caso de fraude ou clonagem do cartão, pedir o cancelamento ao banco pelos canais oficiais, triturar o cartão e jogar os restos no lixo;\n" +
                        "Nunca fornecer a senha a outra pessoa;\n" +
                        "Sempre pedir comprovante das operações que realiza com cartões.");
                break;
            case 12:
                System.out.println("Desconfie de ligações ou mensagens recebidas nas quais a pessoa se identifica como sendo funcionário(a) do banco e:\n" +
                        "\n" +
                        "Solicita que o cliente que atendeu o telefone entre no aplicativo instalado no seu aparelho e execute procedimentos de segurança (em geral, eles enviam links ou documentos por e-mail, SMS ou WhatsApp informando sobre compras suspeitas ou com orientações de segurança);\n" +
                        "Envia e-mails para o cliente clique em links ou documentos; ou\n" +
                        "Pede que o cliente efetue o cancelamento de uma compra ou boleto, quando, na verdade, a pessoa/cliente está efetuando o pagamento.\n" +
                        "Com esses artifícios, os golpistas conseguem invadir o celular/aplicativo e contratar operações, realizar saques de valores, pagar faturas entre outras transações.\n" +
                        "\n" +
                        "Se receber uma ligação ou mensagem/e-mail desses ou semelhante, não realize nenhum procedimento, ligue para seu gerente ou entre em contato com os canais oficiais do seu banco para confirmar a informação.");
                break;
            case 13:
                System.out.println("\u200BO único site para saber informações sobre Valores a Receber, inclusive de pessoas falecidas, é https://valoresareceber.bcb.gov.br. Esse serviço é gratuito. \n" +
                        "\n" +
                        "O Banco Central não envia links nem entra em contato com ninguém para tratar sobre valores a receber ou para confirmar dados pessoais. Somente a instituição que aparece na consulta aos valores a receber que pode contatar seu cliente, principalmente no caso de pedido de resgate de valores sem indicar uma chave Pix. Mas ela nunca irá pedir os dados pessoais ou sua senha.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "\n" +
                        "NÃO clicar em links suspeitos enviados por e-mail, SMS, WhatsApp ou Telegram;\n" +
                        "NÃO fazer qualquer tipo de pagamento para ter acesso aos valores;\n" +
                        "NÃO existe a opção de receber algum valor pelo uso de cartões de crédito. Não há lei ou norma do BC sobre recall de cartões de crédito.");
                break;
            case 14:
                System.out.println("Não fazer pagamento antecipado para receber empréstimos, principalmente para conta de pessoa física;\n" +
                        "Desconfiar de ofertas muito abaixo do mercado ou que não façam as exigências comuns em outros bancos;\n" +
                        "Contratar empréstimo, financiamento ou consórcio com instituição autorizada pelo Banco Central;\n" +
                        "Desconfiar se a empresa não fizer consultas ao SPC e à Serasa, por exemplo;\n" +
                        "Desconfiar de links com ofertas de empréstimo ou pedidos de atualização de cadastro encaminhados por SMS, Whatsapp e e-mail ou postados em redes sociais.\n" +
                        "\n" +
                        "É recomendável que o cliente ligue para o gerente ou entre em contato com os canais oficiais do banco para confirmar qualquer informação sobre o assunto.");
                break;
            case 15:
                System.out.println("\u200BO Banco Central:\n" +
                        "\n" +
                        "não faz cobrança de dívidas, taxas, transferências ou pagamento de cheques sem fundos;\n" +
                        "não pede senhas, dados bancários, informações pessoais, cadastramento nem recadastramento em sistemas.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "Não fazer pagamento sem ter certeza da dívida;\n" +
                        "Entrar em contato com o banco onde a dívida foi feita ou que forneceu o cheque;\n" +
                        "Desconfiar se receber ligações de suposto funcionário do BC. O Banco Central só liga para alguém se a pessoa tiver entrado em contato antes;\n" +
                        "Consultar os Relatórios de Empréstimos e Financiamentos e de Cheques Sem Fundos pelo Registrato;\n" +
                        "Em caso de dúvidas, entrar em contato pelo Fale conosco do BC.\n" +
                        "\n" +
                        "O Registrato é acessado com a Conta Gov.br (nível prata ou ouro).");
                break;
            case 16:
                System.out.println("\u200BOs proponentes desse esquema costumam mencionar:\n" +
                        "\n" +
                        "que o BC controla contas bancárias de cidadãos ou empresas que podem ser acessadas através do envio de mensagens Swift (meio padronizado de telecomunicação usado por instituições financeiras em todo o mundo); e\n" +
                        "\n" +
                        "supostos títulos e documentos relativos às Letras do Tesouro Nacional (LTN), utilizados como garantia em operações financeiras falsas.\n" +
                        "\n" +
                        "Além disso, fazem uso de documentos falsos que:\n" +
                        "\n" +
                        "contêm termos como \"Resgate\", \"Aceitação de Valor\" ou \"Carta de Crédito Padrão\";\n" +
                        "\n" +
                        "parecem legítimos e comumente são chamados de \"títulos promissórios\", \"títulos de indenização\", \"títulos de compensação\", \"minutas à vista\" ou \"mandados de controladoria\"; e\n" +
                        "\n" +
                        "mencionam mensagens SWIFT fraudulentas que, frequentemente, misturam terminologia jurídica, nomes de cartórios e autoridades, inclusive do BC, na tentativa de fazer com que a fraude pareça legítima.\n" +
                        "\n" +
                        "Dessa forma, o BC destaca:\n" +
                        "\n" +
                        "as mensagens SWIFT não são utilizadas pelo BC para reconhecimento de crédito ou como garantia em operações financeiras envolvendo pessoas físicas ou jurídicas;\n" +
                        "\n" +
                        "a lei atual proíbe o BC de emitir títulos públicos;\n" +
                        "\n" +
                        "todos os títulos emitidos pelo Tesouro Nacional são negociados e mantidos eletronicamente e não existem no papel (logo, documentos físicos apresentados nas tentativas de fraude não representam dívidas do BC nem dívidas do governo brasileiro); e\n" +
                        "\n" +
                        "que não emite documentos como \"Certidão Conjunta de Valor Atualizado\", \"Certificado de Repactuação\", \"Declaração de Autenticidade\" ou \"Autorização para transporte de ativo financeiro\".\n" +
                        "\n" +
                        "Atenção! Mais informações sobre alertas de fraude relacionados a títulos públicos podem ser obtidas em na página do Tesouro Nacional.\n" +
                        "\n" +
                        "Os casos envolvendo fraudes estão sob investigação da Polícia Federal.");
                break;
            case 17:
                System.out.println("Só juízes e tribunais podem pedir o bloqueio ou o desbloqueio de valores e/ou contas bancárias;\n" +
                        "\n" +
                        "O Banco Central não pode sustar ou atrasar o cumprimento de ordens judiciais e não faz contatos pessoais ou telefônicos para isso;\n" +
                        "\n" +
                        "Caso uma prefeitura receba mensagens desse tipo, é recomendável que ela entre em contato com o órgão do Poder Judiciário que emitiu a ordem e com as autoridades policiais.");
                break;
            case 18:
                System.out.println("\u200BNa área logada do Meu BC você encontra os relatórios do Registrato, o sistema Valores a Receber e muito mais.\n" +
                        "O acesso à área logada do Meu BC é exclusivamente pela página https://www.bcb.gov.br/meubc.\n" +
                        "Todos os serviços do Banco Central para a população são totalmente gratuitos.\n" +
                        "\n" +
                        "O Banco Central não usa advogados nem outros intermediários, não envia links e nem entra em contato para tratar sobre devolução de valores ou para confirmar dados pessoais.\n" +
                        "\n" +
                        "Dicas:\n" +
                        "\n" +
                        "NUNCA realize qualquer tipo de pagamento para ter acesso aos serviços do Banco Central;\n" +
                        "CUIDADO com páginas falsas, todos os serviços do Banco Central estão no site oficial https://www.bcb.gov.br/;\n" +
                        "NÃO clique em links suspeitos enviados por e-mail, SMS, WhatsApp ou Telegram;");
                break;
            default:
                System.out.println("numero invalido! digite um numero entre 1 e 18 para mais informacoes");
                continue;
            }
            break;
        }
    }
}
