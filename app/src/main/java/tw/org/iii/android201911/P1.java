package tw.org.iii.android201911;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class P1 extends Fragment {
    private View mainView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_p1, container, false);
        View p1b1 = mainView.findViewById(R.id.p1b1);
        p1b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickB1();
            }
        });


        return mainView;
    }

    private void clickB1(){
        Log.v("brad", "OK2");
    }


}
