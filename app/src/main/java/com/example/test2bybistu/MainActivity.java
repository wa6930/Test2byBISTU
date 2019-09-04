package com.example.test2bybistu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                final EditText userId=new EditText(MainActivity.this);
//                final EditText Inpwd=new EditText(MainActivity.this);
                AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("登陆");
                LayoutInflater myLayout=getLayoutInflater();//获得layout
                final View view1=myLayout.inflate(R.layout.my_layout,null);//通过dialog获得视图
                dialog.setView(view1);
                //setContentView(R.layout.my_layout);
//                dialog.setView(userId);
//                dialog.setView(Inpwd);
                dialog.setPositiveButton("登陆", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(MainActivity.this,"填写确定监听事件",Toast.LENGTH_SHORT).show();
                        EditText useEdit=(EditText)view1.findViewById(R.id.useId);
                        EditText pwdEdit=(EditText)view1.findViewById(R.id.pwdId);
                        String use=useEdit.getText().toString();
                        String pwd=pwdEdit.getText().toString();
                        if(use.equals("abc")&&pwd.equals("123"))
                        Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                        else Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();




                    }
                });

                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //finish();
                    }
                });
                dialog.show();
            }

        });
    }
}
