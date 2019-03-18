package hu.bme.aut.publictransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListActivity extends AppCompatActivity {
    public static final int TYPE_BUS = 1;
    public static final int TYPE_TRAIN = 2;
    public static final int TYPE_BIKE = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageButton btnBike = findViewById(R.id.btnBike);
        ImageButton btnBus = findViewById(R.id.btnBus);
        ImageButton btnTrain = findViewById(R.id.btnTrain);
        btnBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
                intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_BIKE);
                startActivity(intent);
            }
        });
        btnBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
                intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_BUS);
                startActivity(intent);
            }
        });
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
                intent.putExtra(DetailsActivity.KEY_TRANSPORT_TYPE, TYPE_TRAIN);
                startActivity(intent);
            }
        });
    }
}
