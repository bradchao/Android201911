package tw.org.iii.android201911;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class P1 extends Fragment {
    private MainActivity activity;
    private View mainView;
    private TextView tv1;
    private P2 p2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_p1, container, false);
            tv1 = mainView.findViewById(R.id.P1TV1);
            View p1b1 = mainView.findViewById(R.id.p1b1);
            p1b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickB1();
                }
            });
            View p1b2 = mainView.findViewById(R.id.p1b2);
            p1b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.setTV();
                }
            });
        }


        return mainView;
    }

    private void clickB1(){
        tv1.setText("" + (int)(Math.random()*49+1));

    }

    public void setTV1(){
        tv1.setText("" + (int)(Math.random()*49+1));
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (MainActivity)context;
        p2 = activity.getP2();
    }
}
