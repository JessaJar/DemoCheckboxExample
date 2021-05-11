package sg.edu.rp.c346.id20014241.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    TextView tvShow;
    Button buttonCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = startActivityIfNeeded(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);
        buttonCheck = findViewById(R.id.buttonCheck);

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbEnabled.isChecked() == true){
                    tvShow.setText("The discount is given");
                }
                else{
                    tvShow.setText("No discount");
                }
            }
        });


    }
}