package com.example.redfame.finalexamcpsu2016;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //    loginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        loginDataBaseAdapter=new loginDataBaseAdapter(this);
//        loginDataBaseAdapter=loginDataBaseAdapter.open();


        Button buttonREs = (Button) findViewById(R.id.button_res);
        buttonREs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


//        final EditText editTextUserName=(EditText)findViewById(R.id.editTextUserNameToLogin);
//        final  EditText editTextPassword=(EditText)findViewById(R.id.editTextPasswordToLogin);
//       Button buttonLog = (Button)findViewById(R.id.button_login);
//        buttonLog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String userName= editTextUserName.getText().toString();
//                String password= editTextPassword.getText().toString();
//
//                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);
//
//                if(password.equals(storedPassword))
//                {
//                 Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                  startActivity(intent);
//
//                }
//                else
//                {
//                    Toast.makeText(LoginActivity.this, "Imalid username or password", Toast.LENGTH_LONG).show();
//                }
//
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
}
