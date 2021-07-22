package kr.hs.emirim.w2036.ex14_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDialog = findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
//            dialog.setTitle(R.string.dialog_title);
//            dialog.setMessage(R.string.dialog_message);
//            dialog.setIcon(R.drawable.warming);
//            dialog.setPositiveButton(R.string.btn_positive, btnPositiveListener);
//            dialog.show();

            new AlertDialog.Builder(MainActivity.this)
            .setTitle(R.string.dialog_title)
            .setMessage(R.string.dialog_message)
            .setIcon(R.drawable.warming)
            .setPositiveButton(R.string.btn_positive, btnPositiveListener)
            .show();
        }
    };

    DialogInterface.OnClickListener btnPositiveListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this, "대화상자 확인 버튼을 클릭하셨어요", Toast.LENGTH_SHORT).show();
        }
    };
}