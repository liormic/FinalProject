package lastchoice.ely.com.androidlibary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PresentJoke extends AppCompatActivity {
    private String message;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.present_joke_activity);
        message = getIntent().getStringExtra("gce_result");
        textView = findViewById(R.id.tv);
        textView.setText(message);
        
    }
}
