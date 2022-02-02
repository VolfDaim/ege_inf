package com.example.user.inf;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class test1 extends Fragment {
    TextView tnum,tque;
    RadioButton q1,q2,q3,q4;
    RadioGroup radioGroup;
    Button bsled;
    ProgressBar prb;
    int[] tst=new int[11];
    int[] ans=new int[11];
    int qid=2;
    int check=0;
    int res=0;
    SharedPreferences sharedPreferences;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String var;
    String[] qui=new String[11];
    String[][] va=new String[11][5];
    private OnFragmentInteractionListener mListener;

    public test1() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static test1 newInstance(String param1, String param2) {
        test1 fragment = new test1();
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
        prb=(ProgressBar)getActivity().findViewById(R.id.progressBar);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_test1, container, false);
        tnum = (TextView) v.findViewById(R.id.tnum);
        tque = (TextView) v.findViewById(R.id.tque);
        q1 = (RadioButton) v.findViewById(R.id.q1);
        q2 = (RadioButton) v.findViewById(R.id.q2);
        q3 = (RadioButton) v.findViewById(R.id.q3);
        q4 = (RadioButton) v.findViewById(R.id.q4);
        SharedPreferences testS = getActivity().getSharedPreferences("mains", 0);
        var = testS.getString("t", "");
        radioGroup = (RadioGroup) v.findViewById(R.id.rG);
        bsled = (Button) v.findViewById(R.id.bsled);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.q1:
                        check = 1;
                        break;
                    case R.id.q2:
                        check = 2;
                        break;
                    case R.id.q3:
                        check = 3;
                        break;
                    case R.id.q4:
                        check = 4;
                        break;
                }
            }
        });
        variant();
        tque.setText(qui[1]);
        tnum.setText("Задание 1");
        q1.setText(va[1][1]);q2.setText(va[1][2]);q3.setText(va[1][3]);q4.setText(va[1][4]);
        final View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    if(qid==11){
                        tst[qid-1]=check;
                        prov();
                        sharedPreferences=getActivity().getSharedPreferences("mains",0);
                        SharedPreferences.Editor ed=sharedPreferences.edit();
                        ed.putString("test1",Integer.toString(res));
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new results()).commit();
                    }
                    else {
                        tnum.setText("Задание "+Integer.toString(qid));
                        tst[qid-1]=check;
                        tque.setText(qui[qid]);
                        q1.setText(va[qid][1]);q2.setText(va[qid][2]);q3.setText(va[qid][3]);q4.setText(va[qid][4]);
                    }
                qid++;
            }

        };
        bsled.setOnClickListener(onClickListener);
        return v;
    }
    public void variant(){
        switch (var) {
            case "1":
                v1();
                break;
            case "2":
                v2();
                break;
            case "3":
                v3();
                break;
            case "4":
                v4();
                break;
            case "5":
                v5();
                break;
            case "6":
                v6();
                break;
            case "7":
                v7();
                break;
            case "8":
                v8();
                break;
            case "9":
                v9();
                break;
            case "10":
                v10();
                break;
            case "11":
                v11();
                break;
            case "12":
                v12();
                break;
            case "13":
                v13();
                break;
            case "14":
                v14();
                break;
            case "15":
                v15();
                break;
            case "16":
                v16();
                break;
            case "17":
                v17();
                break;
            case "18":
                v18();
                break;
            case "19":
                v19();
                break;
            case "20":
                v20();
                break;
            case "21":
                v21();
                break;
            case "22":
                v22();
                break;
            case "23":
                v23();
                break;

        }
    }

    public void v1() {
        ans[1]=3;ans[2]=3;ans[3]=3;ans[4]=3;ans[5]=1;ans[6]=2;ans[7]=2;ans[8]=2;ans[9]=2;ans[10]=3;
        qui[1]=getResources().getString(R.string.t1q1);
        qui[2]=getResources().getString(R.string.t1q2);
        qui[3]=getResources().getString(R.string.t1q3);
        qui[4]=getResources().getString(R.string.t1q4);
        qui[5]=getResources().getString(R.string.t1q5);
        qui[6]=getResources().getString(R.string.t1q6);
        qui[7]=getResources().getString(R.string.t1q7);
        qui[8]=getResources().getString(R.string.t1q8);
        qui[9]=getResources().getString(R.string.t1q9);
        qui[10]=getResources().getString(R.string.t1q10);
        va[1][1]="1001011(2)";va[1][2]="1100101(2)";va[1][3]="1010011(2)";va[1][4]="101001(2)";
        va[2][1]="3";va[2][2]="7";va[2][3]="4";va[2][4]="2";
        va[3][1]="301(8)";va[3][2]="650(8)";va[3][3]="407(8)";va[3][4]="777(8)";
        va[4][1]="435(8)";va[4][2]="1577(8)";va[4][3]="5207(8)";va[4][4]="6400(8)";
        va[5][1]="1";va[5][2]="4";va[5][3]="3";va[5][4]="6";
        va[6][1]="10011010(2)";va[6][2]="10011110(2)";va[6][3]="10011111(2)";va[6][4]="11011110(2)";
        va[7][1]="9B(16)";va[7][2]="234(8)";va[7][3]="10011010(2)";va[7][4]="153(10)";
        va[8][1]="1";va[8][2]="11";va[8][3]="3";va[8][4]="33";
        va[9][1]="31(10) * 8(10) + 1(10)";va[9][2]="F0(16) + 1(10)";va[9][3]="351(8)";va[9][4]="11100011(2)";
        va[10][1]="738(16)";va[10][2]="1A4(16)";va[10][3]="1EC(16)";va[10][4]="A56(16)";
    }

    public void v2() {
    }
    public void v3() {
    }
    public void v4() {
    }
    public void v5() {
    }
    public void v6() {
    }
    public void v7() {
    }
    public void v8() {
    }
    public void v9() {
    }
    public void v10() {
    }
    public void v11() {
    }
    public void v12() {
    }
    public void v13() {
    }
    public void v14() {
    }
    public void v15() {
    }
    public void v16() {
    }
    public void v17() {
    }
    public void v18() {
    }
    public void v19() {
    }
    public void v20() {
    }
    public void v21() {
    }
    public void v22() {
    }
    public void v23() {
    }
    public void prov(){
        for(int x=0;x<10;x++){
            if(ans[x+1]==tst[x+1])res++;
        }
    }
    /*
                      prov();

                      break;
              }
          }
      };

      bsled.setOnClickListener(onClickListener);
      return v;


  }

  public void q10(){
      tnum.setText("Вопрос 10");
      tque.setText(getResources().getString(R.string.t1q10));
      radioGroup.clearCheck();

      bsled.setText("Закончить тест");
  }

*/
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
