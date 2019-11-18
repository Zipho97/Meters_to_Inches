package com.example.meters_to_inches;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputM;
    private Button btnConvert;
    private TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputM = (EditText)findViewById(R.id.editText);
        btnConvert =  (Button)findViewById(R.id.btnConvert);
        res = (TextView)findViewById(R.id.result);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // convert logic
                double m = 39.37;
                double r = 0.0;

                double z = Double.parseDouble(inputM.getText().toString());

                r = z*m;

                res.setText(Double.toString(r));
            }
        });
    }
}
