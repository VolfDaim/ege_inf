package com.example.user.inf;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class primer extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public primer() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static primer newInstance(String param1, String param2) {
        primer fragment = new primer();
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

        View v= inflater.inflate(R.layout.fragment_primer, container, false);
        Button b1=(Button)v.findViewById(R.id.b1);
        Button b2=(Button)v.findViewById(R.id.b2);
        Button b3=(Button)v.findViewById(R.id.b3);
        Button b4=(Button)v.findViewById(R.id.b4);
        Button b5=(Button)v.findViewById(R.id.b5);
        Button b6=(Button)v.findViewById(R.id.b6);
        Button b7=(Button)v.findViewById(R.id.b7);
        Button b8=(Button)v.findViewById(R.id.b8);
        Button b9=(Button)v.findViewById(R.id.b9);
        Button b10=(Button)v.findViewById(R.id.b10);
        Button b11=(Button)v.findViewById(R.id.b11);
        Button b12=(Button)v.findViewById(R.id.b12);
        Button b13=(Button)v.findViewById(R.id.b13);
        Button b14=(Button)v.findViewById(R.id.b14);
        Button b15=(Button)v.findViewById(R.id.b15);
        Button b16=(Button)v.findViewById(R.id.b16);
        Button b17=(Button)v.findViewById(R.id.b17);
        Button b18=(Button)v.findViewById(R.id.b18);
        Button b19=(Button)v.findViewById(R.id.b19);
        Button b20=(Button)v.findViewById(R.id.b20);
        Button b21=(Button)v.findViewById(R.id.b21);
        Button b22=(Button)v.findViewById(R.id.b22);
        Button b23=(Button)v.findViewById(R.id.b23);
        final View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences;
                sharedPreferences=getActivity().getSharedPreferences("mains",0);
                SharedPreferences.Editor ed=sharedPreferences.edit();

                switch (view.getId()) {
                    case R.id.b1:
                        ed.putString("z1","r1");
                        break;
                    case R.id.b2:
                        ed.putString("z1","r2");
                        break;
                    case R.id.b3:
                        ed.putString("z1","r3");
                        break;
                    case R.id.b4:
                        ed.putString("zadanie","r4");
                        break;
                    case R.id.b5:
                        ed.putString("zadanie","r5");
                        break;
                    case R.id.b6:
                        ed.putString("zadanie","r6");
                        break;
                    case R.id.b7:
                        ed.putString("zadanie","r7");
                        break;
                    case R.id.b8:
                        ed.putString("zadanie","r8");
                        break;
                    case R.id.b9:
                        ed.putString("zadanie","r9");
                        break;
                    case R.id.b10:
                        ed.putString("zadanie","r10");
                        break;
                    case R.id.b11:
                        ed.putString("zadanie","r11");
                        break;
                    case R.id.b12:
                        ed.putString("zadanie","r12");
                        break;
                    case R.id.b13:
                        ed.putString("zadanie","r13");
                        break;
                    case R.id.b14:
                        ed.putString("zadanie","r14");
                        break;
                    case R.id.b15:
                        ed.putString("zadanie","r15");
                        break;
                    case R.id.b16:
                        ed.putString("zadanie","r16");
                        break;
                    case R.id.b17:
                        ed.putString("zadanie","r17");
                        break;
                    case R.id.b18:
                        ed.putString("zadanie","r18");
                        break;
                    case R.id.b19:
                        ed.putString("zadanie","r19");
                        break;
                    case R.id.b20:
                        ed.putString("zadanie","r20");
                        break;
                    case R.id.b21:
                        ed.putString("zadanie","r21");
                        break;
                    case R.id.b22:
                        ed.putString("zadanie","r22");
                        break;
                    case R.id.b23:
                        ed.putString("zadanie","r23");
                        break;
                }
                ed.commit();
                getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new t1()).addToBackStack("home").commit();
            }
        };

        b1.setOnClickListener(onClickListener);
        b2.setOnClickListener(onClickListener);
        b3.setOnClickListener(onClickListener);
        b4.setOnClickListener(onClickListener);
        b5.setOnClickListener(onClickListener);
        b6.setOnClickListener(onClickListener);
        b7.setOnClickListener(onClickListener);
        b8.setOnClickListener(onClickListener);
        b9.setOnClickListener(onClickListener);
        b10.setOnClickListener(onClickListener);
        b11.setOnClickListener(onClickListener);
        b12.setOnClickListener(onClickListener);
        b13.setOnClickListener(onClickListener);
        b14.setOnClickListener(onClickListener);
        b15.setOnClickListener(onClickListener);
        b16.setOnClickListener(onClickListener);
        b17.setOnClickListener(onClickListener);
        b18.setOnClickListener(onClickListener);
        b19.setOnClickListener(onClickListener);
        b20.setOnClickListener(onClickListener);
        b21.setOnClickListener(onClickListener);
        b22.setOnClickListener(onClickListener);
        b23.setOnClickListener(onClickListener);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
