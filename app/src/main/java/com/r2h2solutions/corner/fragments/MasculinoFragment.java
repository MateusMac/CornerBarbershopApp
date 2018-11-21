package com.r2h2solutions.corner.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.r2h2solutions.corner.R;

/**
 * Classe para definições do fragment dos serviços masculinos.
 *
 * @author Mateus Vieira Machado
 * @version 1.0.0
 * @since 1.0.0
 */
public class MasculinoFragment extends Fragment {

    public MasculinoFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_masculino, container, false);
    }
}
