package sg.edu.np.mad.madpractical;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User ("XinYin", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua bfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnjbfhewjdqwfbehqdwnkjbfehdwkdjbcqdwnj.", 1, true);

        // get name
        TextView name = findViewById(R.id.textView2);
        name.setText(user.name);

        // get desc
        TextView desc = findViewById(R.id.textView);
        desc.setText((user.description));

        // toggle follow & unfollow button
        Button followBtn = findViewById(R.id.button);
        followBtn.setOnClickListener(v -> {
            user.followed = !user.followed;
            followBtn.setText(user.followed ? "UNFOLLOW" : "FOLLOW");
        });
    }
}