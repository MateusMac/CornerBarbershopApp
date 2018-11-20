package com.r2h2solutions.corner.ativities;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.r2h2solutions.corner.R;

/**
 * Classe onde se armazena os dados para o Navigation Bottom.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
@SuppressLint("Registered")
public class BottomNavigationActivity extends BaseActivity {

    public BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:

                    openIntent(MainActivity.class);
                    return true;
                case R.id.navigation_agenda:

                    openIntent(AgendaActivity.class);
                    return true;
                case R.id.navigation_portifolio:

                    openIntent(PortfolioActivity.class);
                    return true;
                case R.id.navigation_fidelidade:

                    openIntent(FidelidadeActivity.class);
                    return true;
            }
            return false;
        }
    };
}
