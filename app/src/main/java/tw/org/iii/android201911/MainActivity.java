package tw.org.iii.android201911;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private P1 p1;
    private P2 p2;
    private P3 p3;
    private FragmentManager fmgr;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.mainTV);

        p1 = new P1(); p2 = new P2(); p3 = new P3();

        fmgr = getSupportFragmentManager();
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, p1);
        transaction.commit();


    }

//    public void clickB1(View view){
//        Log.v("brad", "OK");
//    }

    public void setTV(){
        tv.setText("Hello, Brad");
    }

    public P1 getP1(){return p1;}
    public P2 getP2(){return p2;}
    public P3 getP3(){return p3;}

    public void toP1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, p1);
        transaction.commit();

        p1.setTV1();
    }
    public void toP2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, p2);
        transaction.commit();
    }
    public void toP3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, p3);
        transaction.commit();
    }
}
