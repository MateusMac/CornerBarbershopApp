package com.r2h2solutions.corner.ativities;

import android.os.Bundle;
import android.view.View;

import com.r2h2solutions.corner.R;

/**
 * Classe onde se configura a parte de Login do usuário.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirCadastro(View view) {

        openIntent(CadastroActivity.class);
    }

    public void abrirMenuPrincipal(View view) {

        openIntent(MainActivity.class);
        finish();
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        finish();
    }
}
