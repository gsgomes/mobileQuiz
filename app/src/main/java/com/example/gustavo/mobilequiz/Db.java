package com.example.gustavo.mobilequiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gustavo on 22/10/2016.
 */

public class Db extends SQLiteOpenHelper {
    // Criação do DB v
    private static final int DATABASE_VERSION = 1;
    // Nome do DB
    private static final String DATABASE_NAME = "quiz1";
    // Nome da tabela
    private static final String TABLE_QUEST = "quest";
    // Nome das colunas
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer";
    private static final String KEY_OPTA= "opta";
    private static final String KEY_OPTB= "optb";
    private static final String KEY_OPTC= "optc";
    private SQLiteDatabase dbase;
    public Db(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override

    public void onCreate(SQLiteDatabase db) {
        dbase=db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }
    // Criação do DB ^

    //ADD Perguntas
    private void addQuestions()
    {
        Question q1=new Question(/*Pergunta*/ "Os tipos de transmissão são:",/*Questões*/ "Síncrono, Half-Duplex e Full-Duplex", "Síncrono, Assíncrono e Simplex", "Simplex, Half-Duplex e Full-Duplex",/*Resposta*/ "Simplex, Half-Duplex e Full-Duplex");
        this.addQuestion(q1);

        Question q2=new Question("NÃO é tipo de modulação:", "AM – Amplitude Modulation", "WM – Wave Modulation", "PM – Phase Modulation", "WM – Wave Modulation");
        this.addQuestion(q2);

        Question q3=new Question("Não é um tipo de transmissão por radiofreqüência", "Enlace via Rádio", "Microondas", "N.D.A", "N.D.A.");
        this.addQuestion(q3);

        Question q4=new Question("É recomendado a utilização de cabo UTP para dados a partir de:", "Cat1", "Cat2", "Cat3", "Cat3");
        this.addQuestion(q4);

        Question q5=new Question("Não é um tipo de multiplexação:", "FDM", "ODM", "WDM", "ODM");
        this.addQuestion(q5);

        Question q6=new Question("É um tipo de rede:", "LAN", "VAN", "UAN", "LAN");
        this.addQuestion(q6);

        Question q7=new Question("É um tipo de topologia de redes:", "Secret Token", "Anel", "Paralelo", "Anel");
        this.addQuestion(q7);

        Question q8=new Question("Unificar os meios de conexão para obtenção de mais banda é chamado de:", "Link Absolut", "Link Agregation", "Link do Zelda", "Link Agregation");
        this.addQuestion(q8);

        Question q9=new Question("Os tipos de luz utilizados em fibra ótica são...", "Sol e Laser", "LED e Laser", "Luz de Natal e Fogo", "LED e Laser");
        this.addQuestion(q9);

        Question q10=new Question("A camada de redes é responsável por:", "Verificar o MAC", "Roteamento e Encapsulamento", "Controle dos TPDU’s", "Roteamento e Encapsulamento");
        this.addQuestion(q10);

        Question q11=new Question("Existem 2 tipos de dispositivos de conectividade:", "Espertos e Burros", "Conectáveis e Não Conectáveis", "Gerenciáveis e Não Gerenciáveis", "Gerenciáveis e Não Gerenciáveis");
        this.addQuestion(q11);

        Question q12=new Question("No modelo OSI:", "Camadas do mesmo nível nunca se comunicam", "As camadas inferiores prestam serviço para as camadas superiores", "N.D.A","As camadas inferiores prestam serviço para as camadas superiores");
        this.addQuestion(q12);

        Question q13=new Question("As arquiteturas de rede Ethernet, Token Ring , e FDDI, no modelo OSI, operam na(s) camada(s)", "1 e 3", "1 e 2", "3", "1 e 2");
        this.addQuestion(q13);

        Question q14=new Question("Em quantas camadas se divide o modelo de referência OSI?", "11", "5", "7", "7");
        this.addQuestion(q14);

        Question q15=new Question("Qual dos cabos abaixo foi o primeiro a aparecer na estrutura de rede?", "Cabo coaxial", "Cabo par trançado", "Cabo de fibra óptica", "Cabo coaxial");
        this.addQuestion(q15);

        Question q16=new Question("Quais são os principais protocolos da camada de Transporte?", "POP e TCP", "HTTP e HTTPS", "TCP E UDP", "TCP E UDP");
        this.addQuestion(q16);

        Question q17=new Question("Como é denominado o protocolo de configuração dinâmica de IP?", "DHCP", "FTP", "IP", "DHCP");
        this.addQuestion(q17);

        Question q18=new Question("A qual camada pertence o protocolo IP?", "Enlace", "Rede", "Transporte", "Rede");
        this.addQuestion(q18);

        Question q19=new Question("Na classe padrão C, quantos bytes são reservados para redes?", "3", "5", "1", "3");
        this.addQuestion(q19);

        Question q20=new Question("Como é denominado o dado (PDU) na camada de Aplicação?", "Dado", "Pacote", "Segmento", "Dado");
        this.addQuestion(q20);

        Question q21=new Question("Como é denominado o dado (PDU) na camada de transporte?", "Segmento", "Dado", "Pacote", "Segmento");
        this.addQuestion(q21);

        Question q22=new Question("Qual camada do Modelo OSI é responsável pela correção de erros e fluxo de dados de modo básico?", "Física", "Sessão", "Enlace", "Enlace");
        this.addQuestion(q22);

        Question q23=new Question("O que é P2P?", "Peer-To-Peer", "PlayStation 2 Portátil", "Play-To-Play", "Peer-To-Peer");
        this.addQuestion(q23);

        Question q24=new Question("Qual desses tipos de conexões cobrem cidades?", "MAN", "LAN", "WAN", "MAN");
        this.addQuestion(q24);

        Question q25=new Question("Que nome pode ser dado aos servidores?", "Data Center", "Data Server", "World Data", "Data Center");
        this.addQuestion(q25);

        Question q26=new Question("O que é a tecnologia Broadcast?", "ransmissão aleatória na rede", "Transmissão simultânea para todos os hosts na rede", "ransmissão aleatória no roteador", "Transmissão simultânea para todos os hosts na rede");
        this.addQuestion(q26);

        Question q27=new Question("Quantas camadas tem o modelo padrão TCP/IP?", "3 camadas", "2 camadas", "4 camadas", "4 camadas");
        this.addQuestion(q27);

        Question q28=new Question("O que significa SMTP?", "Simple Mail Transfer Protocol", "Super Mail Transfer Protocol", "Super Mail Timer Protocol", "Simple Mail Transfer Protocol");
        this.addQuestion(q28);

        Question q29=new Question("O que é DML?", "Data Manipulation Language", "Data Multi Language", "Date Manipulation Language", "Data Manipulation Language");
        this.addQuestion(q29);

        Question q30=new Question("O que significa SQL?", "Scrum Query Language", "Super Query Language", "Structure Query Language", "Structure Query Language");
        this.addQuestion(q30);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Dropa a tabela
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Cria a tabela novamente
        onCreate(db);
    }

    // Add novas questões
    public void addQuestion(Question quest) {
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Seleciona todas as Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        return quesList;
    }

    public int rowcount()
    {
        int row=0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row=cursor.getCount();
        return row;
    }
}
