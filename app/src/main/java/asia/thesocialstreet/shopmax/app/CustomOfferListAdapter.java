package asia.thesocialstreet.shopmax.app;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DELL on 6/17/2016.
 */
class CustomOfferListAdapter extends ArrayAdapter<String> {

    public CustomOfferListAdapter(Context context, String[] offers) {
        super(context,R.layout.customofferlist ,offers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater offerInflator = LayoutInflater.from(getContext());
        View customView = offerInflator.inflate(R.layout.customofferlist, parent, false);

        String singleOfferItem = getItem(position);
        TextView offerText = (TextView) customView.findViewById(R.id.customoffertext);
        ImageView offerImage = (ImageView) customView.findViewById(R.id.customofferimage);

        offerText.setText(singleOfferItem);
        offerImage.setImageResource(R.drawable.offer);
        return customView;
    }
}
