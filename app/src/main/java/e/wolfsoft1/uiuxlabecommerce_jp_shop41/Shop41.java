package e.wolfsoft1.uiuxlabecommerce_jp_shop41;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop41.adapter.ColorAdapter_41;
import e.wolfsoft1.uiuxlabecommerce_jp_shop41.adapter.SizeAdapter_41;
import e.wolfsoft1.uiuxlabecommerce_jp_shop41.model.Color_Model_41;
import e.wolfsoft1.uiuxlabecommerce_jp_shop41.model.Size_Model_41;

public class Shop41 extends AppCompatActivity {

    private String size[] = {"SL", "X", "XL", "XS", "LS"};
    private Integer color[] = {R.drawable.ic_color41_1, R.drawable.ic_color41_2, R.drawable.ic_color41_3,R.drawable.ic_color41_4,R.drawable.ic_color41_5,R.drawable.ic_color41_6};

    RecyclerView color_recyclerview41, size_recyclerview41;

    ArrayList<Size_Model_41> size_modelArrayList;
    ArrayList<Color_Model_41> color_modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop41);

        size_recyclerview41 = findViewById(R.id.size_recyclerview41);
        color_recyclerview41 = findViewById(R.id.color_recyclerview41);

        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model_41 size_model = new Size_Model_41(size[i]);
            size_modelArrayList.add(size_model);
        }
        color_modelArrayList = new ArrayList<>();

        for (int i = 0; i < color.length; i++) {
            Color_Model_41 color_model = new Color_Model_41(color[i]);
            color_modelArrayList.add(color_model);
        }

        size_recyclerview41.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_41 sizeAdapter = new SizeAdapter_41(this, size_modelArrayList);
        size_recyclerview41.setAdapter(sizeAdapter);

        color_recyclerview41.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_41 adapter = new ColorAdapter_41(this, color_modelArrayList);
        color_recyclerview41.setAdapter(adapter);
    }
}
