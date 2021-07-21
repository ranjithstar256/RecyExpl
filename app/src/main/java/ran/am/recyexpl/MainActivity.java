package ran.am.recyexpl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ran.am.recyexpl.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding am;
    Bitmap bmp = null;
    LisenDo lisenDo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        am= DataBindingUtil.setContentView(this,R.layout.activity_main);
        am.recyid.setLayoutManager(new LinearLayoutManager(this));

        lisenDo=new LisenDo() {
            @Override
            public void iamdo(int p) {
                Toast.makeText(MainActivity.this, "you have clicked on "+p, Toast.LENGTH_SHORT).show();
            }
        };

        MyAdapter myAdapter = new MyAdapter(lisenDo);
        am.recyid.setAdapter(myAdapter);
        myAdapter.setData(getValues());

    }

    public List<DemoModel> getValues() {

        List<DemoModel> values = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            values.add(new DemoModel((i+5) + "", (i+3) + "", bmp));
        }
        return values;
    }
}