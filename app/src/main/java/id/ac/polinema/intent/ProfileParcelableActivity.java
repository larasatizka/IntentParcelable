package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

import model.User;

import static id.ac.polinema.intent.BundleActivity.AGE_KEY;
import static id.ac.polinema.intent.BundleActivity.NAME_KEY;
import static id.ac.polinema.intent.BundleActivity.USERNAME_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText=findViewById(R.id.text_username);
        nameText=findViewById(R.id.text_name);
        ageText=findViewById(R.id.text_age);

        // TODO: bind here

        User user=getIntent().getParcelableExtra(USER_KEY);
        if (user != null) {
                Intent intent=getIntent();

                usernameText.setText(user.getUsername());
                nameText.setText(user.getName());
                ageText.setText(Integer.toString(user.getAge()));
        }
    }
}
