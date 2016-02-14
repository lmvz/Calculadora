package com.example.usuario.calculadora;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bsum,bres,bmul,bdiv,br,blim;
    private EditText val;
    double vec[] = new double[2];
    String op="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b1 = (Button) findViewById(R.id.bt1);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.bt2);
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.bt3);
        b3.setOnClickListener(this);

        b4 = (Button) findViewById(R.id.bt4);
        b4.setOnClickListener(this);

        b5 = (Button) findViewById(R.id.bt5);
        b5.setOnClickListener(this);

        b6 = (Button) findViewById(R.id.bt6);
        b6.setOnClickListener(this);

        b7 = (Button) findViewById(R.id.bt7);
        b7.setOnClickListener(this);

        b8 = (Button) findViewById(R.id.bt8);
        b8.setOnClickListener(this);

        b9 = (Button) findViewById(R.id.bt9);
        b9.setOnClickListener(this);

        b0 = (Button) findViewById(R.id.bt0);
        b0.setOnClickListener(this);

        br = (Button) findViewById(R.id.btr);
        br.setOnClickListener(this);

        blim = (Button) findViewById(R.id.btlim);
        blim.setOnClickListener(this);

        bsum = (Button) findViewById(R.id.btsum);
        bsum.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        TextView ver = (TextView) findViewById(R.id.etver);
        String var = ver.getText().toString();
        int select = v.getId();
        double result;

        try {
            switch (select){
                case R.id.bt0:
                    ver.setText(var+"0");
                    break;
                case R.id.bt1:
                    ver.setText(var+"1");
                    break;
                case R.id.bt2:
                    ver.setText(var+"2");
                    break;
                case R.id.bt3:
                    ver.setText(var+"3");
                    break;
                case R.id.bt4:
                    ver.setText(var+"4");
                    break;
                case R.id.bt5:
                    ver.setText(var+"5");
                    break;
                case R.id.bt6:
                    ver.setText(var+"6");
                    break;
                case R.id.bt7:
                    ver.setText(var+"7");
                    break;
                case R.id.bt8:
                    ver.setText(var+"8");
                    break;
                case R.id.bt9:
                    ver.setText(var+"9");
                    break;
                case R.id.btlim:
                    ver.setText("");
                    vec[0]=0;
                    vec[1]=0;
                    break;
                case R.id.btr:
                    switch (op){
                        case "suma":
                            vec[1] = Double.parseDouble(ver.getText().toString());
                            result = vec[0] + vec[1];
                            ver.setText(String.valueOf(result));
                            break;
                    }
                    break;
                case R.id.btsum:
                    vec[0] = Double.parseDouble(ver.getText().toString());
                    ver.setText("");
                    op="suma";
                    break;
            }
        }catch (Exception e){
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
