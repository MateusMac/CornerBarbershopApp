package com.r2h2solutions.corner.ativities;

import android.os.Bundle;
import android.view.View;

import com.r2h2solutions.corner.R;

/**
 * Classe onde se configura o cadastro do usuário.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class CadastroActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void abrirLogin(View view) {

        openIntent(LoginActivity.class);
    }

    @Override
    protected void onPause() {

        super.onPause();
        finish();
    }
}
