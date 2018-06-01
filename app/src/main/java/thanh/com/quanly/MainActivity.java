package thanh.com.quanly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonDangNhap;
    EditText edtUserName;
    EditText edtPassWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDangNhap = findViewById(R.id.bt_DangNhap);
        edtUserName = findViewById(R.id.edittxt_Username);
        edtPassWord = findViewById(R.id.edittxt_Password);

        buttonDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                String username = edtUserName.getText().toString().trim();
                String password = edtPassWord.getText().toString().trim();

                if (username.equals("imic") && password.equals("123456")){
                    Toast.makeText(MainActivity.this, "thanh cong", Toast.LENGTH_SHORT).show();
                    intent.setAction("openQuanLySinhVien");
                    startActivity(intent);
                }else
                    Toast.makeText(MainActivity.this, "Sai Thông Tin", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
