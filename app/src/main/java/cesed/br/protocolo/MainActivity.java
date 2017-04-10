package cesed.br.protocolo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAcademico;
    Button btnAdministracao;
    Button btnCoordencao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnAcademico = (Button) findViewById(R.id.btn_academico);
         btnAdministracao = (Button) findViewById(R.id.btn_administracao);
         btnCoordencao = (Button) findViewById(R.id.btn_coordenacao);

        btnAcademico.setOnClickListener(this);
        btnAdministracao.setOnClickListener(this);
        btnCoordencao.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == btnCoordencao){
            startActivity(new Intent(this, Coordenacao.class));
        }
        else if(v == btnAcademico){
            startActivity(new Intent(this, Academico.class));
        }
        else if(v == btnAdministracao){
            startActivity(new Intent(this, Financeiro.class));
        }
    }
}
