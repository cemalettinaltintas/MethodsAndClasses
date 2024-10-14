package com.cemalettinaltintas.methodsandclasses;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText number;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        System.out.println("X of Value :"+newMethod(5));

        Student yigit=new Student("Yigit","Mevsim",16);
        Student nurullah=new Student("Nurullah","Seyh Musa",17);
        Student mustafa=new Student("Mustafa","Sinc",18);


        ArrayList<Student> students=new ArrayList<>();
        students.add(yigit);

        students.add(nurullah);
        students.add(mustafa);

        for (Student student:students){
            System.out.println("Adi :"+student.getName()+" Yas :"+student.getAge());
        }
    }

    public int newMethod(int x){
        return x*10;
    }
    public void hesapla(View view){
        number=findViewById(R.id.numberText);
        result=findViewById(R.id.resultTextView);
        int sayi=Integer.parseInt(number.getText().toString());
        result.setText("Karesi :"+sayi*sayi);
    }
}