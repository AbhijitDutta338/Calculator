package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ip,op;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bexp,badd,bsub,bmul,bdiv,back,eql,ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ip=findViewById(R.id.input);
        op=findViewById(R.id.result);

        back=findViewById(R.id.backspace);
        eql=findViewById(R.id.equal);
        ac=findViewById(R.id.ac);

        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        b0=findViewById(R.id.zero);
        bdot=findViewById(R.id.dot);
        bexp=findViewById(R.id.power);
        badd=findViewById(R.id.add);
        bsub=findViewById(R.id.sub);
        bmul=findViewById(R.id.multiply);
        bdiv=findViewById(R.id.divide);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"1"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"2"));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"3"));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"4"));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"5"));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"6"));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"7"));
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"8"));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"9"));
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"0"));
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"+"));
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"-"));
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"*"));
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"/"));
            }
        });
        bexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"^"));
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText((ip.getText().toString()+"%"));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str;
                str=ip.getText().toString();
                if (str != null && str.length() > 0 ) {
                    str = str.substring(0, str.length() - 1);
                }
                ip.setText(str);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ip.setText("");
                op.setText("0");
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String it;
                it =ip.getText().toString();
                Integer num1,num2;
                char k;
                for (int i = 0; i < it.length(); i++) {
                    if (!Character.isDigit(it.charAt(i))){
                        k=it.charAt(i);
                        num1=Integer.parseInt(it.substring(0, i));
                        num2=Integer.parseInt(it.substring(i+1));

                        switch (k){
                            case '+':   op.setText(Integer.toString((num1+num2)));  break;
                            case '-':   op.setText(Integer.toString((num1-num2)));  break;
                            case '*':   op.setText(Integer.toString((num1*num2)));  break;
                            case '/':   op.setText(Integer.toString((num1/num2)));  break;
                            case '^':   op.setText(Integer.toString((num1^num2)));  break;
                            case '%':   op.setText(Integer.toString((num1%num2)));  break;
                        }
                        break;
                    }

                }


            }
        });

    }
}
