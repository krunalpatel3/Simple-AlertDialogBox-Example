package krunal.com.example.alertdialogboxapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSingle,mBtnTwo,mBtnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSingle = findViewById(R.id.buttonSingleBtn);

        mBtnTwo = findViewById(R.id.buttonTwoBtn);

        mBtnThree = findViewById(R.id.buttonThree);


        mBtnSingle.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    MainActivity.this);
            builder.setTitle("Game Over");
            builder.setMessage("Time up Sorry you Did not Complete Challenge!");
            builder.setPositiveButton("OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                        }
                    });
            builder.show();

        });

        mBtnTwo.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(
                    MainActivity.this);
            builder.setTitle("Game Over");
            builder.setMessage("Do you want to Play again!");
            builder.setNegativeButton("NO",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"No is clicked",Toast.LENGTH_LONG).show();
                        }
                    });
            builder.setPositiveButton("YES",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                        }
                    });
            builder.show();
        });

        mBtnThree.setOnClickListener(v -> {

            AlertDialog.Builder builder = new AlertDialog.Builder(
                    MainActivity.this);
            builder.setTitle("Game Over");
            builder.setMessage("Do you want to Play again!");
            builder.setNegativeButton("NO",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"No is clicked",Toast.LENGTH_LONG).show();
                        }
                    });
            builder.setPositiveButton("YES",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"Yes is clicked",Toast.LENGTH_LONG).show();
                        }
                    });
            builder.setNeutralButton("CANCEL",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog,
                                            int which) {
                            Toast.makeText(getApplicationContext(),"Cancel is clicked",Toast.LENGTH_LONG).show();
                        }
                    });

            builder.show();


        });

    }
}
