package com.r2h2solutions.corner.ativities;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.r2h2solutions.corner.R;
import com.r2h2solutions.corner.fragments.FemininoFragment;
import com.r2h2solutions.corner.fragments.MasculinoFragment;

/**
 * Classe para definições da Activity de serviços.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class ServicoActivity extends BaseActivity {

    private MasculinoFragment masculinoFragment = null;
    private FemininoFragment femininoFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servico);

        masculinoFragment = new MasculinoFragment();
        femininoFragment = new FemininoFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameServico, masculinoFragment);
        transaction.commit();
    }

    public void abrirMasculino(View view) {

        FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
        transaction2.replace(R.id.frameServico, masculinoFragment);
        transaction2.commit();
    }

    public void abrirFeminino(View view) {

        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
        transaction3.replace(R.id.frameServico, femininoFragment);
        transaction3.commit();
    }

    public void abrirMain(View view) {

        openIntent(MainActivity.class);
        showToast("Serviço agendado com sucesso.");
    }
}
