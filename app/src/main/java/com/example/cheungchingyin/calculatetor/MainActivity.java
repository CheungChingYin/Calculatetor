package com.example.cheungchingyin.calculatetor;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cheungchingyin.util.Operation;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView tvDisplay;
    private TextView tvHistory;
    private Button btnClear;
    private Button btnDel;
    private Button btnMod;
    private Button btnDivide;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnMultiply;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btnMinus;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btnPlus;
    private Button btn0;
    private Button btnPoint;
    private Button btnEquit;
    private String display = "";
    private String history = "";
    private double firstNum = 0.0;
    private double secondNum = 0.0;
    private double result = 0.0;
    private boolean flag = false;
    private String operation = null;
    Operation op = new Operation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tv_display);
        tvHistory = findViewById(R.id.tv_history);
        btnClear = findViewById(R.id.btn_clear);
        btnDel = findViewById(R.id.btn_del);
        btnMod = findViewById(R.id.btn_mod);
        btnDivide = findViewById(R.id.btn_divide);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnMultiply = findViewById(R.id.btn_multiply);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btnMinus = findViewById(R.id.btn_mius);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btnPlus = findViewById(R.id.btn_plus);
        btn0 = findViewById(R.id.btn_0);
        btnPoint = findViewById(R.id.btn_point);
        btnEquit = findViewById(R.id.btn_equit);

        btnClear.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnMod.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnEquit.setOnClickListener(this);
        tvHistory.setMovementMethod(ScrollingMovementMethod.getInstance());


    }

    public void onClick(View v) {

        String str = null;
        switch (v.getId()) {
            case R.id.btn_clear:
                display = "";
                history = "";
                tvHistory.setText(history);
                tvDisplay.setText(display);
                firstNum = 0.0;
                secondNum = 0.0;
                result = 0.0;
                flag = false;
                break;

            case R.id.btn_del:
                if (display.isEmpty()){
                    break;//防止在所有数清除后再按删除键导致闪退
                }else {

                    display = display.substring(0, display.length() - 1);
                    tvDisplay.setText(display);
                    break;
                }

            case R.id.btn_mod:
                if (flag) {
                    break;
                } else {
                    str = tvDisplay.getText().toString();
                    history+=str+"%";
                    firstNum = Double.parseDouble(str);
                    operation = "mod";
                    display = "";
                    tvHistory.setText(history);
                    tvDisplay.setText(display);
                    flag = true;
                    break;
                }

            case R.id.btn_divide:
                if (flag) {
                    break;
                } else {
                    str = tvDisplay.getText().toString();
                    history+=str+"÷";
                    firstNum = Double.parseDouble(str);
                    operation = "divide";
                    display = "";
                    tvHistory.setText(history);
                    tvDisplay.setText(display);
                    flag = true;
                    break;
                }

            case R.id.btn_7:
                display += 7;
                tvDisplay.setText(display);
                break;

            case R.id.btn_8:
                display += 8;
                tvDisplay.setText(display);
                break;

            case R.id.btn_9:
                display += 9;
                tvDisplay.setText(display);
                break;

            case R.id.btn_multiply:
                if (flag) {
                    break;
                } else {
                    str = tvDisplay.getText().toString();
                    history+=str+"×";
                    firstNum = Double.parseDouble(str);
                    operation = "multiply";
                    display = "";
                    tvHistory.setText(history);
                    tvDisplay.setText(display);
                    flag = true;
                    break;
                }

            case R.id.btn_4:
                display += 4;
                tvDisplay.setText(display);
                break;

            case R.id.btn_5:
                display += 5;
                tvDisplay.setText(display);
                break;

            case R.id.btn_6:
                display += 6;
                tvDisplay.setText(display);
                break;

            case R.id.btn_mius:
                if (flag) {
                    break;
                } else {
                    str = tvDisplay.getText().toString();
                    history+=str+"-";
                    firstNum = Double.parseDouble(str);
                    operation = "minus";
                    display = "";
                    tvHistory.setText(history);
                    tvDisplay.setText(display);
                    flag = true;
                    break;
                }

            case R.id.btn_1:
                display += 1;
                tvDisplay.setText(display);
                break;

            case R.id.btn_2:
                display += 2;
                tvDisplay.setText(display);
                break;

            case R.id.btn_3:
                display += 3;
                tvDisplay.setText(display);
                break;

            case R.id.btn_plus:
                if (flag) {
                    break;
                } else {
                    str = tvDisplay.getText().toString();
                    history+=str+"+";
                    firstNum = Double.parseDouble(str);
                    operation = "plus";
                    display = "";
                    tvHistory.setText(history);
                    tvDisplay.setText(display);
                    flag = true;
                    break;
                }

            case R.id.btn_0:
                display += 0;
                tvDisplay.setText(display);
                break;

            case R.id.btn_point:
                display += ".";
                tvDisplay.setText(display);
                break;

            case R.id.btn_equit:
                str = tvDisplay.getText().toString();
                secondNum = Double.parseDouble(str);
                switch (operation) {
                    case "plus":
                        result = op.Plus(firstNum, secondNum);
                        break;

                    case "minus":
                        result = op.Minus(firstNum, secondNum);
                        break;

                    case "multiply":
                        result = op.Multiply(firstNum, secondNum);
                        break;

                    case "divide":
                        result = op.Divide(firstNum, secondNum);
                        break;

                    case "mod":
                        result = op.Mod(firstNum, secondNum);
                        break;

                }
                display = result + "";
                history+=str+"="+result+"\n";
                tvHistory.setText(history);
                tvDisplay.setText(display);
                flag = false;
                break;

        }

    }
}
