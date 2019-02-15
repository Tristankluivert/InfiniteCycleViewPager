package ng.com.hybrid.infiniteviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> lstImage = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        HorizontalInfiniteCycleViewPager pager = findViewById(R.id.cyclepager);
        myAdapter adapter = new myAdapter(lstImage,getBaseContext());
        pager.setAdapter(adapter)
        ;

    }

    private void initData() {
        lstImage.add(R.drawable.page1);
        lstImage.add(R.drawable.page2);
        lstImage.add(R.drawable.page3);
        lstImage.add(R.drawable.page4);
        lstImage.add(R.drawable.page5);
    }
}
