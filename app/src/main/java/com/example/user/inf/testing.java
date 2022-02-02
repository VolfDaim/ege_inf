package com.example.user.inf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class testing extends Activity {
    TextView z;
    WebView zz;
    Button ok;
    EditText ans;
    int id,var;
    String[] answers;
    String[] number;
    String[] pAns=new String[23];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        zz=(WebView)findViewById(R.id.zz);
        ok = (Button) findViewById(R.id.ok);
        ans=(EditText)findViewById(R.id.ans);
        id=1;
        var=getIntent().getIntExtra("var",1);
        variant(var);
        zz.loadUrl(number[0]);
        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id==23){
                    pAns[id-1]=ans.getText().toString();
                    Intent intent=new Intent(getApplicationContext(), varRes.class);
                    intent.putExtra("answers",pAns);
                    intent.putExtra("writeAnswers",answers);
                    startActivity(intent);
                }
                else {
                    pAns[id - 1] = ans.getText().toString();
                    zz.loadUrl(number[id]);
                    id++;
                    ans.getText().clear();
                }
            }
        };

        zz.getSettings().setBuiltInZoomControls(true);
        zz.getSettings().setDisplayZoomControls(false);
        ok.setOnClickListener(onClickListener);
    }
    public void variant(int var){
        switch (var) {
            case 1:
                v1();
                break;
        }
}
    public void v1(){
        answers=getResources().getStringArray(R.array.v1);
        number=getResources().getStringArray(R.array.nunber);
    }
}
