package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static id.ac.polinema.intent.BundleActivity.AGE_KEY;
import static id.ac.polinema.intent.BundleActivity.NAME_KEY;
import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        usernameText=findViewById(R.id.text_username);
        nameText=findViewById(R.id.text_name);
        ageText=findViewById(R.id.text_age);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String value=getIntent().getExtras().getString(USERNAME_KEY);
            String value1=getIntent().getExtras().getString(NAME_KEY);
            int value2= getIntent().getExtras().getInt(AGE_KEY);

            usernameText.setText(value);
            nameText.setText(value1);
            ageText.setText(Integer.toString(value2));

        }
    }
}
