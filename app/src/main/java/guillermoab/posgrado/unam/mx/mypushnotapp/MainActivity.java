package guillermoab.posgrado.unam.mx.mypushnotapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import guillermoab.posgrado.unam.mx.mypushnotapp.services.RegistrationIntentService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
