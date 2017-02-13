/***************************************************************************************
 * A questão refere-se regatar um texto e inserir em um TextView a partir de uma URL
 *
 * @author Ack Lay
 *
 * Questão: http://pt.stackoverflow.com/questions/183651/
 *
 ***************************************************************************************/
package me.acklay;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetTextFileByURL extends AppCompatActivity{

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textview);

        new AsyncTask<Void,String,String>(){

            // variavel criada para receber o texto da url
            StringBuilder text = new StringBuilder();
            @Override
            protected String doInBackground(Void... params) {
                try {
                    // Cria uma URL com o arquivo desejado
                    URL url = new URL("https://raw.githubusercontent.com/cleidimarviana/SOpt/master/TEXT/loremipsum.txt");

                    // Ler o texto retornado pelo servidor
                    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                    String str;
                    while ((str = in.readLine()) != null) {
                        // str se refere a linha do texto retornado pelo servido
                        // no entanto o usso do append eh para concatenar todas as linas
                        text.append(str);
                    }
                    in.close();
                } catch (IOException e) {
                        // aqui pode ser inserido uma alerta referente a comunicao
                }
                return text.toString();
            }
            protected void onPostExecute(String results){
                // result é a resposta recebida pelo doInBackGround()
                // entao a linha abaixo define o textview com o resultado esperado
                textview.setText(results);
            }
        }.execute();
    }
}