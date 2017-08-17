package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b00, b01, b10, b11;
    TextView tv;
    GameGrid grid = new GameGrid();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b00 = (Button)findViewById(R.id.button);
        b01 = (Button)findViewById(R.id.button2);
        b10 = (Button)findViewById(R.id.button3);
        b11 = (Button)findViewById(R.id.button4);
        tv = (TextView)findViewById(R.id.textView);


        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update(b00, 0, 0);
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update(b01, 0, 1);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update(b10, 1, 0);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                update(b11, 1, 1);
            }
        });

    }

    private void update(Button b, int x, int y) {
        if (isVictory()){
            if (grid.getTurn().equals("p1") ) {
                if (grid.getContent(x, y) == 0) {
                    grid.setTurn("p2");
                    b.setText("O");
                    grid.setMessage("hodit P2");
                    tv.setText(grid.getMessage());
                } else {
                    b.setText("1");
                    tv.setText("P1 loooose");
                    grid.setContent(x,y, 5);
                }
            }else if (grid.getTurn().equals("p2")){
                if (grid.getContent(x, y) == 0) {
                    grid.setTurn("p1");
                    b.setText("O");
                    grid.setMessage("hodit P1");
                    tv.setText(grid.getMessage());
                } else {
                    b.setText("1");
                    tv.setText("P2 loooose");
                    grid.setContent(x,y, 5);

                }
            }
            }


        }

    private boolean isVictory() {
        boolean active = true;
        if (grid.getContent(0,1) == 5){
            active = false;
        }
        return active;

    }

}

