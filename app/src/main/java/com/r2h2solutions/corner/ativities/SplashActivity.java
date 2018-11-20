package com.r2h2solutions.corner.ativities;

import android.os.Bundle;
import android.os.Handler;

import com.r2h2solutions.corner.R;

/**
 * Classe para tela de Splash do App Corner.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class SplashActivity extends BaseActivity {

    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                finish();
                openIntent(LoginActivity.class);
            }
        }, SPLASH_TIME_OUT);
    }
}
