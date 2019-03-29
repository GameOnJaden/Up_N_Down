package com.firstt1.atul.up_n_down;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    TextView Num_s;
    Button Up,Down,Reset_to_0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null)
        {
            num = savedInstanceState.getInt("Up_Num");
            num = savedInstanceState.getInt("Down_Num");

        }

        Up = (Button)findViewById(R.id.Up_Button);
        Down = (Button)findViewById(R.id.Down_Button);
        Reset_to_0 = (Button)findViewById(R.id.Reset_Button);

        Num_s = (TextView)findViewById(R.id.num_S);

        Num_s.setText(Integer.toString(num));

        Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Up_N_Down","Up is clicked");

                if(num>=0)
                {
                    num = num + 1;
                    Num_s.setText(Integer.toString(num));
                }


            }

        });

        Down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Up_N_Down","Down is clicked");

                if(num>0)
                {
                    num = num - 1;
                    Num_s.setText(Integer.toString(num));
                }



            }
        });

        Reset_to_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Up_N_Down","Reset_Button is clicked");

                num = 0;
                Num_s.setText(Integer.toString(num));

            }
        });



    }

    @Override
    public void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);

        outState.putInt("Up_Num",num);

        outState.putInt("Down_Num",num);
    }
}
