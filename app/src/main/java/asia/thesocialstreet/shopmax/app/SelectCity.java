package asia.thesocialstreet.shopmax.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SelectCity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String[] City={"Bangalore","Chennai","Delhi","Gurgaon","Kolkata","Lucknow","Mumbai","Noida"};
        ListAdapter myAdapter2= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,City);
        ListView ListView_City= (ListView) findViewById(R.id.listView_City);
        ListView_City.setAdapter(myAdapter2);
    }

}
