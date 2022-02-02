package com.example.user.inf;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import static android.content.Context.MODE_PRIVATE;

public class kalk extends Fragment implements OnBackPressedListener{
    Button b1, b2, b3, b4, b5;
    Button b6, b7, b8, b9, b0;
    Button bplus, bmin, bs, bdiv, bres, bclear, bsys;
    Button aB,bB,cB,dB,eB,fB;
    TextView res;
    int a, fromk, tok, p1, p2, prov;double resultk;BigInteger ch1,ch2;
    String chislo1; String chislo2;
    EditText Num1;
    TextView Result;
    Button btnresult;
    EditText From;
    EditText To;
    int checkS=0;
    SharedPreferences pref;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public kalk() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static kalk newInstance(String param1, String param2) {
        kalk fragment = new kalk();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_kalk, container, false);
        Num1 = (EditText) v.findViewById(R.id.edittextnum1);
        TabHost tabHost = (TabHost) v.findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tag1");

        tabSpec.setContent(R.id.tab1);
        tabSpec.setIndicator("Перевод");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setContent(R.id.tab2);
        tabSpec.setIndicator("Калькулятор");
        tabHost.addTab(tabSpec);

        tabHost.setCurrentTab(0);
        From=(EditText)v.findViewById(R.id.from);
        To=(EditText)v.findViewById(R.id.to);
        btnresult = (Button) v.findViewById(R.id.result);
        Result = (TextView) v.findViewById(R.id.textView4);

        res=(TextView)v.findViewById(R.id.tv);
        b1=(Button)v.findViewById(R.id.btOne);
        b2=(Button)v.findViewById(R.id.btTwo);
        b3=(Button)v.findViewById(R.id.btThree);
        b4=(Button)v.findViewById(R.id.btFour);
        b5=(Button)v.findViewById(R.id.btFive);
        b6=(Button)v.findViewById(R.id.btSix);
        b7=(Button)v.findViewById(R.id.btSeven);
        b8=(Button)v.findViewById(R.id.btEight);
        b9=(Button)v.findViewById(R.id.btNine);
        b0=(Button)v.findViewById(R.id.b0);
        bplus=(Button)v.findViewById(R.id.btPlus);
        bmin=(Button)v.findViewById(R.id.btMinus);
        bdiv=(Button)v.findViewById(R.id.bdiv);
        bclear=(Button)v.findViewById(R.id.bclear);
        bres=(Button)v.findViewById(R.id.bres);
        bsys=(Button)v.findViewById(R.id.Bsys);
        bs=(Button)v.findViewById(R.id.bs);
        aB=(Button)v.findViewById(R.id.a);
        bB=(Button)v.findViewById(R.id.b);
        cB=(Button)v.findViewById(R.id.c);
        dB=(Button)v.findViewById(R.id.d);
        eB=(Button)v.findViewById(R.id.e);
        fB=(Button)v.findViewById(R.id.f);
        a=0;p1=0;p2=0;fromk=10;tok=10;resultk=0;chislo1="";chislo2="";
        res.setText("0");

        final View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.result:
                        if (TextUtils.isEmpty(Num1.getText().toString()) ||
                                TextUtils.isEmpty(From.getText().toString()) ||
                                TextUtils.isEmpty(To.getText().toString()))
                            return;
                        boolean b = false;
                        String NUM = Num1.getText().toString();
                        int from = Integer.parseInt(From.getText().toString());
                        int to = Integer.parseInt(To.getText().toString());
                        String result1 = "";
                        try {
                            BigInteger result;
                            result = new BigInteger(NUM, from);
                            result1 = result.toString(to);
                            Result.setText(NUM+"("+Integer.toString(from)+") = "+result1+"("+Integer.toString(to)+")");
                            Result.setTextSize(24*getResources().getDisplayMetrics().density);
                        } catch (NumberFormatException e) {
                            Result.setText("Ошибка! Недопустимые символы для исходной системы счисления!");
                        }
                        break;

                }
            }
        };
        final View.OnClickListener onClickListenerK=new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.btOne:
                        Check(1);
                        break;
                    case R.id.btTwo:
                        Check(2);
                        break;
                    case R.id.btThree:
                        Check(3);
                        break;
                    case R.id.btFour:
                        Check(4);
                        break;
                    case R.id.btFive:
                        Check(5);
                        break;
                    case R.id.btSix:
                        Check(6);
                        break;
                    case R.id.btSeven:
                        Check(7);
                        break;
                    case R.id.btEight:
                        Check(8);
                        break;
                    case R.id.btNine:
                        Check(9);
                        break;
                    case R.id.b0:
                        Check(0);
                        break;
                    case R.id.a:
                        CheckSym("a");
                        break;
                    case R.id.b:
                        CheckSym("b");
                        break;
                    case R.id.c:
                        CheckSym("c");
                        break;
                    case R.id.d:
                        CheckSym("d");
                        break;
                    case R.id.e:
                        CheckSym("e");
                        break;
                    case R.id.f:
                        CheckSym("f");
                        break;
                    case R.id.bclear:
                        p1 = 0;
                        p2 = 0;
                        fromk = 10;
                        tok = 10;
                        resultk = 0;
                        a = 0;
                        res.setText("0");
                        chislo2="";
                        chislo1="";
                        break;
                    case R.id.bdiv:
                        if(a==0)a = 4;
                        res.setText(res.getText().toString()+" / ");
                        break;
                    case R.id.bres:
                        if(checkS>1) {
                            switch (a) {
                                case 1:
                                    resultk = p1 + p2;
                                    break;
                                case 2:
                                    resultk = p1 - p2;
                                    break;
                                case 3:
                                    resultk = p1 * p2;
                                    break;
                                case 4:
                                    resultk = (double) p1 / (double) p2;
                                    break;
                            }
                            if (a != 0) {
                                res.setText(res.getText().toString() + " = " + Double.toString(resultk) + "(10)");
                                res.setTextSize(24*getResources().getDisplayMetrics().density);
                                fromk = 10;
                                tok = 10;
                                p1 = 0;
                                p2 = 0;
                                resultk = 0;
                                a = 0;
                                chislo1 = "";
                                chislo2 = "";
                                checkS=0;
                            }
                        }
                        else Toast.makeText(getContext(),"Введите систему счисления второго числа",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.bs:
                        if(checkS>0) {
                            if (a == 0) a = 3;
                            res.setText(res.getText().toString() + " * ");
                        }
                        else Toast.makeText(getContext(),"Введите систему счисления первого числа",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.btMinus:
                        if(checkS>0) {
                            if (a == 0) a = 2;
                            res.setText(res.getText().toString() + " - ");
                        }
                        else Toast.makeText(getContext(),"Введите систему счисления первого числа",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.btPlus:
                        if(checkS>0) {
                            if (a == 0) a = 1;
                            res.setText(res.getText().toString() + " + ");
                        }
                        else Toast.makeText(getContext(),"Введите систему счисления первого числа",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.Bsys:
                        switch (prov){
                            case 1:
                                LayoutInflater lf = LayoutInflater.from(getActivity());
                                View provview=lf.inflate(R.layout.dialog, null);
                                AlertDialog.Builder DialogBuilder=new AlertDialog.Builder(getActivity());
                                DialogBuilder.setView(provview);
                                final EditText input=(EditText)provview.findViewById(R.id.input_text);
                                DialogBuilder
                                        .setCancelable(false)
                                        .setPositiveButton("Ok",
                                                new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                        String prob=input.getText().toString();
                                                        try{
                                                            fromk=Integer.parseInt(prob);
                                                            ch1 = new BigInteger(chislo1,fromk);
                                                            String s = ch1.toString(10);
                                                            p1 = Integer.parseInt(s);
                                                            res.setText(res.getText().toString()+"("+prob+")");
                                                            Toast.makeText(getContext(),"Задана система счисления первого числа",Toast.LENGTH_LONG).show();
                                                            checkS++;
                                                        }catch (NumberFormatException e){
                                                            prob="";
                                                            Toast.makeText(getContext(),"Неверно задана ситема счисления",Toast.LENGTH_LONG).show();
                                                        }

                                                    }
                                                })
                                        .setNegativeButton("Отмена",
                                                new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                        dialogInterface.cancel();
                                                    }
                                                });
                                AlertDialog alertDialog=DialogBuilder.create();
                                alertDialog.show();
                                break;
                            case 2:
                                LayoutInflater lf2 = LayoutInflater.from(getActivity());
                                View provview2=lf2.inflate(R.layout.dialog, null);
                                AlertDialog.Builder DialogBuilder2=new AlertDialog.Builder(getActivity());
                                DialogBuilder2.setView(provview2);
                                final EditText input2=(EditText)provview2.findViewById(R.id.input_text);
                                DialogBuilder2
                                        .setCancelable(false)
                                        .setPositiveButton("Ok",
                                                new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                        String prob=input2.getText().toString();
                                                        try{
                                                            tok=Integer.parseInt(prob);
                                                            ch2 = new BigInteger(chislo2,tok);
                                                            String s1 = ch2.toString(10);
                                                            p2 = Integer.parseInt(s1);
                                                            res.setText(res.getText().toString()+"("+prob+")");
                                                            checkS++;
                                                            Toast.makeText(getContext(),"Задана система счисления второго числа",Toast.LENGTH_LONG).show();
                                                        }catch (NumberFormatException e){
                                                            prob="";
                                                            Toast.makeText(getContext(),"Неверно задана система счисления",Toast.LENGTH_LONG).show();
                                                        }

                                                    }
                                                })
                                        .setNegativeButton("Отмена",
                                                new DialogInterface.OnClickListener() {
                                                    @Override
                                                    public void onClick(DialogInterface dialogInterface, int i) {
                                                        dialogInterface.cancel();
                                                    }
                                                });
                                AlertDialog alertDialog2=DialogBuilder2.create();
                                alertDialog2.show();
                                break; }
                        break;
                }

            }
            public void CheckSym(String ch){
                if(a==0){
                    chislo1+=ch;res.setText(chislo1);
                }
                else{
                    chislo2+=ch;res.setText(chislo2);
                }
            }
            public void Check(int a1){
                if(a==0){
                    chislo1+=Integer.toString(a1);
                    res.setText(chislo1);
                    prov=1;
                }
                else {
                    chislo2+=Integer.toString(a1);
                    res.setText(res.getText().toString()+Integer.toString(a1));
                    prov=2;
                }}
        };
        btnresult.setOnClickListener(onClickListener);
        b1.setOnClickListener(onClickListenerK);
        b2.setOnClickListener(onClickListenerK);
        b3.setOnClickListener(onClickListenerK);
        b4.setOnClickListener(onClickListenerK);
        b5.setOnClickListener(onClickListenerK);
        b6.setOnClickListener(onClickListenerK);
        b7.setOnClickListener(onClickListenerK);
        b8.setOnClickListener(onClickListenerK);
        b9.setOnClickListener(onClickListenerK);
        b0.setOnClickListener(onClickListenerK);
        bplus.setOnClickListener(onClickListenerK);
        bmin.setOnClickListener(onClickListenerK);
        bdiv.setOnClickListener(onClickListenerK);
        bclear.setOnClickListener(onClickListenerK);
        bres.setOnClickListener(onClickListenerK);
        bsys.setOnClickListener(onClickListenerK);
        bs.setOnClickListener(onClickListenerK);
        aB.setOnClickListener(onClickListenerK);
        bB.setOnClickListener(onClickListenerK);
        cB.setOnClickListener(onClickListenerK);
        dB.setOnClickListener(onClickListenerK);
        eB.setOnClickListener(onClickListenerK);
        fB.setOnClickListener(onClickListenerK);
        return v;
    }
    @Override
    public void onPause() {
        super.onPause();
        pref=getActivity().getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed=pref.edit();
        ed.putString("save",res.getText().toString());
        ed.commit();
    }
    @Override
    public void onResume(){
        super.onResume();
        pref=getActivity().getPreferences(MODE_PRIVATE);
        String saved=pref.getString("save",null);
        res.setText(saved);
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
    @Override
    public void onBackPressed() {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new module1()).commit();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
