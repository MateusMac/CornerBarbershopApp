package com.r2h2solutions.corner.ativities;

import android.os.Bundle;
import android.view.View;

import com.r2h2solutions.corner.R;

/**
 * Classe para a Home do App Corner.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirPortfolio(View view) {

        //openIntent(PortfolioActivity.class);
    }

    public void abrirAgenda(View view) {

        //openIntent(AgendaActivity.class);
    }

    public void abrirFidelidade(View view) {

        //openIntent(FidelidadeActivity.class);
    }
}
