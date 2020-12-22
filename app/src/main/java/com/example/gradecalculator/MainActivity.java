package com.example.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText quizScr = findViewById(R.id.quizScr);
        final EditText hwScr = findViewById(R.id.hwScr);
        final EditText midScr = findViewById(R.id.midScr);
        final EditText finalScr = findViewById(R.id.finalScr);

        final TextView percent = findViewById(R.id.percent);
        final TextView grade = findViewById(R.id.grade);

        Button calcButton = findViewById(R.id.button);
        Button rstButton = findViewById(R.id.rstbutton);

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String qScrSting = quizScr.getText().toString();
                double doubleQuiz = Double.parseDouble(qScrSting);
                String hwScrSting = hwScr.getText().toString();
                double doublehw = Double.parseDouble(hwScrSting);
                String midScrSting = midScr.getText().toString();
                double doublemid = Double.parseDouble(midScrSting);
                String fScrSting = finalScr.getText().toString();
                double doublefinal = Double.parseDouble(fScrSting);

                double total = doubleQuiz+doublehw+doublemid+doublefinal;
                System.out.println(total+"");

                if (total>= 90 && total<=100) {
                    percent.setText("%" + total);
                    percent.setTextColor(Color.GREEN);
                    grade.setText("A");
                    grade.setTextColor(Color.GREEN);
                    grade.setAlpha(0.5f);
                    Toast.makeText(MainActivity.this, "Genius!!", Toast.LENGTH_LONG).show();
                }
                else if (total>= 80 && total<=89) {
                    percent.setText("%" + total);
                    percent.setTextColor(Color.YELLOW);
                    grade.setText("B");
                    grade.setTextColor(Color.YELLOW);
                    grade.setAlpha(0.5f);
                    Toast.makeText(MainActivity.this, "Good!!", Toast.LENGTH_LONG).show();
                }
                else if (total>= 70 && total<=79) {
                    percent.setText("%" + total);
                    percent.setTextColor(Color.parseColor("#FFA500"));
                    grade.setText("C");
                    grade.setTextColor(Color.parseColor("#FFA500"));
                    grade.setAlpha(0.5f);
                    Toast.makeText(MainActivity.this, "Study harder:)", Toast.LENGTH_LONG).show();
                }
                else if  (total>= 60 && total<=69){
                    percent.setText("%" + total);
                    percent.setTextColor(Color.BLUE);
                    grade.setText("D");
                    grade.setTextColor(Color.BLUE);
                    grade.setAlpha(0.5f);
                    Toast.makeText(MainActivity.this, "at least you passed:)", Toast.LENGTH_LONG).show();
                }

                else {
                    percent.setText("%" + total);
                    percent.setTextColor(Color.RED);
                    grade.setText("F");
                    grade.setTextColor(Color.RED);
                    grade.setAlpha(0.5f);
                    Toast.makeText(MainActivity.this, "Never Mind:)", Toast.LENGTH_LONG).show();
                }


            }
        });
rstButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        quizScr.getText().clear();
        hwScr.getText().clear();
        midScr.getText().clear();
        finalScr.getText().clear();

        percent.setText("");
        grade.setText("");

    }
});


    }
}