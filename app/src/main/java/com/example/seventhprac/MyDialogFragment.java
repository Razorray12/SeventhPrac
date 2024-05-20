package com.example.seventhprac;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Подтверждение");
        builder.setMessage("Вы уверены, что хотите выполнить это действие?");
        builder.setIcon(R.drawable.conf_icon);
        builder.setNegativeButton("Отмена", null);
        builder.setPositiveButton("Ок", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Обработка нажатия на кнопку "Ок"
            }
        });
        return builder.create();
    }
}