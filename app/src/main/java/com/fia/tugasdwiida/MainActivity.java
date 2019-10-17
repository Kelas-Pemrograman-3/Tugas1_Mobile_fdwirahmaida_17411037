package com.fia.tugasdwiida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtnpm;
    TextView txtnama;
    TextView txtalamat;
    TextView txtprodi;
    EditText edtnpm;
    EditText edtnama;
    EditText edtalamat;
    EditText edtprodi;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnama = (TextView) findViewById(R.id.txtnama);
        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtprodi = (TextView) findViewById(R.id.txtprodi);
        edtnpm = (EditText) findViewById(R.id.edtnpm);
        edtnama = (EditText) findViewById(R.id.edtnama);
        edtalamat = (EditText) findViewById(R.id.edtalamat);
        edtprodi = (EditText) findViewById(R.id.edtprodi);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

    btnsubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strnpm = edtnpm.getText().toString();
            String strnama = edtnama.getText().toString();
            String stralamat = edtalamat.getText().toString();
            String strprodi = edtprodi.getText().toString();

            txtnpm.setText(strnpm);
            txtnama.setText(strnama);
            txtalamat.setText(stralamat);
            txtprodi.setText(strprodi);

        }
    });
    }
}
