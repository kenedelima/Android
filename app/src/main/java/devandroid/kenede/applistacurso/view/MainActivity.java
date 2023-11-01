package devandroid.kenede.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.kenede.applistacurso.R;
import devandroid.kenede.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa; // Declaração objeto pessoa
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


    // Metodo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Atribuir conteudo, dados, valores para o objeto
        // Conforme o seu MODELO, TEMPLATE
        pessoa = new Pessoa(); // Cria o objeto pessoa
        pessoa.setPrimeiroNome("kenede");
        pessoa.setSobreNome("Lima");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("81-99963-8745");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Luiz");
        outraPessoa.setSobreNome("Alves");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("81-99963-0011");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += "Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += "Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += "Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        int parada = 0;

    }
}