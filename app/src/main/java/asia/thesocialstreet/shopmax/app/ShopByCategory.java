package asia.thesocialstreet.shopmax.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ShopByCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_by_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] Category={"Appliances","Beauty","Books","Clothing","Computer & Accessories","Electronics","Furniture","Grocery","Kitchen","Jewellery","Toys","Video games"};
        ListAdapter myAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Category);
        ListView ListView_Category= (ListView) findViewById(R.id.listView_Category);
        ListView_Category.setAdapter(myAdapter);

        ListView_Category.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String category = String.valueOf(parent.getItemAtPosition(position));


                        //code specific to first list item
                        Intent myIntent = new Intent(view.getContext(), CategoryOffers.class);
                        startActivityForResult(myIntent, 0);



                    }
                }
        );


    }

}
