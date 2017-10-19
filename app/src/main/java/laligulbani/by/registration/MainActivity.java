package laligulbani.by.registration;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button log;
    EditText login, password;
    TextView tvLog, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        log = (Button)findViewById(R.id.logButton);
        login = (EditText)findViewById(R.id.loginEditText);
        password = (EditText)findViewById(R.id.passwordEditText);
        tvLog = (TextView)findViewById(R.id.textViewLogin);
        tvPassword = (TextView)findViewById(R.id.textViewPassword);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // new EndpointsAsyncTask().execute(new Pair<Context, String>(MainActivity.this, "Lali"));
                new EndpointsAsyncTask().execute((Runnable) MainActivity.this);
            }
        });
    }
}
