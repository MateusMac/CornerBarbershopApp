package com.r2h2solutions.corner.ativities;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;

import com.r2h2solutions.corner.R;

/**
 * Classe para definições da Activity de fidelidade.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class FidelidadeActivity extends BottomNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fidelidade);

        BottomNavigationView navigation = findViewById(R.id.navigation_bottom);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
