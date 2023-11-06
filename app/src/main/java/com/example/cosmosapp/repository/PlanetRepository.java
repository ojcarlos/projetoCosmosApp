package com.example.cosmosapp.repository;

import com.example.cosmosapp.R;
import com.example.cosmosapp.entities.PlanetEntity;

import java.util.ArrayList;
import java.util.List;

public class PlanetRepository {

    private List<PlanetEntity> mList;

    public PlanetRepository() {
        this.mList = new ArrayList<>();
        this.mList.add(new PlanetEntity(0, "Mercurio", "- O menor planeta do nosso sistema solar e mais" +
                " próximo do Sol, Mercúrio é apenas ligeiramente maior que a Lua da Terra. As temperaturas da superfície" +
                " de Mercúrio são extremamente quentes e frias. Como o planeta está tão próximo do Sol, as temperaturas" +
                " diurnas podem atingir máximas de 800°F (430°C). Sem uma atmosfera para reter esse calor durante a " +
                "noite, as temperaturas podem cair até -290°F (-180°C). Da superfície de Mercúrio, o Sol pareceria três" +
                " vezes maior do que quando visto da Terra, e a luz solar seria até sete vezes mais brilhante. Apesar " +
                "da sua proximidade com o Sol, Mercúrio não é o planeta mais quente do nosso sistema solar – esse " +
                "título pertence à vizinha Vénus, graças à sua densa atmosfera. Mas Mercúrio é o planeta mais rápido," +
                " girando em torno do Sol a cada 88 dias terrestres. A superfície de Mercúrio assemelha-se à da Lua da" +
                " Terra, marcada por muitas crateras de impacto resultantes de colisões com meteoróides e cometas." +
                " A primeira espaçonave a visitar Mercúrio foi a Mariner 10, que obteve imagens de cerca de 45%" +
                " da superfície. A missão MErcury Surface, Space ENvironment, GEochemistry, and Ranging (MESSENGER)" +
                " da NASA voou por Mercúrio três vezes em 2008-2009 e orbitou o planeta de 2011 a 2015, mapeando toda " +
                "a superfície."
                , R.drawable.mercurio));
        this.mList.add(new PlanetEntity(1, "Venus", "- Semelhante em tamanho e estrutura à Terra, Vênus foi chamada de gêmea da Terra. No entanto, estes não são gêmeos idênticos – existem diferenças radicais entre os dois mundos. Vênus e a Terra são semelhantes em tamanho, massa, densidade, composição e gravidade. Aí, porém, as semelhanças terminam. Vênus tem uma atmosfera espessa e tóxica cheia de dióxido de carbono e está perpetuamente envolta em nuvens espessas e amareladas compostas principalmente de ácido sulfúrico que retêm o calor, causando um efeito estufa descontrolado. É o planeta mais quente do nosso sistema solar, embora Mercúrio esteja mais próximo do Sol. Vênus tem uma pressão atmosférica esmagadora em sua superfície – mais de 90 vezes a da Terra – semelhante à pressão que você encontraria a um quilômetro e meio abaixo do oceano na Terra. Vênus foi o primeiro planeta a ser explorado por uma espaçonave – a Mariner 2 da NASA voou e escaneou com sucesso o mundo coberto de nuvens em 14 de dezembro de 1962. Desde então, inúmeras espaçonaves dos EUA e de outras agências espaciais exploraram Vênus, incluindo a da NASA. Magellan, que mapeou a superfície do planeta com radar. A antiga União Soviética é a única nação a pousar na superfície de Vênus até o momento, embora a espaçonave não tenha sobrevivido por muito tempo no ambiente hostil."
                , R.drawable.venus));
        this.mList.add(new PlanetEntity(2,"Terra", "-A Terra – nosso planeta natal – é o único lugar que conhecemos até agora que é habitado por seres vivos. É também o único planeta do nosso sistema solar com água líquida na superfície. \n" +
                "- A Terra é apenas o quinto maior planeta do sistema solar, apenas um pouco maior que o vizinho Vénus. A Terra é o maior dos quatro planetas mais próximos do Sol, todos feitos de rocha e metal. A NASA tem o maior número de missões operando em nosso planeta natal. O Sistema de Observação da Terra (EOS) da NASA é uma série coordenada de satélites de órbita polar e de baixa inclinação para observações globais de longo prazo da superfície terrestre, biosfera, Terra sólida, atmosfera e oceanos.",
                R.drawable.terra));
        this.mList.add(new PlanetEntity(3,"Marte", " - O quarto planeta a partir do Sol, Marte é um mundo desértico, frio e empoeirado, com uma atmosfera muito rarefeita. \n" +
                " - Marte foi nomeado pelos antigos romanos em homenagem ao seu deus da guerra porque sua cor avermelhada lembrava sangue. O Planeta Vermelho tem, na verdade, muitas cores. Na superfície vemos cores como marrom, dourado e castanho. A razão pela qual Marte parece avermelhado é devido à oxidação – ou ferrugem – do ferro nas rochas, do regolito (“solo” marciano) e da poeira de Marte. Essa poeira é lançada na atmosfera e à distância faz o planeta parecer quase todo vermelho. Marte é o lar do maior vulcão do sistema solar, o Olympus Mons. É três vezes mais alto que o Monte Everest da Terra, com uma base do tamanho do estado do Novo México. \n" +
                "- Marte parece ter tido um passado aquoso, com antigas redes de vales fluviais, deltas e leitos de lagos, bem como rochas e minerais na superfície que só poderiam ter-se formado em água líquida. Algumas características sugerem que Marte sofreu enormes inundações há cerca de 3,5 mil milhões de anos. Hoje existe água em Marte, mas a atmosfera marciana é demasiado fina para que a água líquida exista durante muito tempo na superfície. Hoje, a água em Marte é encontrada na forma de água gelada logo abaixo da superfície nas regiões polares, bem como em água salgada (salgada), que flui sazonalmente por algumas encostas e paredes de crateras.\n" +
                " - Nenhum planeta além da Terra foi estudado tão intensamente quanto Marte. Hoje, uma frota científica de espaçonaves robóticas estuda Marte de todos os ângulos."
        , R.drawable.marte));
        this.mList.add(new PlanetEntity(4,"Jupiter", "- Júpiter é o quinto planeta a partir do nosso Sol e é, de longe, o maior planeta do sistema solar – mais do dobro da massa de todos os outros planetas combinados. \n" +
                "- As listras e redemoinhos de Júpiter são, na verdade, nuvens frias e ventosas de amônia e água, flutuando em uma atmosfera de hidrogênio e hélio. A icônica Grande Mancha Vermelha de Júpiter é uma tempestade gigante maior que a Terra que dura centenas de anos. Júpiter está rodeado por dezenas de luas. Júpiter também tem vários anéis, mas ao contrário dos famosos anéis de Saturno, os anéis de Júpiter são muito fracos e feitos de poeira, não de gelo. Júpiter tem o dia mais curto do sistema solar. Um dia em Júpiter leva apenas cerca de 10 horas (o tempo que Júpiter leva para girar ou girar uma vez), e Júpiter faz uma órbita completa ao redor do Sol (um ano no horário joviano) em cerca de 12 anos terrestres (4.333 dias terrestres). . Seu equador está inclinado em relação à sua trajetória orbital ao redor do Sol em apenas 3 graus. Isso significa que Júpiter gira quase na vertical e não tem estações tão extremas quanto outros planetas. Júpiter tomou forma quando o resto do sistema solar se formou, há cerca de 4,5 mil milhões de anos, quando a gravidade puxou gás e poeira em turbilhão para se tornar este gigante gasoso. Júpiter ocupou a maior parte da massa que sobrou após a formação do Sol, terminando com mais do dobro do material combinado dos outros corpos do sistema solar. Na verdade, Júpiter tem os mesmos ingredientes de uma estrela, mas não cresceu o suficiente para entrar em ignição."
        , R.drawable.jupiter));
        this.mList.add(new PlanetEntity(5,"Saturno","- Saturno é o sexto planeta a partir do Sol e o segundo maior planeta do nosso sistema solar. Adornado com milhares de lindos cachos, Saturno é único entre os planetas. Não é o único planeta que tem anéis – feitos de pedaços de gelo e rocha – mas nenhum é tão espectacular ou tão complicado como o de Saturno. Como o gigante gasoso Júpiter, Saturno é uma bola enorme feita principalmente de hidrogênio e hélio. \n" +
                "- Rodeado por mais de 140 luas conhecidas, Saturno é o lar de algumas das paisagens mais fascinantes do nosso sistema solar. Dos jatos de água que borrifam de Encélado aos lagos de metano na nebulosa Titã, o sistema de Saturno é uma rica fonte de descobertas científicas e ainda guarda muitos mistérios. O planeta mais distante da Terra descoberto a olho nu, Saturno é conhecido desde então. tempos antigos. O planeta recebeu o nome do deus romano da agricultura e da riqueza, que também era o pai de Júpiter. Acredita-se que os anéis de Saturno sejam pedaços de cometas, asteróides ou luas destruídas que se desintegraram antes de chegarem ao planeta, dilacerados pela poderosa gravidade de Saturno. Eles são feitos de bilhões de pequenos pedaços de gelo e rocha revestidos com outro material, como poeira. As partículas do anel variam principalmente de minúsculos grãos de gelo do tamanho de poeira até pedaços do tamanho de uma casa. Algumas partículas são tão grandes quanto montanhas. Os anéis pareceriam principalmente brancos se você os olhasse do topo das nuvens de Saturno e, curiosamente, cada anel orbita a uma velocidade diferente ao redor do planeta.",
                R.drawable.saturno));
        this.mList.add(new PlanetEntity(6,"Urano", "- O sétimo planeta a partir do Sol e com o terceiro maior diâmetro do nosso sistema solar, Urano é muito frio e ventoso. O gigante gelado é cercado por 13 anéis fracos e 27 pequenas luas enquanto gira em um ângulo de quase 90 graus em relação ao plano de sua órbita. Esta inclinação única faz com que Urano pareça girar de lado, orbitando o Sol como uma bola rolante. Urano é o único planeta cujo equador está quase num ângulo reto com a sua órbita, com uma inclinação de 97,77 graus – possivelmente o resultado de uma colisão com um objeto do tamanho da Terra há muito tempo. Esta inclinação única causa as estações mais extremas do sistema solar. Durante quase um quarto de cada ano uraniano, o Sol brilha diretamente sobre cada pólo, mergulhando a outra metade do planeta num inverno escuro de 21 anos.\n" +
                "Uranus is also one of just two planets that rotate in the opposite direction than most of the planets (Venus is the other one), from east to west.",
                R.drawable.urano));
        //this.mList.add(new PlanetEntity(7,));

    }


    public PlanetEntity get(int id) {
        return this.mList.get(id);
    }

    public List<PlanetEntity> getList() {
        return this.mList;
    }
}
