package com.example.user.inf;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RatingBar;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;
public class results extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Button exit,re;
    private OnFragmentInteractionListener mListener;

    public results() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static results newInstance(String param1, String param2) {
        results fragment = new results();
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
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_results,container,false);
        exit=(Button)v.findViewById(R.id.exit);
        re=(Button)v.findViewById(R.id.repeat);
        TextView resB=(TextView)v.findViewById(R.id.resB);
        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("mains",0);
        String s1=sharedPreferences.getString("test1","").toString();
        int k=Integer.parseInt(s1);
        resB.setText(Integer.toString(10*Integer.parseInt(s1))+"%");
        CircularProgressBar circularProgressBar=(CircularProgressBar)v.findViewById(R.id.pR);
        /*circularProgressBar.setColor(ContextCompat.getColor(this, R.color.progressBarColor));
        circularProgressBar.setBackgroundColor(ContextCompat.getColor(this, R.color.backgroundProgressBarColor));
        circularProgressBar.setProgressBarWidth(getResources().getDimension(R.dimen.progressBarWidth));
        circularProgressBar.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.backgroundProgressBarWidth));*/
        int animationDuration = 1000; // 2500ms = 2,5s
        circularProgressBar.setProgressWithAnimation(k*10, animationDuration);
        TextView adv=(TextView)v.findViewById(R.id.adv);
        RatingBar ratingBar=(RatingBar)v.findViewById(R.id.raitB);
        ratingBar.setNumStars(5);
        switch (k){
            case 0:
                ratingBar.setRating(0);
                adv.setText("0 ВЕРНЫХ ОТВЕТОВ!!! ТЫ ДЕЙСТВОВАЛ НАВЯРНЯКА, ДА?!");
            case 1:
            case 2:
                ratingBar.setRating(1);
                adv.setText("Рекомендуем перепройти тест...");
                break;
            case 3:
            case 4:
                ratingBar.setRating(2);
                adv.setText("Неудовлетворительно. Постарайся в следующий раз!");
                break;
            case 5:
            case 6:
ratingBar.setRating(3);
                adv.setText("Неплохо. Рекомендуем внимательнее изучить теорию");
                break;
            case 7:
            case 8:
ratingBar.setRating(4);
                adv.setText("Хорошо! Ты почти достиг отличных результатов!");
                break;
            case 9:
            case 10:
ratingBar.setRating(5);
                adv.setText("Отлично! Поздравляем!");
                break;
        }

        final View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.exit:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new module1()).commit();
                        break;
                    case R.id.repeat:
                        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,new test1()).commit();
                        break;
                }
            }
        };
        exit.setOnClickListener(onClickListener);
        re.setOnClickListener(onClickListener);
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
