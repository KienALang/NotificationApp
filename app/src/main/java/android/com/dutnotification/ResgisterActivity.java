package android.com.dutnotification;

import android.com.dutnotification.entities.User;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class ResgisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgister);

        User user = new User();
        EditText userName = (EditText)findViewById(R.id.student_name);

    }
}
