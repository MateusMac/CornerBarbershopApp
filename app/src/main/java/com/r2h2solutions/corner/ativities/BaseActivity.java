package com.r2h2solutions.corner.ativities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Classe base para aplicativos desenvolvidos para a R2H2 Solutions.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void openIntent(Class<?> cls) {

        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

    public void showToast(CharSequence text) {

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void showToast(CharSequence text, int duration) {

        Toast.makeText(this, text, duration).show();
    }
}
