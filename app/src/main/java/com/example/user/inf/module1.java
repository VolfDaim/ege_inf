package com.example.user.inf;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class module1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
ScrollView scrollView;
TextView t1,t2;
    SharedPreferences theoryS;
    SharedPreferences.Editor ed;
    SharedPreferences testS;
    private OnFragmentInteractionListener mListener;

    public module1() {
        // Required empty public constructor
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
        View v= inflater.inflate(R.layout.fragment_module1, container, false);
        Button theory1=(Button)v.findViewById(R.id.th1);
        Button kalk=(Button)v.findViewById(R.id.kalk);
        Button test1=(Button)v.findViewById(R.id.test);
        Button theory2=(Button)v.findViewById(R.id.th2);
        Button test2=(Button)v.findViewById(R.id.test2);
        Button test3=(Button)v.findViewById(R.id.test3);
        Button test4=(Button)v.findViewById(R.id.test4);
        Button test5=(Button)v.findViewById(R.id.test5);
        Button test6=(Button)v.findViewById(R.id.test6);
        Button test7=(Button)v.findViewById(R.id.test7);
        Button test8=(Button)v.findViewById(R.id.test8);
        Button test9=(Button)v.findViewById(R.id.test9);
        Button test10=(Button)v.findViewById(R.id.test10);
        Button test11=(Button)v.findViewById(R.id.test11);
        Button test12=(Button)v.findViewById(R.id.test12);
        Button test13=(Button)v.findViewById(R.id.test13);
        Button test14=(Button)v.findViewById(R.id.test14);
        Button test15=(Button)v.findViewById(R.id.test15);
        Button test16=(Button)v.findViewById(R.id.test16);
        Button test17=(Button)v.findViewById(R.id.test17);
        Button test18=(Button)v.findViewById(R.id.test18);
        Button test19=(Button)v.findViewById(R.id.test19);
        Button test20=(Button)v.findViewById(R.id.test20);
        Button test21=(Button)v.findViewById(R.id.test21);
        Button test22=(Button)v.findViewById(R.id.test22);
        Button test23=(Button)v.findViewById(R.id.test23);

        scrollView=(ScrollView)v.findViewById(R.id.scrollView2);
        getActivity().setTitle("Теория");
        View.OnClickListener onclick=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.th1:
                        theoryS=getActivity().getSharedPreferences("mains",0);
                        ed=theoryS.edit();
                        ed.putString("z1","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new t1()).addToBackStack("home").commit();
                        break;
                    case R.id.th2:
                        theoryS=getActivity().getSharedPreferences("mains",0);
                        ed=theoryS.edit();
                        ed.putString("z1","2");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new t1()).addToBackStack("home").commit();
                        break;
                    case R.id.kalk:
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new kalk()).addToBackStack("home").commit();
                        break;
                    case R.id.test:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test2:
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test3:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test4:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test5:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test6:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test7:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test8:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test9:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test10:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test11:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test12:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test13:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test14:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test15:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test16:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test17:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test18:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test19:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test20:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test21:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test22:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                    case R.id.test23:
                        testS=getActivity().getSharedPreferences("mains",0);
                        ed=testS.edit();
                        ed.putString("t","1");
                        ed.commit();
                        getActivity().getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.frame,new test1()).addToBackStack("home").commit();
                        break;
                }
            }
        };
        theory2.setOnClickListener(onclick);
        test2.setOnClickListener(onclick);
        test3.setOnClickListener(onclick);
        test4.setOnClickListener(onclick);
        test5.setOnClickListener(onclick);
        test6.setOnClickListener(onclick);
        test7.setOnClickListener(onclick);
        test8.setOnClickListener(onclick);
        test9.setOnClickListener(onclick);
        test10.setOnClickListener(onclick);
        test11.setOnClickListener(onclick);
        test12.setOnClickListener(onclick);
        test13.setOnClickListener(onclick);
        test14.setOnClickListener(onclick);
        test15.setOnClickListener(onclick);
        test16.setOnClickListener(onclick);
        test17.setOnClickListener(onclick);
        test18.setOnClickListener(onclick);
        test19.setOnClickListener(onclick);
        test20.setOnClickListener(onclick);
        test21.setOnClickListener(onclick);
        test22.setOnClickListener(onclick);
        test23.setOnClickListener(onclick);
        theory1.setOnClickListener(onclick);
        kalk.setOnClickListener(onclick);
        test1.setOnClickListener(onclick);
        return v;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
