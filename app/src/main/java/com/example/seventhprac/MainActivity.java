package com.example.seventhprac;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    private int day;
    private int month;
    private int year;

    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alertButton = findViewById(R.id.ButtonAlert);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameText = findViewById(R.id.edit_text);
                String name = nameText.getText().toString();
                builder.setTitle("Подтверждение");
                builder.setMessage("Вы уверены что хотите вывести " + name + "?");
                builder.create().show();
            }
        });
    }




    // DatePickerDialog
//    super.onCreate(savedInstanceState); // вызов super.onCreate()
//
//        // Инициализация переменных для текущей даты
//        final Calendar calendar = Calendar.getInstance();
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//
//        // Создание обработчика выбора даты
//        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                // Обработка выбора даты
//                // Например, вывод выбранной даты в Toast
//                Toast.makeText(MainActivity.this, dayOfMonth + "/" + (month+1) + "/" + year, Toast.LENGTH_SHORT).show();
//            }
//        };
//
//        // Создание и отображение DatePickerDialog
//        DatePickerDialog datePickerDialog = new DatePickerDialog(
//                MainActivity.this,
//                dateSetListener,
//                year, // текущий год
//                month, // текущий месяц
//                day); // текущий день
//        datePickerDialog.show();



    // TimePickerDialog
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        textView = findViewById(R.id.textView); // Найти TextView в разметке
//
//        // Инициализация текущего времени
//        hour = 0;
//        minute = 0;
//
//        // Создание и отображение TimePickerDialog
//        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
//            @Override
//            public void onTimeSet(TimePicker view, int hourOfDay, int min) {
//                // Обработка выбранного времени
//                // Пример: установка времени в TextView
//                hour = hourOfDay;
//                minute = min;
//                textView.setText(hour + ":" + minute);
//            }
//        }, hour, minute, true); // Использование 24-часового формата
//        timePickerDialog.show();


    // Alert-Dialog
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Создание строителя диалоговых окон
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//
//        // Установка заголовка и сообщения диалогового окна
//        builder.setTitle("Подтверждение");
//        builder.setMessage("Вы уверены, что хотите выполнить это действие?");
//        builder.setIcon(R.drawable.conf_icon);
//
//        // Установка кнопки "Да" и ее обработчика
//        builder.setPositiveButton("Да", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Запуск сервиса для воспроизведения музыки
//                Intent startIntent = new Intent(MainActivity.this, MusicService.class);
//                startService(startIntent);
//            }
//        });
//
//        // Установка кнопки "Отмена" и ее обработчика
//        builder.setNegativeButton("Отмена", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                // Обработка отмены действия
//                dialog.dismiss();
//            }
//        });
//
//        // Создание и отображение AlertDialog
//        AlertDialog dialog = builder.create();
//        dialog.show();


    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Остановка сервиса и музыки при уничтожении активности
        Intent stopIntent = new Intent(this, MusicService.class);
        stopService(stopIntent);
    }
}