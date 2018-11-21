package com.r2h2solutions.corner.ativities;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

    public void abrirDialog(View view) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setTitle(getString(R.string.dialog_titulo));
        dialog.setMessage(getString(R.string.dialog_mensagem));
        dialog.setCancelable(false);
        dialog.setIcon(android.R.drawable.ic_dialog_info);

        dialog.setPositiveButton(getString(R.string.sim), new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
                openIntent(MainActivity.class);
                showToast(getString(R.string.info_confirmado_agendamento));
            }
        });

        dialog.setNegativeButton(getString(R.string.nao), new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                showToast(getString(R.string.info_cancelado_agendamento));
            }
        });

        dialog.create();
        dialog.show();
    }
}
