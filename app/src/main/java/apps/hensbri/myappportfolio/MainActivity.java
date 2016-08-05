package apps.hensbri.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.popular_movies))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast t = Toast.makeText(getApplicationContext(), "Popular Movies", Toast.LENGTH_SHORT);
                        t.show();
                    }
                });

        ((Button) findViewById(R.id.stock_hawk))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast t = Toast.makeText(getApplicationContext(), "Stock Hawk", Toast.LENGTH_SHORT);
                        t.show();
                    }
                });

        ((Button) findViewById(R.id.build_it_bigger))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast t = Toast.makeText(getApplicationContext(), "Build it bigger", Toast.LENGTH_SHORT);
                        t.show();
                    }
                });

        ((Button) findViewById(R.id.make_your_app_material))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast t = Toast.makeText(getApplicationContext(), "Make your app material", Toast.LENGTH_SHORT);
                        t.show();
                    }
                });

        ((Button) findViewById(R.id.go_ubiquitous))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast t = Toast.makeText(getApplicationContext(), "Go Ubiquitous", Toast.LENGTH_SHORT);
                        t.show();
                    }
                });

        ((Button) findViewById(R.id.capstone))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast t = Toast.makeText(getApplicationContext(), "Capstone", Toast.LENGTH_SHORT);
                        t.show();
                    }
                });
    }
}
