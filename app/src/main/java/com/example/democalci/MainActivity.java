package com.example.democalci;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.annotation.IntegerRes;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    Button division;
    Button multiply;
    Button substract;
    Button add;
    Button number0;
    Button number1;
    Button number2;
    Button number3;
    Button number4;
    Button number5;
    Button number6;
    Button number7;
    Button number8;
    Button number9;
    Button numberC;
    Button equal;
    String result;
    String tmp;
    String operator;
    TextView resultTextView;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
        initControlListener();
    }
    private void initControl() {
        number0 = (Button)findViewById(R.id.number0);
        number1 = (Button)findViewById(R.id.number1);
        number2 = (Button)findViewById(R.id.number2);
        number3= (Button)findViewById(R.id.number3);
        number4 = (Button)findViewById(R.id.number4);
        number5 = (Button)findViewById(R.id.number5);
        number6 = (Button)findViewById(R.id.number6);
        number7= (Button)findViewById(R.id.number7);
        number8= (Button)findViewById(R.id.number8);
        number9= (Button)findViewById(R.id.number9);
        add= (Button)findViewById(R.id.add);
        numberC = (Button)findViewById(R.id.numberC);
        substract = (Button)findViewById(R.id.substract);
        multiply = (Button)findViewById(R.id.multiply);
        division = (Button)findViewById(R.id.division);
        equal = (Button)findViewById(R.id.equal);
        resultTextView = (TextView)findViewById(R.id.text_view_result);
    }
    private void initControlListener() {
       number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("0");
            }
        });
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("1");
            }
        });
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("2");
            }
        });
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("3");
            }
        });
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("4");
            }
        });
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("5");
            }
        });
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("6");
            }
        });
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("7");
            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("8");
            }
        });
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNumberButtonClicked("9");
            }
        });

        numberC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClearButtonClicked();
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                onOperatorButtonClicked("-");
            }
        });
         add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("+");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("X");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onOperatorButtonClicked("/");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onEqualButtonClicked();
            }
        });

    }

    private void onEqualButtonClicked() {
        int res = 0;
        try {
            int number = Integer.parseInt(tmp);
            int number2 = Integer.parseInt(resultTextView.getText().toString());
            switch (operator) {
                case "+":
                    res = number + number2;
                    break;
                case "/":
                    res = number / number2;
                    break;
                case "-":
                    res = number - number2;
                    break;
                case "X":
                    res = number * number2;
                    break;


            }
            result = String.valueOf(res);
            resultTextView.setText(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void onOperatorButtonClicked(String operator) {
        tmp = resultTextView.getText().toString();
        onClearButtonClicked();
        this.operator = operator;
    }

    private void onClearButtonClicked() {
        result = "";
        resultTextView.setText("");
    }

    private void onNumberButtonClicked(String pos) {
        result = resultTextView.getText().toString();
        result = result + pos;
        resultTextView.setText(result);
    }


}