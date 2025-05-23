import futebol.campeonatos.Campeonato;
import futebol.pessoa_fisica.Arbitro;
import futebol.pessoa_fisica.Jogador;
import futebol.pessoa_fisica.Tecnico;
import futebol.pessoa_juridica.Equipe;
import futebol.pessoa_juridica.Federacao;
import futebol.pessoa_juridica.Patrocinador;

public class Main {
    public static void main(String[] args) {

        // inserindo técnicos
        Tecnico tecnico1 = new Tecnico("Mourinho",62,111111,"Português");
        Tecnico tecnico2 = new Tecnico("Guardiola",54,222222,"Espanhol");
        Tecnico tecnico3 = new Tecnico("Ancelotti",65,333333,"Italiano");
        Tecnico tecnico4 = new Tecnico("Xabi Alonso",43,444444,"Espanhol");
        Tecnico tecnico5 = new Tecnico("Filipe Luís",39,555555,"Brasileiro");

        // inserindo equipes
        Equipe equipe1 = new Equipe("Fenerbahce",11111,1907,"Turquia");
        tecnico1.contratar(equipe1);
        Equipe equipe2 = new Equipe("Manchester City",22222,1894,"Inglaterra");
        tecnico2.contratar(equipe2);
        Equipe equipe3 = new Equipe("Real Madrid",33333,1902,"Espanha");
        tecnico3.contratar(equipe3);
        Equipe equipe4 = new Equipe("Bayer Leverkusen",44444,1904,"Alemanha");
        tecnico4.contratar(equipe4);
        Equipe equipe5 = new Equipe("Flamengo",55555,1895,"Brasil");
        tecnico5.contratar(equipe5);

        // inserindo jogadores
        // fenerbahce
        Jogador jogador01 = new Jogador("Talisca",31,100000,"Brasileiro","Atacante");
        jogador01.contratar(equipe1);
        Jogador jogador02 = new Jogador("Skriniar",30,150000,"Eslovaco","Defensor");
        jogador02.contratar(equipe1);
        Jogador jogador03 = new Jogador("Dzeko",39,180000,"Bósnio","Atacante");
        jogador03.contratar(equipe1);

        // manchester city
        Jogador jogador04 = new Jogador("De Bruyne",33,200000,"Belga","Meia");
        jogador04.contratar(equipe2);
        Jogador jogador05 = new Jogador("Doku",22,250000,"Belga","Atacante");
        jogador05.contratar(equipe2);
        Jogador jogador06 = new Jogador("Ederson",31,280000,"Brasileiro","Goleiro");
        jogador06.contratar(equipe2);

        // real madrid
        Jogador jogador07 = new Jogador("Vinícius Júnior",24,300000,"Brasileiro","Atacante");
        jogador07.contratar(equipe3);
        Jogador jogador08 = new Jogador("Modric",39,350000,"Croata","Meia");
        jogador08.contratar(equipe3);
        Jogador jogador09 = new Jogador("Courtois",32,380000,"Belga","Goleiro");
        jogador09.contratar(equipe3);

        // bayer leverkusen
        Jogador jogador10 = new Jogador("Frimpong",24,400000,"Holandês","Defensor");
        jogador10.contratar(equipe4);
        Jogador jogador11 = new Jogador("Wirtz",22,450000,"Alemão","Meia");
        jogador11.contratar(equipe4);
        Jogador jogador12 = new Jogador("Tah",29,480000,"Alemão","Defensor");
        jogador12.contratar(equipe4);

        // flamengo
        Jogador jogador13 = new Jogador("Rossi",29,500000,"Argentino","Goleiro");
        jogador13.contratar(equipe5);
        Jogador jogador14 = new Jogador("Arrascaeta",30,550000,"Uruguaio","Meia");
        jogador14.contratar(equipe5);
        Jogador jogador15 = new Jogador("Pedro",27,580000,"Brasileiro","Atacante");
        jogador15.contratar(equipe5);

        // inserindo patrocinadores
        Patrocinador patrocinador1 = new Patrocinador("Puma",10000);
        Patrocinador patrocinador2 = new Patrocinador("Etihad Airways",20000);
        Patrocinador patrocinador3 = new Patrocinador("Fly Emirates",30000);
        Patrocinador patrocinador4 = new Patrocinador("Bayer",40000);
        Patrocinador patrocinador5 = new Patrocinador("PixBet",50000);

        // inserindo patrocínios às equipes
        patrocinador1.contratar(equipe1,30000000);
        patrocinador1.contratar(equipe2, 65000000);
        patrocinador2.contratar(equipe2, 400000000);
        patrocinador3.contratar(equipe3, 70000000);
        patrocinador4.contratar(equipe4, 30000000);
        patrocinador5.contratar(equipe5,23000000);

        // teste da silva
        equipe1.mostrarInfo();
        equipe2.mostrarInfo();
        equipe3.mostrarInfo();
        equipe4.mostrarInfo();
        equipe5.mostrarInfo();

//        Jogador jogador1 = new Jogador("Vinicius",23,789987,"brasileiro","ponta esquerdo");
//        Equipe equipe1 = new Equipe("Real Madrid",11111,1900,"Espanha");
//        Tecnico tecnico1 = new Tecnico("Ancelloti",60,756489,"italiano");
//        Patrocinador patrocinador1 = new Patrocinador("aaa",22222);
//        Arbitro arbitro1 = new Arbitro("Junior",46,77777);
//        Federacao federacao1 = new Federacao("FIFA",44444);
//        Campeonato campeonato1 = new Campeonato("Mundial","Mundo",1000000);
//
//        equipe1.adicionarCampeonato(campeonato1);
//        federacao1.adicionarCampeonato(campeonato1);
//        arbitro1.contratar(federacao1);
//        patrocinador1.contratar(equipe1,1000);
//        tecnico3.contratar(equipe1);
//        jogador1.contratar(equipe1);
//        equipe1.mostrarInfo();
//
//        Bruxo bruxo1 = new Bruxo("Harry Potter",20,"masculino");
//        Varinha varinha1 = new Varinha("Varinha de azevinho");
//        Varinha varinha2 = new Varinha("Varinha das Varinhas ");
//        bruxo1.adicionaVarinha(varinha1);
//        bruxo1.adicionaVarinha(varinha2);
//        bruxo1.mostrarInfos();

    }
}