package solutions.hedron.android_workout_app;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView titleText = (TextView)findViewById(R.id.titleText);
        ImageView mainImage = (ImageView)findViewById(R.id.mainImage);
        LinearLayout mainBg = (LinearLayout)findViewById(R.id.mainBg);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        titleText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)){
            mainImage.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.weight));
            mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            mainImage.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.lotus));
            mainBg.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            mainImage.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.heart));
            mainBg.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
